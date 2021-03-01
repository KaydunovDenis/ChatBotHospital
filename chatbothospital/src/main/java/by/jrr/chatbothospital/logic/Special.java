package by.jrr.chatbothospital.logic;

public enum Special {
    THERAPIST("ТЕРАПЕВТ"),
    SURGEON("ХИРУРГ"),
    NEUROLOGIST("НЕВРОЛОГ"),
    OTORHINOLARYNGOLOGIST("ОТОРИНОЛАРИНГОЛОГ"),
    OPHTHALMOLOGIST("ОФТАЛЬМОЛОГ");

    String doctor ;


    public String getDoctor() {
        return doctor;
    }

    Special(String doctor) {
        this.doctor = doctor;
    }
}
