package st3_practice;

import java.util.Scanner;

public class delete_last_dll {
       public static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    public static Node remove_tail(Node head){
        if(head == null || head.next ==null) return null;

        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.prev.next = null;
        tail.prev = null;
        return head;
    }
    static void print(Node head) {
        if (head == null)
            return;

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Node head = null, tail = null;

        for (int i = 0; i < N; i++) {
            Node n = new Node(sc.nextInt());
            if (head == null) {
                head = tail = n;
            } else {
                tail.next = n;
                n.prev = tail;
                tail = n;
            }
        }

        head = remove_tail(head);
        print(head);
    }
}
