package by.jrr.chatbothospital.logic;

import java.util.ArrayList;

public class Hospital {
    ArrayList listSpecialists;// - список всех врачей
    ArrayList listService; // список услуг

    /**
     * - показать категории специалистов
     */
    private String viewSpecial() {
        return listSpecialists.toString();
    }
}
