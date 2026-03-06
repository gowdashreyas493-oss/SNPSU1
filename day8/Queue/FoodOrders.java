package day8.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders= new LinkedList<>();
        orders.add("Order101");
        orders.offer(  "Order102");
        System.out.println("Orders: "+orders);
        System.out.println("serving: "+orders.poll());
        System.out.println("Pending: "+orders);

    }
}
