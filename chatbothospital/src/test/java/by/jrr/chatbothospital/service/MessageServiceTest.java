package by.jrr.chatbothospital.service;

import by.jrr.chatbothospital.ChatBotHospitalApplicationTests;
import by.jrr.chatbothospital.logic.Hospital;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageServiceTest extends ChatBotHospitalApplicationTests {

    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    MessageService messageService;
    @Autowired
    RequestDispatcher requestDispatcher;
    @Autowired
    Hospital hospital;


    @Test
    void onUpdateReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        SendMessage actualResult = requestDispatcher.dispatch(update);
        SendMessage expectedResult = makeMessage("Sorry, I don't understand you...");
        assertEquals(actualResult, expectedResult);
    }


    @Test
    void onStartReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/start.json"), Update.class);
        SendMessage actualResult = requestDispatcher.dispatch(update);
        SendMessage expectedResult = makeMessage("Добро пожаловать в ChatBotHospital! \uD83D\uDE0A\n" +
                "\n" +
                "Я чат-бот который поможет Вам быстро и просто записаться на прием к врачу:\n" +
                "\n" +
                "Прямо из дома Вы сможете записаться онлайн на прием к нужному специалисту, а также узнать ориентировочное время ожидания и свою позицию в очереди. Многочасовое ожидание своей очереди и бесконечные звонки в регистратуру, чтобы записаться на прием останутся в прошлом \uD83D\uDE09\n" +
                "\n" +
                "❗️Список команд\n" +
                "/doctor - посмотреть список врачей и записаться\n" +
                "/settings - просмотреть текущие настройки\n" +
                "/help - помощь\n");
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void onHelpReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/help.json"), Update.class);
        SendMessage actualResult = requestDispatcher.dispatch(update);
        SendMessage expectedResult = makeMessage("Добро пожаловать в ChatBotHospital! \uD83D\uDE0A\n" +
                "\n" +
                "Я чат-бот который поможет Вам быстро и просто записаться на прием к врачу:\n" +
                "\n" +
                "❗️Список команд\n" +
                "/doctor - посмотреть список врачей и записаться\n" +
                "/settings - просмотреть текущие настройки\n" +
                "/help - помощь\n");
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void onSettingReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/settings.json"), Update.class);
        SendMessage actualResult = requestDispatcher.dispatch(update);
        SendMessage expectedResult = makeMessage("Nothing you can set now, sorry...");
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void onNoneReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/none.json"), Update.class);
        SendMessage actualResult = requestDispatcher.dispatch(update);
        SendMessage expectedResult = makeMessage("Sorry, I don't understand you...");
        assertEquals(actualResult, expectedResult);
    }
    @Test
    void onInlineKeyboard() throws IOException {
        Hospital hospital = new Hospital();
        Update update = objectMapper.readValue(new File("src/test/resources/doctor.json"), Update.class);
        SendMessage actualResult = requestDispatcher.dispatch(update);
        SendMessage expectedResult = makeMessage (hospital.viewSpecial());
        assertEquals(actualResult, expectedResult);
    }



    private SendMessage makeMessage(String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(400386744L);
        sendMessage.setText(text);
        return sendMessage;
    }
}
