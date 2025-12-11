public class doubly_ll {
    public static class Node{
        public int data;
        public Node next;
        public Node prev;

        public Node(int data1, Node next1, Node prev1){
        data = data1;
        next = next1;
        prev = prev1;
        }
        Node(int data1){
            data =data1;
            next = null;
            prev = null;
        }
        public static Node convertarrtoDLL(int[] arr){
            Node head = new Node(arr[0]);
            Node prev = head;
            for(int i = 1;i<arr.length;i++){
                Node temp = new Node(arr[i], null, prev);
                prev.next = temp;
                prev = prev.next;
            }
            return head;
        }
        public static Node deletehead(Node head){
            if(head == null || head.next == null){
                return null;
            }
            Node prev = head;
            head = head.next;
            head.prev = null;
            prev.next = null;
            return head;
        }
        public static Node deletetail(Node head){
            if(head==null || head.next == null){
                return null;
            }
            Node tail = head;
            while(tail.next !=null){
                tail = tail.next;
            }
            Node prev = tail.prev;
            prev.next = null;
            tail.prev = null;
            return head;
        }
        public static Node deleteK(Node head, int k){
            if(head==null){
                return null;
            }
            int count = 0;
            Node temp = head;
            while(temp!=null){
                count++;
                if(count ==k){
                    break;
                }
                temp = temp.next;
            }
            Node prev = temp.prev;
            Node front = temp.next;
            if(prev == null){
                return deletehead(head);
            }
            else if(front == null){
                return deletetail(head);
            }
            else{
                prev.next = front;
                front.prev = prev;
                temp.next = null;
                temp.prev = null;
            }
            return head;
        }
        public static Node deleteNode(Node head, int el){
            Node temp = head;
            while(temp!=null){
                if(temp.data==el){
                    break;
                }
                temp = temp.next;
            }
            Node prev = temp.prev;
            Node front = temp.next;
            if(front == null){
                prev.next = null;
                temp.prev = null;
            }
            prev.next = front;
            front.prev = prev;
            return head;
        }
    }   
    public static void main(String[] args){
        int[] arr = {1,3,2,4};
        Node head = Node.convertarrtoDLL(arr);
        head = Node.deleteNode(head,2);
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
 