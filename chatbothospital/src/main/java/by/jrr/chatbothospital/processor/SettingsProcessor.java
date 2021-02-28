package by.jrr.chatbothospital.processor;

import org.springframework.stereotype.Service;

@Service
public class SettingsProcessor implements Processor {

    @Override
    public String run() {
        return "Nothing you can set now, sorry...";
    }
}
