package by.jrr.chatbothospital.processor;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class HelpProcessor implements Processor {

    @Bean
    @Override
    public String run() {
        return "/start - start dialog \n" +
                "/help - all commands \n" +
                "/settings - settings\n"+
                "/doctor - doctor";
    }
}
