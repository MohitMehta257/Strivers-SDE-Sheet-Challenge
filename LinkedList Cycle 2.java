/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static Node firstNode(Node head) {
        // Write your code here.
        Node slow=head;
        Node fast=head;

        boolean iscycle=false;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            {
                iscycle=true;
                break;
            }
        }

        if(iscycle==false)
        {
            return null;
        }
        
        fast=head;

        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }

        return fast;
    }
}       
