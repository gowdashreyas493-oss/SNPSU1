package day8.sets;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores= new TreeSet<>(Collections.reverseOrder());
        scores.add(450);
        scores.add(200);
        scores.add(125);
        scores.add(107);
        System.out.println("LeaderBoard: "+scores);
    }
}
