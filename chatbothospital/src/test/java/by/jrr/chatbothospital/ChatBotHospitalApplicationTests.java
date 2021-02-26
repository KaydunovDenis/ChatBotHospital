package by.jrr.chatbothospital;

import by.jrr.chatbothospital.config.Mapper;
import by.jrr.chatbothospital.service.MessageService;
import by.jrr.chatbothospital.service.TelegramBotHospital;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest (classes = {TelegramBotHospital.class, Mapper.class, MessageService.class})
public class ChatBotHospitalApplicationTests {

    @Test
    void contextLoads() {

    }

}
