package ete_practice;

public class rev_alt_k_nodes {
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

public static Node reverse(Node head, int k){
    if(head==null) return null;
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
    head.next = curr;
    count = 0;
    while(curr!=null && count<k-1){
        curr = curr.next;
        count++;
    }
    if(curr!=null){
        curr.next = reverse(curr.next, k);
    }
    return prev;
}
public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        Node head = Node.createlist(arr);
        head = reverse(head, 2);
        Node.printlist(head);
}
}
