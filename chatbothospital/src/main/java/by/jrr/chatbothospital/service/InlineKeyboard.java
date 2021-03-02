package by.jrr.chatbothospital.service;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;


public class InlineKeyboard {

    public SendMessage getListDoctorsMessage(long chatId, String textMessage){
        final InlineKeyboardMarkup inlineKeyboardMarkup = getListDoctorsKeyboard();
        final SendMessage listDoctorsMessage = createMessageWithKeyboard(chatId, textMessage, inlineKeyboardMarkup);
        return listDoctorsMessage;
    }

    private InlineKeyboardMarkup getListDoctorsKeyboard() { // InlineKeyboard - клавиатура, которая находится под сообщением

        final InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        List<InlineKeyboardButton> row1 = new ArrayList<>(); //создаем первый ряд кнопок. 1 список - 1 ряд.
        row1.add(new InlineKeyboardButton().setText("inline button").setCallbackData("inline button!")); //создаем кнопку старт

        List<List<InlineKeyboardButton>> rowList = new ArrayList<>(); // создаем лист, который выступает в роли ряда кнопок.
        rowList.add(row1);
        inlineKeyboardMarkup.setKeyboard(rowList);
//        return new SendMessage().setChatId(chatId).setText("Тут должен быть список врачей").setReplyMarkup(inlineKeyboardMarkup);
        return inlineKeyboardMarkup;
}

    private SendMessage createMessageWithKeyboard(long chatId, String textMessage, InlineKeyboardMarkup inlineKeyboardMarkup) {
    final SendMessage sendMessage = new SendMessage();
    sendMessage.setChatId(chatId);
    sendMessage.setText(textMessage);
    if (inlineKeyboardMarkup != null){
        sendMessage.setReplyMarkup(inlineKeyboardMarkup);
    }
    return sendMessage;
    }
}

