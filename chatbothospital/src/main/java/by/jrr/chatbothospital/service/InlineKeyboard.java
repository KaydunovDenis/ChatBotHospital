package by.jrr.chatbothospital.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;


public class InlineKeyboard extends InlineKeyboardButton {
    private int amountDoctors;

    InlineKeyboard(int amountDoctors) {
        this.amountDoctors = amountDoctors;
    }

    public SendMessage getListDoctorsMessage(long chatId, String textMessage) {
        final InlineKeyboardMarkup inlineKeyboardMarkup = getListDoctorsKeyboard();
        final SendMessage listDoctorsMessage = createMessageWithKeyboard(chatId, textMessage, inlineKeyboardMarkup);
        return listDoctorsMessage;
    }

    private InlineKeyboardMarkup getListDoctorsKeyboard() { // InlineKeyboard - клавиатура, которая находится под сообщением
        final InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row1 = new ArrayList<>(); //создаем первый ряд кнопок. 1 список - 1 ряд.


        for (int i = 1; i <= amountDoctors;i++){
            row1.add(new InlineKeyboardButton().setText(String.valueOf(i)).setCallbackData(String.valueOf(i))); // добавляем кнопку I (соответствует номеру врача)
        }

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>(); // создаем лист, который выступает в роли ряда кнопок.
        rowList.add(row1);
        inlineKeyboardMarkup.setKeyboard(rowList);
        return inlineKeyboardMarkup;
    }

    private SendMessage createMessageWithKeyboard(long chatId, String textMessage, InlineKeyboardMarkup inlineKeyboardMarkup) {
        final SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText(textMessage);
        if (inlineKeyboardMarkup != null) {
            sendMessage.setReplyMarkup(inlineKeyboardMarkup);
        }
        return sendMessage;
    }
}

