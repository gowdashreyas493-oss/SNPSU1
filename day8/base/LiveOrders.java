package day8.base;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public static void main(String[] args) {
        Collection<String>liveorders=new ArrayList<>();
        liveorders.add("ORD101");
        liveorders.add("ORD102");
        liveorders.add("ORD103");
        System.out.println("ORD103 exists "+liveorders.contains("ORD103"));
        System.out.println("Live Orders: "+liveorders);
        liveorders.clear();
        System.out.println("orders after closing "+liveorders);
    }
}
