import java.util.HashSet;

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
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
        HashSet<Node> set=new HashSet<>();

        while(firstHead!=null)
        {
            set.add(firstHead);
            firstHead=firstHead.next;
        }

        while(secondHead!=null)
        {
            if(set.contains(secondHead))
            {
                return secondHead;
            }
            secondHead=secondHead.next;
        }
        return null;
    }
}
