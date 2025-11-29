public class addition_2num_ll {
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
        public static Node addition(Node head1, Node head2){
            Node t1 = head1;
            Node t2 = head2;
            int carry = 0;
            Node dummy = new Node(-1);
            Node curr = dummy;
            while(t1!=null || t2!=null){
                int sum = carry;
                if(t1!=null){
                    sum+=t1.data;
                    t1 = t1.next;
                }
                if(t2!=null){
                    sum +=t2.data;
                    t2 = t2.next;
                }
                Node newNode = new Node(sum%10);
                carry = sum/10;
                curr.next = newNode;
                curr = curr.next;
            }
            if(carry>0){
                curr.next = new Node(carry);
            }
            return dummy.next;
        }
    }  
    public static void main(String[] args){
        int[] arr1 = {3,5};
        int[] arr2 = {4,5,9,9};
        Node head1 = Node.convertArrtoLL(arr1);
        Node head2 = Node.convertArrtoLL(arr2);
        Node ans = Node.addition(head1, head2);
        while(ans!=null){
            System.out.print(ans.data+" ");
            ans = ans.next;
        }
    }
}
