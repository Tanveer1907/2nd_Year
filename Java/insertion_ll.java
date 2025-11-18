public class insertion_ll {
    public static class Node{
        public int data;
        public Node next;

        Node(int data1, Node next1){
        data = data1;
        next = next1;
    }
    public Node(int data1){
        data = data1;
        next = null;
    }
    public static Node convertArrtoLL(int[] arr){
            Node head = new Node(arr[0]);
            Node mover = head;
            for(int i = 1;i<arr.length;i++){
                Node temp = new Node(arr[i]);
                mover.next = temp;
                mover =  temp;
            }
            return head;
        }
    public static Node insertHead(Node head, int val){
        Node temp = new Node(val, head);
        return temp;
        }
    public static Node insertTail(Node head, int val){
        if(head == null){
            return new Node(val);
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
    public static Node insertK(Node head, int val, int k){
        if(head ==null){
            if(k==1){
                return new Node(val);
            }
            else{
                return head;
            }
        }
        if(k==1){
            Node temp = new Node(val,head);
            return temp;
        }
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            if(count==k-1){
               Node x = new Node(val);
               x.next = temp.next;
               temp.next = x; 
            }
            temp = temp.next;
        }
        return head;
    }
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5};
        Node head = Node.convertArrtoLL(arr);
        head = Node.insertK(head, 8,4);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
 