package by.jrr.chatbothospital.processor;

import by.jrr.chatbothospital.logic.Hospital;
import by.jrr.chatbothospital.service.InlineKeyboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InlineKeyboardProcessor implements Processor {

    @Autowired
    Hospital hospital;

    @Override
    public String run() {
        return hospital.viewSpecial();
    }
}
