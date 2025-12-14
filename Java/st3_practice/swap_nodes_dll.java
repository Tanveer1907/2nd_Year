package st3_practice;

import java.util.Scanner;

public class swap_nodes_dll {
    public static class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
    public static Node swapnodes(Node head, int x, int y){
        if(x==y || head == null){
            return head;
        }
        Node nodex = null, nodey = null;
        Node curr = head;
        while(curr!=null){
            if(curr.data==x) nodex = curr;
            if(curr.data == y) nodey = curr;
            curr = curr.next;
        }
        if(nodex==null || nodey == null){
            return head;
        }
        if(nodex.prev!=null){
            nodex.prev.next = nodey;
        }
        else{
            head = nodey;
        }
        if(nodey.prev!=null){
            nodey.prev.next = nodex;
        }
        else{
            head = nodex;
        }
        if(nodex.next!=null){
        nodex.next.prev= nodey;
    }
    if(nodey.next!=null){
        nodey.next.prev = nodex;
    }
        Node temp = nodex.prev;
        nodex.prev  = nodey.prev;
        nodey.prev = temp;

        temp = nodex.next;
        nodex.next = nodey.next;
        nodey.next = temp;

        return head;
    }
}

static void print(Node head) {
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

        int A = sc.nextInt();
        int B = sc.nextInt();

        head = Node.swapnodes(head, A, B);
        print(head);
    }
}
