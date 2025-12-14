package st3_practice;

import java.util.Scanner;

public class rev_alternate_k_nodes {
    public static class Node{
        int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node reverseAltK(Node head, int k){
        Node curr = head;
        Node prev = null;
        int count = 0;
        while(curr!=null && count<k){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(head!=null){
            head.next = curr;
        }
        count = 0;
        while(curr!=null && count<k-1){
            curr = curr.next;
            count++;
        }
        if(curr!=null){
            curr.next = reverseAltK(curr.next, k);
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node head = null, tail = null;

        for (int i = 0; i < N; i++) {
            Node n = new Node(sc.nextInt());
            if (head == null) head = tail = n;
            else {
                tail.next = n;
                tail = n;
            }
        }

        int k = sc.nextInt();
        head = reverseAltK(head, k);
        print(head);
    }
}
}