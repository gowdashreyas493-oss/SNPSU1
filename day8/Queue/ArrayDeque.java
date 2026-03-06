package day8.Queue;

import java.util.Deque;

public class ArrayDeque {
    public static void main(String[] args) {
        Deque<String> actions=new java.util.ArrayDeque<>();
        actions.addLast("User Types A");
        actions.addLast("User types B");
        actions.addLast("User Deletes B");
        System.out.println("Undo "+actions.removeLast());
        System.out.println(("Remining actions: "+actions));
    }
}
