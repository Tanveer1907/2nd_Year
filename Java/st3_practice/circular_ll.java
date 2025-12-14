package st3_practice;

import java.util.Scanner;

public class circular_ll {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        static int countnode(Node head){
            if(head==null){
                return 0;
            }
            int count = 0;
            Node curr = head;
            do{
                count++;
                curr = curr.next;
            }while(curr!=head);
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // number of nodes

        if (N == 0) {
            System.out.println(0);
            return;
        }

        // Create circular linked list
        Node head = new Node(sc.nextInt());
        Node tail = head;

        for (int i = 1; i < N; i++) {
            Node newNode = new Node(sc.nextInt());
            tail.next = newNode;
            tail = newNode;
        }

        // make it circular
        tail.next = head;

        System.out.println(Node.countnode(head));
    }

}
