public class odd_even_ll {
    public static class Node {
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
        public static Node odd_even(Node head){
            Node odd = head;
            Node even = head.next;
            Node evenHead = head.next;
            while(even!=null && even.next!=null){
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
            return head;
        }
    }
    public static void main(String[] args){
        int[] arr= {1,4,2,5,3,6};
        Node head = Node.convertArrtoLL(arr);
        // Node ans = Node.odd_even(head);
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
