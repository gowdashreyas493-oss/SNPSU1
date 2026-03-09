package day8.map;
import java.util.*;
public class FrequencyMap {
    public static void main(String[] args) {
        int[]arr={7,8,9,2,3,3,0,9,5,6};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
        System.out.println(map.get(5));
    }
}
