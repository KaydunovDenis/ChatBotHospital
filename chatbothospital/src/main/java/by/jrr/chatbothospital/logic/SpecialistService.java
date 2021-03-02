package by.jrr.chatbothospital.logic;

import org.springframework.stereotype.Service;

@Service
public class SpecialistService {
    /**
     * - показывает конкретному специалисту список его будущих пациентов
     * @return Schedul
     */
    private String viewSchedule() {
        return "";
    }

    /**
     * - показывает конкретному специалисту список его будущих пациентов на этот день
     * @return
     */
    private String viewScheduleToday() {
        return "";
    }

    /**
     * - показать специалисту текущую очередь пациентов,
     * тех которые сидят под кабинетом, которые записались на прием, и которые пришли без записи
     */
    private String viewOrder() {
        return "";
    }
}
