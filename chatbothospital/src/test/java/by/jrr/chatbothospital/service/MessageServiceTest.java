package by.jrr.chatbothospital.service;

import by.jrr.chatbothospital.ChatBotHospitalApplicationTests;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MessageServiceTest extends ChatBotHospitalApplicationTests {

    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    MessageService messageService;

    @Test
    void onUpdateReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/update.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = makeMessage ("Do no");
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void onStartReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/start.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = makeMessage ("Hello!");
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void onHelpReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/help.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = makeMessage ("Help!");
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void onHelloReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/hello.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = makeMessage ("Hi friend!");
        assertEquals(actualResult, expectedResult);
    }

    @Test
    void onEmptyReceived() throws IOException {
        Update update = objectMapper.readValue(new File("src/test/resources/empty.json"), Update.class);
        SendMessage actualResult = messageService.onUpdateReceived(update);
        SendMessage expectedResult = makeMessage ("Enter something");
        assertEquals(actualResult, expectedResult);
    }

    private SendMessage makeMessage (String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(509012943L);
        sendMessage.setText(text);
        return sendMessage;
    }
}