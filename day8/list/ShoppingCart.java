package day8.list;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("KENDALL");
        cart.add("BOBZY");
        cart.add("LOGAN");
        cart.set(1,"BABU");
        System.out.println("Cart Items: "+cart);
        System.out.println("Total Items "+cart.size());
    }
}