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

    ArrayList listService; // список услуг

    private static void setListSpecialists() {
        listSpecialists.add(new Specialist("Андрей", "Травников",Special.THERAPIST));
        listSpecialists.add(new Specialist("Виктор","Армутин", Special.NEUROLOGIST));
        listSpecialists.add(new Specialist("Михаил","Сидоров", Special.OPHTHALMOLOGIST));
        listSpecialists.add(new Specialist("Александра","Цыбулько", Special.OTORHINOLARYNGOLOGIST));
        listSpecialists.add(new Specialist("Василий","Криворко", Special.SURGEON));
    }

    public String viewSpecial() {
        String listSpecialist = "";
        String currentSpecialist;
        StringBuilder stringBuilder = new StringBuilder(listSpecialist);
        for(int i = 0; i < listSpecialists.size(); i++){
            currentSpecialist = listSpecialists.get(i).toString();
            stringBuilder.append((i+1)+") ").append(currentSpecialist);
        }
        listSpecialist = stringBuilder.toString();
        return listSpecialist;
    }

    public List<Specialist> getListSpecialists() {
        return listSpecialists;
    }
}
