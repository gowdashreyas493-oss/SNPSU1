package day8.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht= new Hashtable<>();
        ht.put(106,"Bobzy");
        ht.put(117,"shreyas");
        ht.put(128,"Sonika");
        ht.put(100,"Siri");
        ht.put(99,"Sunil");
        ht.put(101,"Prashanth");
        for(Map.Entry<Integer,String>entry:ht.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        System.out.println(ht);
    }

}
