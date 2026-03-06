package day8.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromAnArray {
    public static void main(String[] args) {
        int[]arr={1,1,2,3,4,4,5,6,6,7,8};
        System.out.println(Arrays.toString(arr));
        Set<Integer> unique=new HashSet<>();
        for(int x: arr){
            unique.add(x);
        }
        System.out.println(unique);
        Set<Integer> nonDuplicate=new HashSet<>();
        nonDuplicate.addAll(Arrays.asList(7,8,9,2,3,3,0,9,5,6));
        System.out.println(nonDuplicate);
    }
}
