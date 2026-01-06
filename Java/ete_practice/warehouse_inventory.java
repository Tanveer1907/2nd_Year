package ete_practice;

public class warehouse_inventory {
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
public static Node warehouse(Node head){
    if(head == null) return null;
    Node curr = head;
    while(curr!=null){
        Node runner = curr;
        while(runner.next!=null){
        if(runner.next.data == curr.data){
            runner.next = runner.next.next;
        }
        else{
            runner = runner.next;
        }
    }
        curr = curr.next;
    }
    return head;
}
public static void main(String[] args) {

        int[] arr = {3,4,3,2,6,1,4,6};
        Node head = Node.createlist(arr);
        head = warehouse(head);
        Node.printlist(head);
}

}
