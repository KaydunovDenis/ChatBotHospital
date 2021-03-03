package by.jrr.chatbothospital.service;

import by.jrr.chatbothospital.logic.Hospital;
import by.jrr.chatbothospital.processor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Service
public class CallBackDispatcher {
    @Autowired
    TelegramBotHospital telegramBotHospital;
    @Autowired
    MessageService messageService;


    public SendMessage dispatch(Update update) {
        switch (getCommand(update)) {
            case ONE:
                return messageService.sendMessage(update, InlineCommands.ONE, new Hospital().getListSpecialists());
            case TWO:
                return messageService.sendMessage(update, InlineCommands.TWO, new Hospital().getListSpecialists());
            case THREE:
                return messageService.sendMessage(update, InlineCommands.THREE, new Hospital().getListSpecialists());
            case FOUR:
                return messageService.sendMessage(update, InlineCommands.FOUR, new Hospital().getListSpecialists());
            case FIVE:
                return messageService.sendMessage(update, InlineCommands.FIVE, new Hospital().getListSpecialists());
            default:
                return messageService.sendMessage(update.getCallbackQuery().getMessage(), "Do no");
        }
    }

    private InlineCommands getCommand(Update update) {
        if (update != null) {
            CallbackQuery callbackQuery = update.getCallbackQuery();
            if (callbackQuery.getMessage().hasText()) {
                String msgText = callbackQuery.getData();
                if (msgText.startsWith(InlineCommands.ONE.getCommand())) {
                    return InlineCommands.ONE;
                } else if (msgText.startsWith(InlineCommands.TWO.getCommand())) {
                    return InlineCommands.TWO;
                } else if (msgText.startsWith(InlineCommands.THREE.getCommand())) {
                    return InlineCommands.THREE;
                } else if (msgText.startsWith(InlineCommands.FOUR.getCommand())) {
                    return InlineCommands.FOUR;
                } else if (msgText.startsWith(InlineCommands.FIVE.getCommand())) {
                    return InlineCommands.FIVE;
                }
            }

        }
        return InlineCommands.NONE;
    }
}
