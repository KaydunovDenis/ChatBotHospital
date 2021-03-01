package by.jrr.chatbothospital.logic;

import java.util.ArrayList;
import java.util.List;


public class Hospital {


    public List<Specialist> listSpecialists = new ArrayList();// - список всех врачей

    ArrayList listService; // список услуг


    public void setListSpecialists() {
        listSpecialists.add(new Specialist("Иванов",Special.THERAPIST));
        listSpecialists.add(new Specialist("Петров", Special.NEUROLOGIST));
        listSpecialists.add(new Specialist("Сидоров", Special.OPHTHALMOLOGIST));
        listSpecialists.add(new Specialist("Цыбулько", Special.OTORHINOLARYNGOLOGIST));
        listSpecialists.add(new Specialist("Криворучко", Special.SURGEON));
    }

    /**
     * - показать категории специалистов
     */
    private  String viewSpecial() {

        return listSpecialists.toString();

    }
}
