package dataStructures.Problems;

import java.util.Stack;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeList {

    public static boolean isPalindrome(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            if (temp.data != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head) ? "Palindrome" : "Not Palindrome");
        ListNode head1=new ListNode(1);
        head1.next=new ListNode(2);
        head1.next.next=new ListNode(3);
        System.out.println(isPalindrome(head1)?"Palindrome":"Not palindrome");
    }
}