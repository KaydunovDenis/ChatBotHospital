package by.jrr.chatbothospital.logic;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Hospital {

    private static List<Specialist> listSpecialists = new ArrayList();// - список всех врачей

    static {
        setListSpecialists();
    }

    private static void setListSpecialists() {
        listSpecialists.add(new Specialist("Андрей", "Травников", Special.THERAPIST));
        listSpecialists.add(new Specialist("Виктор", "Армутин", Special.NEUROLOGIST));
        listSpecialists.add(new Specialist("Михаил", "Сидоров", Special.OPHTHALMOLOGIST));
        listSpecialists.add(new Specialist("Александра", "Цыбулько", Special.OTORHINOLARYNGOLOGIST));
        listSpecialists.add(new Specialist("Василий", "Криворко", Special.SURGEON));
    }

    /**
     * - показать категории специалистов
     */
    public String viewSpecial() {
        return listSpecialists.toString();
    }

    public List<Specialist> getListSpecialists() {
        return listSpecialists;
    }

    ArrayList listService; // список услуг
}
