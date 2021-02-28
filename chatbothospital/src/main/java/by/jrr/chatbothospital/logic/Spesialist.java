package by.jrr.chatbothospital.logic;

public class Spesialist {
    private String name;
    private String surname;
    private String password;
    private String special;//ENUM
    private int numberCurrentCabinet;
    private Order order;

    public Spesialist(String name, String surname, String password, String special) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.special = special;
        this.order = new Order(this);
    }


}
