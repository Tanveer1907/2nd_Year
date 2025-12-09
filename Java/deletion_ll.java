public class deletion_ll {
    public static class Node {
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
        public static Node removeHead(Node head){
            if(head == null){
                return head;
            }
            return head.next;  
        }
        public static Node removeTail(Node head){
            if(head == null || head.next==null){
                return null;
            }
            Node temp = head;
            while(temp.next.next!= null){
                temp = temp.next;  
            }
            temp.next = null;
            return head;
        }
        public static Node removeK(Node head, int k){
            if(head == null){
                return null;
            }
            if(k==1){
                return head.next;
            }
            int count = 0;
            Node temp = head;
            Node prev = null;
            while(temp!=null){
                count++;
                if(count == k){
                    prev.next= prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            return head;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Node head = Node.convertArrtoLL(arr);
        head = Node.removeK(head, 5);
        
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
