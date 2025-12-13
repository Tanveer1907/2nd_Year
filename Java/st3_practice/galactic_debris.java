package st3_practice;

public class galactic_debris {
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
        public static Node delete(Node head){
            if(head != null && head.data<50){ 
                head = head.next;
            }
            Node curr = head;
            while(curr!=null && curr.next!=null){
                if(curr.next.data<50){
                    curr.next = curr.next.next;
                }
                else{
                    curr = curr.next;
                }
            }
            return head==null ? null:head;
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,55,42,90,12,77};
        Node head = Node.convertArrtoLL(arr);
        Node ans = Node.delete(head);
        if(ans== null){
            System.out.println("-1");
        }
        else{
            while(ans!=null){
                System.out.print(ans.data+" ");
                ans = ans.next;
            }
        }
    }
    
}
