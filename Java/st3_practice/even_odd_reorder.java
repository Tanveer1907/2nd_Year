package st3_practice;

import java.util.Scanner;

public class even_odd_reorder{
    public static class Node{
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

        public static Node convertArrtoLL(int[] arr){
            Node head = new Node(arr[0]);
            Node mover = head;
            for(int i = 1; i < arr.length; i++){
                Node temp = new Node(arr[i]);
                mover.next = temp;
                mover = temp;
            }
            return head;
        }
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
        public static Node reorder(Node head){
            Node evenhead = null;
            Node oddhead = null;
            Node eventail = null;
            Node oddtail = null;
            Node curr = head;
            while(curr!=null){
                if(curr.data%2==0){
                    if(evenhead==null){
                        evenhead= eventail= curr;
                    }
                    else{
                        eventail.next = curr;
                        eventail= curr;
                    }
                }
                else{
                    if(oddhead==null){
                        oddhead=oddtail=curr;
                    }
                    else{
                        oddtail.next = curr;
                        oddtail = curr;
                    }
                }
                curr = curr.next;
            }
            if(evenhead==null) return oddhead;
            eventail.next = oddhead;
            if(oddtail!=null) oddtail.next = null;
            return evenhead;
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

        int n = sc.nextInt();          // number of nodes
        Node head = buildList(n, sc);

        head = reorder(head);  // Q34 function call
        printList(head);
    }
    }
}

