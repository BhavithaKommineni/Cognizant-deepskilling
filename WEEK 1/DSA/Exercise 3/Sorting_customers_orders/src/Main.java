import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(1, "Alice", 200));
        orders.add(new Order(2, "Bob", 150));
        orders.add(new Order(3, "Charlie", 250));
        orders.add(new Order(4, "David", 100));
        orders.add(new Order(5, "Eve", 300));

        // Bubble Sort
        List<Order> bubbleSortedOrders = new ArrayList<>(orders);
        BubbleSort.bubbleSort(bubbleSortedOrders);
        System.out.println("Bubble Sort: " + bubbleSortedOrders);

        // Quick Sort
        List<Order> quickSortedOrders = QuickSort.quickSort(new ArrayList<>(orders));
        System.out.println("Quick Sort: " + quickSortedOrders);
    }
}
