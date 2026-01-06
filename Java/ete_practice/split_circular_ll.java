package ete_practice;

public class split_circular_ll {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node createCircularList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }

        curr.next = head;
        return head;
    }

    // FIXED split function
    static Node[] splitList(Node head) {

        Node[] res = new Node[2];

        if (head == null || head.next == head) {
            res[0] = head;
            res[1] = null;
            return res;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head1 = head;
        Node head2 = slow.next;

        // make first half circular
        slow.next = head1;

        // make second half circular
        Node temp = head2;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head2;

        res[0] = head1;
        res[1] = head2;
        return res;
    }

    static void printCircularList(Node head) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Node head = createCircularList(arr);

        Node[] split = splitList(head);

        System.out.print("First Circular List: ");
        printCircularList(split[0]);

        System.out.print("Second Circular List: ");
        printCircularList(split[1]);
    }
}
