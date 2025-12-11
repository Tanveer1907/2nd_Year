public class ll_cycle {
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
            for(int i = 1; i < arr.length; i++){
                Node temp = new Node(arr[i]);
                mover.next = temp;
                mover = temp;
            }
            return head;
        }
        public static boolean cycle(Node head){
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow== fast){
                    return true;
                }
            }
            return false;
        }
        public static int cycle_length(Node head){
            Node slow = head;
            Node fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    int count = 1;
                    Node temp = slow.next;
                    while(temp!=slow){
                        count++;
                        temp = temp.next;
                    }
                    return count;
                }
            }
            return 0;
        }
    }
    public static void main(String[] args){
        int[] arr= {1,4,2,5,3,6};
        Node head = Node.convertArrtoLL(arr);
        Node temp = head;
    Node third = head.next.next;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = third;       // cycle created
        boolean ans = Node.cycle(head);
        int loop = Node.cycle_length(head);
        System.out.println(loop);
    }
}

    

