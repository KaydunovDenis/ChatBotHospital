package by.jrr.chatbothospital.service;

import by.jrr.chatbothospital.ChatBotHospitalApplicationTests;
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


    @Test
    void onUpdateReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        SendMessage actualResult = requestDispatcher.dispatch(update);
        SendMessage expectedResult = makeMessage ("Sorry, I don't understand you...");
        assertEquals(actualResult, expectedResult);
    }


    @Test
    void onStartReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/start.json"), Update.class);
        SendMessage actualResult = requestDispatcher.dispatch(update);
        SendMessage expectedResult = makeMessage ("Welcome to hospital_chatbot. Nice to meet you!:)");
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void onHelpReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/help.json"), Update.class);
        SendMessage actualResult = requestDispatcher.dispatch(update);
        SendMessage expectedResult = makeMessage (
                        "/start - start dialog \n" +
                        "/help - all commands \n" +
                        "/settings - settings\n"+
                        "/doctor - doctor");
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void onSettingReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/settings.json"), Update.class);
        SendMessage actualResult = requestDispatcher.dispatch(update);
        SendMessage expectedResult = makeMessage ("Nothing you can set now, sorry...");
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void onNoneReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/none.json"), Update.class);
        SendMessage actualResult = requestDispatcher.dispatch(update);
        SendMessage expectedResult = makeMessage ("Sorry, I don't understand you...");
        assertEquals(actualResult, expectedResult);
    }


    private SendMessage makeMessage (String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(509012943L);
        sendMessage.setText(text);
        return sendMessage;
    }
}
