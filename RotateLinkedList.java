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
 };

 *****************************************************************/

public class Solution {
    public static Node rotate(Node head, int k)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        
        Node temp=head;
        int length=1;

        while(temp.next!=null)
        {
            temp=temp.next;
            ++length;
        }

        temp.next=head;
        k=k%length;

        int end=length-k;

        while(end!=0)
        {
            temp=temp.next;
            end--;
        }

        head=temp.next;
        temp.next=null;
        return head;
    }
}
