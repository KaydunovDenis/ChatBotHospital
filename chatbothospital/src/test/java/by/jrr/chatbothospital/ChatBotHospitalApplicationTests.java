package by.jrr.chatbothospital;

import by.jrr.chatbothospital.config.Mapper;
import by.jrr.chatbothospital.logic.Hospital;
import by.jrr.chatbothospital.processor.*;
import by.jrr.chatbothospital.service.CallBackDispatcher;
import by.jrr.chatbothospital.service.MessageService;
import by.jrr.chatbothospital.service.RequestDispatcher;
import by.jrr.chatbothospital.service.TelegramBotHospital;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest (classes = {TelegramBotHospital.class, Mapper.class, MessageService.class, RequestDispatcher.class, CallBackDispatcher.class,StartProcessor.class, SettingsProcessor.class, NoneProcessor.class, HelpProcessor.class, InlineKeyboardProcessor.class, Hospital.class})
public class ChatBotHospitalApplicationTests {

    @Test
    void contextLoads() {
    }

}
