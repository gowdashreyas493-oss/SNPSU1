package day8.map;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        // HashMap
        Map<String, String> hashmap = new HashMap<>();
        hashmap.put("01", "aaa");
        hashmap.put("03", "bbb");
        hashmap.put("04", "zzz");
        hashmap.put("02", "xxx");

        System.out.println("HashMap Output:");

        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

        // LinkedHashMap
        Map<String, String> hashmap1 = new LinkedHashMap<>();
        hashmap1.put("01", "aaa");
        hashmap1.put("03", "bbb");
        hashmap1.put("04", "zzz");
        hashmap1.put("02", "xxx");

        System.out.println("\nLinkedHashMap Output:");

        for (Map.Entry<String, String> entry : hashmap1.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}