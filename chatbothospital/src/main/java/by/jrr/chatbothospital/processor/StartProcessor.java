package by.jrr.chatbothospital.processor;

import org.springframework.stereotype.Service;


@Service
public class StartProcessor implements Processor {

    @Override
    public String run() {
      return "Добро пожаловать в ChatBotHospital! \uD83D\uDE0A\n" +
              "\n" +
              "Я чат-бот который поможет Вам быстро и просто записаться на прием к врачу:\n" +
              "\n" +
              "Прямо из дома Вы сможете записаться онлайн на прием к нужному специалисту, а также узнать ориентировочное время ожидания и свою позицию в очереди. Многочасовое ожидание своей очереди и бесконечные звонки в регистратуру, чтобы записаться на прием останутся в прошлом \uD83D\uDE09\n" +
              "\n" +
              "❗️Список команд\n" +
              "/doctor - посмотреть список врачей и записаться\n" +
              "/settings - просмотреть текущие настройки\n" +
              "/help - помощь\n";
    }
}
