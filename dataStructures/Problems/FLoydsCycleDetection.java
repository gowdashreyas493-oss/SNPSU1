package dataStructures.Problems;
class Node2 {
    int data;
    Node2 next;
    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}
public class FLoydsCycleDetection {
    static Node2 head = null;
    static void createList() {
        head = new Node2(10);
        head.next = new Node2(20);
        head.next.next = new Node2(30);
        head.next.next.next = new Node2(40);
        head.next.next.next.next = head.next;
    }
    static boolean hasCycle() {
        Node2 slow = head;
        Node2 fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        createList();

      /*  if (hasCycle())
            System.out.println("Cycle Detected");
        else
            System.out.println("No Cycle");

       */
        System.out.println(hasCycle()?"Cycle detected": "No Cycle");
    }

}