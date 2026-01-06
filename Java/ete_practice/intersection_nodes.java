package ete_practice;

public class intersection_nodes {
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
public static Node intersection(Node head1, Node head2){
    Node dummy = new Node(-1);
    Node tail = dummy;
    Node t1 = head1;
    Node t2 = head2;
    while(t1!=null && t2!=null){
        if(t1.data<t2.data){
            t1 = t1.next;
        }
        else if(t1.data>t2.data){
            t2 = t2.next;
        }
        else{
            tail.next = new Node(t1.data);
            tail = tail.next;
            t1 = t1.next;
            t2 = t2.next;
        }
    }
    return dummy.next;
}
public static void main(String[] args) {

    int[] arr1 = {1, 2, 4, 5};
    Node head1 = Node.createlist(arr1);

    // Second sorted linked list
    int[] arr2 = {2, 3, 5, 6};
    Node head2 = Node.createlist(arr2);

    // Find union
    Node intersect = intersection(head1, head2);

    // Print result
    Node.printlist(intersect);
        
}
}
