package day8.lambdaExpressions;

import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(1);
        list.forEach(System.out::println);
        list.forEach(n-> System.out.println(n));
    }
}
