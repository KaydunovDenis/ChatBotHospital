package by.jrr.chatbothospital.logic;

import java.util.concurrent.CopyOnWriteArrayList;


/**
 * - список пициентов в очереди к определенному врачу в формате (пациент, Date(День, Время))
 * comporator для сортировки очереди
 * }
 */
public class Order {
    final private Spesialist SPECIALIST;
    private CopyOnWriteArrayList listUsersOnOrder;//Нужно использовать потоко безопасную очередь

    public Order(Spesialist spesialist) {
        SPECIALIST = spesialist;
        listUsersOnOrder = new CopyOnWriteArrayList();
    }

    public Spesialist getSpesialist() {
        return SPECIALIST;
    }

    public CopyOnWriteArrayList getListUsersOnOrder() {
        return listUsersOnOrder;
    }
}