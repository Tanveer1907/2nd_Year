package st3_practice;

import java.util.Scanner;

public class lost_signal_node {
    public static class Node{
        int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    static Node createList(String[] names, int p) {
        Node head = new Node(0);
        Node temp = head;
        Node loopNode = null;

        for (int i = 0; i < names.length; i++) {
            temp.next = new Node(i);
            temp = temp.next;
            if (i == p) loopNode = temp;
        }
        if (p != -1) temp.next = loopNode;
        return head.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String[] names = new String[N];
            for (int i = 0; i < N; i++) names[i] = sc.next();

            int P = sc.nextInt();
            if (P == -1) {
                System.out.println("-1");
            } else {
                System.out.println(names[P]);
            }
        }
    }
    
}}
