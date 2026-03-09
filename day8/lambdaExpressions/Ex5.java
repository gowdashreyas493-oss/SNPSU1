package day8.lambdaExpressions;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println("Initial List: "+list);
        Collections.sort(list,(a,b)-> b - a);
        System.out.println("Sorted list: "+list);
        Collections.sort(list,(a,b)-> a-b);
        System.out.println("sorted list: "+list);
    }
}
