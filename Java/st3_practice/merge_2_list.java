package st3_practice;

import java.util.Scanner;

public class merge_2_list{
    public static class Node {
        public int data;
        public Node next;

        // Node(int data1, Node next1){
        //     data = data1;
        //     next = next1;
        // }
        public Node(int data1){
            data = data1;
            next = null;
        }
        // Build linked list from input
    static Node buildList(int n, Scanner sc) {
        if (n == 0) return null;

        Node head = new Node(sc.nextInt());
        Node curr = head;

        for (int i = 1; i < n; i++) {
            curr.next = new Node(sc.nextInt());
            curr = curr.next;
        }
        return head;
    }

        static Node mergealternate(Node a, Node b){
            Node head = a;
            Node currA = a;
            Node currB = b;
            while(currA!=null && currB!=null){
                Node nextA = currA.next;
                Node nextB = currB.next;
                currA.next = currB;
                if(nextA==null){
                    currB.next = nextB;
                    break;
                }
                currB.next = nextA;
                currA = nextA;
                currB = nextB;
            }
            return head;
        }
        static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();          // size of list A
        Node head1 = buildList(n1, sc);

        int n2 = sc.nextInt();          // size of list B
        Node head2 = buildList(n2, sc);

        Node mergedHead = mergealternate(head1, head2);
        printList(mergedHead);

        }
    }
}