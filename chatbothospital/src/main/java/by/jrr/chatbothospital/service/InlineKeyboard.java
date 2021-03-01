package by.jrr.chatbothospital.service;

import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

@Service
public class InlineKeyboard extends InlineKeyboardButton { // InlineKeyboard - клавиатура, которая находится под сообщением


    public static SendMessage sendInlineKeyboardMessage(Long chatId) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<InlineKeyboardButton> row1 = new ArrayList<>(); //создаем первый ряд кнопок. 1 список - 1 ряд.
        row1.add(new InlineKeyboardButton().setText("inline button").setCallbackData("inline button!")); //создаем кнопку старт
        List<List<InlineKeyboardButton>> rowList = new ArrayList<>(); // создаем лист, который выступает в роли ряда кнопок.
        rowList.add(row1);
        inlineKeyboardMarkup.setKeyboard(rowList);
        return new SendMessage().setChatId(chatId).setText("Тут должен быть список врачей").setReplyMarkup(inlineKeyboardMarkup);
    }
}
