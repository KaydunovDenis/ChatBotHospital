package by.jrr.chatbothospital;

import by.jrr.chatbothospital.config.Mapper;
import by.jrr.chatbothospital.processor.HelpProcessor;
import by.jrr.chatbothospital.processor.NoneProcessor;
import by.jrr.chatbothospital.processor.SettingsProcessor;
import by.jrr.chatbothospital.processor.StartProcessor;
import by.jrr.chatbothospital.service.MessageService;
import by.jrr.chatbothospital.service.RequestDispatcher;
import by.jrr.chatbothospital.service.TelegramBotHospital;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest (classes = {TelegramBotHospital.class, Mapper.class, MessageService.class, RequestDispatcher.class, StartProcessor.class, SettingsProcessor.class, NoneProcessor.class, HelpProcessor.class})
public class ChatBotHospitalApplicationTests {

    @Test
    void contextLoads() {
    }

}
