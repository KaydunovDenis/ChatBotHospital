package by.jrr.chatbothospital.processor;

import org.springframework.stereotype.Service;


@Service
public class StartProcessor implements Processor {

    @Override
    public String run() {
        return "Welcome to hospital_chatbot. Nice to meet you!:)";
    }
}
