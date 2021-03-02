package by.jrr.chatbothospital.processor;

import org.springframework.stereotype.Service;

@Service
public class HelpProcessor implements Processor {

    @Override
    public String run() {
        return "Добро пожаловать в ChatBotHospital! \uD83D\uDE0A\n" +
                "\n" +
                "Я чат-бот который поможет Вам быстро и просто записаться на прием к врачу:\n" +
                "\n" +
                "❗️Список команд\n" +
                "/doctor - посмотреть список врачей и записаться\n" +
                "/settings - просмотреть текущие настройки\n" +
                "/help - помощь\n";
    }
}
