package by.jrr.chatbothospital.logic;

public class Specialist {
    private String name;
    private String surname;
    private String password; //
    private Special special;//ENUM
    private int numberCurrentCabinet;
    private Order order;

    public Specialist(String name, String surname, Special special) {
        this.name = name;
        this.surname = surname;
        this.special = special;
    }

    public Specialist(String name, String surname, String password, Special special) {
        this.name = name;
        this.surname = surname;
        this.password = password; //
        this.special = special;
        this.order = new Order(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Special getSpecial() {
        return special;
    }

    public void setSpecial(Special special) {
        this.special = special;
    }

    public int getNumberCurrentCabinet() {
        return numberCurrentCabinet;
    }

    public void setNumberCurrentCabinet(int numberCurrentCabinet) {
        this.numberCurrentCabinet = numberCurrentCabinet;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Specialist)) return false;

        Specialist that = (Specialist) o;

        if (getNumberCurrentCabinet() != that.getNumberCurrentCabinet()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getSurname() != null ? !getSurname().equals(that.getSurname()) : that.getSurname() != null) return false;
        if (getPassword() != null ? !getPassword().equals(that.getPassword()) : that.getPassword() != null)
            return false;
        if (getSpecial() != null ? !getSpecial().equals(that.getSpecial()) : that.getSpecial() != null) return false;
        return getOrder() != null ? getOrder().equals(that.getOrder()) : that.getOrder() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        result = 31 * result + (getSpecial() != null ? getSpecial().hashCode() : 0);
        result = 31 * result + getNumberCurrentCabinet();
        result = 31 * result + (getOrder() != null ? getOrder().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return name + " " + surname + " - " + special.doctor + "\n";
    }
}
