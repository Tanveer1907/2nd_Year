package st3_practice;

import java.util.Scanner;

public class right_rotate_dll {
    public static class Node{
        public int data;
        public Node next, prev;

        Node(int data){
            this.data= data;
            this.prev = this.next=null;
        }

        public static Node right_rotate(Node head, int k){
            if(head == null || head.next ==null|| k==0) return head;
            Node curr = head;
            int len = 1;
            while(curr.next!=null){
                curr= curr.next;
                len++;
            }
            k = k%len;
            if(k==0){
                return head;
            }
            Node kthNode = head;
            for(int i = 1;i<len-k;i++){
                kthNode = kthNode.next;
            }
            Node newhead = kthNode.next;
            if(newhead==null) return head;
            curr.next = head;
            head.prev = curr;
            kthNode.next = null;
            newhead.prev = null;
            return newhead;
        }
    }
    public static void print(Node head) {
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

        int K = sc.nextInt();

        head = Node.right_rotate(head, K);
        print(head);
    }
}
