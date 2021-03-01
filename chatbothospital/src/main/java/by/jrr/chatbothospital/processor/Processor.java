package by.jrr.chatbothospital.processor;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public interface Processor {
    String run() ;
}
