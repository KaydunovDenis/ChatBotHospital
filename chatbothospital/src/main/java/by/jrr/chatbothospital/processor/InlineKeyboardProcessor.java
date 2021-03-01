package by.jrr.chatbothospital.processor;

import org.springframework.stereotype.Service;


@Service
public class InlineKeyboardProcessor implements Processor{


    @Override
    public String run()  {
        return "Doctor";
    }

}
