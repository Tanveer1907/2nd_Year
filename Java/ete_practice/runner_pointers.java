package ete_practice;

public class runner_pointers {
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
public static Node runner(Node head){
    if(head == null) return null;
    Node fast = head;
    Node slow = head;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        Node head = Node.createlist(arr);
        
        Node mid = runner(head);
        System.out.println(mid.data);
}
}
