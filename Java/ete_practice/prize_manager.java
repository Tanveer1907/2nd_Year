package ete_practice;

import java.nio.channels.Pipe.SourceChannel;

public class prize_manager {
    public static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
    static Node createlist(int[] arr){
        if(arr.length==0) return null;
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++){
            mover.next = new Node(arr[i]);
            mover = mover.next;
        }
        return head;
    }
    static void printlist(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
public static Node delete(Node head, int x){
    while(head!=null && head.data>x){
        head = head.next;
    }
    if(head==null) return null;
    Node curr = head;
    while(curr.next!=null){
        if(curr.next.data>x){
            curr.next= curr.next.next;
        }
        else{
            curr = curr.next;
        }
    }
    return head;
}
public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        Node head = Node.createlist(arr);
        head = delete(head, 5);
        Node.printlist(head);
}
}
