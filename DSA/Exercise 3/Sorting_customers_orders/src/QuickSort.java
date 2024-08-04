import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static List<Order> quickSort(List<Order> orders) {
        if (orders.size() <= 1) {
            return orders;
        } else {
            Order pivot = orders.get(orders.size() / 2);
            List<Order> less = new ArrayList<>();
            List<Order> equal = new ArrayList<>();
            List<Order> greater = new ArrayList<>();
            for (Order order : orders) {
                if (order.getTotalPrice() < pivot.getTotalPrice()) {
                    less.add(order);
                } else if (order.getTotalPrice() > pivot.getTotalPrice()) {
                    greater.add(order);
                } else {
                    equal.add(order);
                }
            }
            List<Order> sortedOrders = new ArrayList<>();
            sortedOrders.addAll(quickSort(less));
            sortedOrders.addAll(equal);
            sortedOrders.addAll(quickSort(greater));
            return sortedOrders;
        }
    }
}

