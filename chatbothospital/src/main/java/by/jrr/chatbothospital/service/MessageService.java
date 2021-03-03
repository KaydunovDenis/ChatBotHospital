package by.jrr.chatbothospital.service;

import by.jrr.chatbothospital.logic.Specialist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    TelegramBotHospital telegramBotHospital;


    public SendMessage sendMessage(Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            telegramBotHospital.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        return sendMessage;
    }

    public SendMessage sendMessage(Update update, String text, InlineKeyboard inlineKeyboard) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId().toString());
        sendMessage.setText(text);
        try {
            telegramBotHospital.execute(inlineKeyboard.getListDoctorsMessage(update.getMessage().getChatId(), sendMessage.getText()));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        return sendMessage;
    }


    public SendMessage sendMessage(Update update, InlineCommands number, List<Specialist> listSpecialists) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getCallbackQuery().getMessage().getChatId().toString());
        String specialist;
        StringBuilder stringBuilder = new StringBuilder();
        specialist = listSpecialists.get(Integer.parseInt(number.command.substring(0, 1))-1).toString();
        stringBuilder.append("Вы успешно записаны на прием к: ").append(specialist);
        specialist = stringBuilder.toString();
        sendMessage.setText(specialist).setChatId(update.getCallbackQuery().getMessage().getChatId());
        try {
            telegramBotHospital.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        return sendMessage;


    }
}



