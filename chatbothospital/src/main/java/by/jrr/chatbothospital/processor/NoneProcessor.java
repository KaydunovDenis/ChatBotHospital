package by.jrr.chatbothospital.processor;

import org.springframework.stereotype.Service;

@Service
public class NoneProcessor implements Processor {

    @Override
    public String run() {
        return "Sorry, I don't understand you...";
    }
}
