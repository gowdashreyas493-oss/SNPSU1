package day8.list;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println("Stack size "+stack.size());
        stack.pop();
        System.out.println("size "+stack.size());
        System.out.println(stack);
        System.out.println(stack.empty());
    }
}
