package dataStructures.linear.linkedlist;

class LL {

    Node head;
    private int size;

    LL() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty can't delete the head!");
            return;
        }

        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty can't delete the tail!");
            return;
        }

        if (head.next == null) {
            head = null;
            size--;
            return;
        }

        Node curr = head;
        Node last = head.next;

        while (last.next != null) {
            curr = last;
            last = last.next;
        }

        curr.next = null;
        size--;
    }

    public void removeTarget(String target) {
        if (head == null) {
            System.out.println("List is empty Can't delete the target");
            return;
        }

        if (head.data.equals(target)) {
            head = head.next;
            size--;
            return;
        }

        Node prev = null;
        Node curr = head;

        while (curr != null && !curr.data.equals(target)) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Element not found");
            return;
        }

        prev.next = curr.next;
        size--;
    }

    public static void main(String[] args) {

        LL sll = new LL();

        sll.addFirst("DSA");
        sll.addFirst("learning");
        sll.addFirst("are");
        sll.addFirst("We");

        sll.printList();

        sll.addLast("in");
        sll.addLast("Java");
        sll.addLast("at");
        sll.addLast("SNPSU");

        sll.printList();

        sll.removeFirst();
        sll.printList();

        sll.removeLast();
        sll.printList();

        sll.removeTarget("learning");
        sll.printList();
    }
}