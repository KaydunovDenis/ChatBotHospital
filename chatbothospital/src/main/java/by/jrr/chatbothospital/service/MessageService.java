package by.jrr.chatbothospital.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class MessageService {
    public SendMessage onUpdateReceived(Update update) {
        SendMessage sendMessage = new SendMessage();
        if (update != null){
            Message message = update.getMessage();
            sendMessage.setChatId(message.getChatId());

            if (message.hasText()){
                String magText = message.getText();
                switch (magText){
                    case("/start"):
                        return sendMessage.setText("Hello!");
                    case("/help"):
                        return sendMessage.setText("Help!");
                    case("Hello"):
                        return sendMessage.setText("Hi friend!");

                    default: return sendMessage.setText("Do no");
                }
            }
        }
        return sendMessage.setText("Enter something");
    }
}

