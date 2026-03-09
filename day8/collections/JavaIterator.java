package day8.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(22);
        list.add(32);
        list.add(5);
        list.add(6);
        list.add(100);
        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            Integer i= it.next();
            if(i>10){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
