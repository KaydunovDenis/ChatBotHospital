package by.jrr.chatbothospital.logic;

/**
 * User - пациент
 * isBloking - заблокирован ли пользователь в системе
 */
public class User {
    private String name;
    private String surename;
    private String password;
    //private int year;
    //private String adress;
    private boolean isBloking = false;

    public User(String name, String surename, String password) {
        this.name = name;
        this.surename = surename;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isBloking() {
        return isBloking;
    }

    public void setBloking(boolean bloking) {
        isBloking = bloking;
    }
}
