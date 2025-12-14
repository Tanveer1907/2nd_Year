public class linked_list1 {
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
        public static int length_LL(Node head){
        int len = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        return len;

    }
    public static boolean check_if_present(Node head, int val){
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            if(temp.data==val){
                return true;
            }
        }
        return false;
    }
    }
   
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        // Node y = new Node(arr[0], null);
        Node head = Node.convertArrtoLL(arr);
        
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;

        // }
        // System.out.println(Node.length_LL(head));
        System.out.println(Node.check_if_present(head, 2 ));
    }

}
