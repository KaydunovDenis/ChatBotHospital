package by.jrr.chatbothospital.logic;

import java.util.concurrent.CopyOnWriteArrayList;


/**
 * - список пициентов в очереди к определенному врачу в формате (пациент, Date(День, Время))
 * comporator для сортировки очереди
 * }
 */
public class Order {
    final private Specialist SPECIALIST;
    private CopyOnWriteArrayList listUsersOnOrder;//Нужно использовать потоко безопасную очередь

    public Order(Specialist specialist) {
        SPECIALIST = specialist;
        listUsersOnOrder = new CopyOnWriteArrayList();
    }

    public Specialist getSpesialist() {
        return SPECIALIST;
    }

    public CopyOnWriteArrayList getListUsersOnOrder() {
        return listUsersOnOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (SPECIALIST != null ? !SPECIALIST.equals(order.SPECIALIST) : order.SPECIALIST != null) return false;
        return getListUsersOnOrder() != null ? getListUsersOnOrder().equals(order.getListUsersOnOrder()) : order.getListUsersOnOrder() == null;

    }

    @Override
    public int hashCode() {
        int result = SPECIALIST != null ? SPECIALIST.hashCode() : 0;
        result = 31 * result + (getListUsersOnOrder() != null ? getListUsersOnOrder().hashCode() : 0);
        return result;
    }
}