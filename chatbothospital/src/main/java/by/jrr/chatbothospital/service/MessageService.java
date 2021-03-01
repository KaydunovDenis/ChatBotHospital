package by.jrr.chatbothospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class MessageService {

    @Autowired
    TelegramBotHospital telegramBotHospital;

    public SendMessage sendMessage (Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        if(text.equals("Doctor")){  //
            try {
              telegramBotHospital.execute(InlineKeyboard.sendInlineKeyboardMessage(message.getChatId()));
              return null; // прерываем метод
            } catch (TelegramApiException e){
                e.printStackTrace();
            }
        }
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            telegramBotHospital.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

        return sendMessage;
    }


}

