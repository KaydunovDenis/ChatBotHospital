package by.jrr.chatbothospital.service;

import by.jrr.chatbothospital.ChatBotHospitalApplicationTests;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class TelegramBotHospitalTest extends ChatBotHospitalApplicationTests {

    @Autowired
    TelegramBotHospital telegramBotHospital;
    @Autowired
    ObjectMapper objectMapper;

   //@Test
    void onUpdateReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        telegramBotHospital.onUpdateReceived(update);
    }

   //@Test
    void sendMessage (){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(509012943L);
        sendMessage.setText("Hello bot");
        try {
            telegramBotHospital.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}