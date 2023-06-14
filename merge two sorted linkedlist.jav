import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		LinkedListNode<Integer> head=new LinkedListNode(0);

        LinkedListNode<Integer> p=head;
        if(first==null && second==null)
        {
            return null;
        }

        if(first==null)
        {
            return second;
        }

        if(second==null)
        {
            return first;
        }
        while(first!=null && second!=null)
        {
            if(first.data<=second.data)
            {
                p.next=first;
                first=first.next;
            }

            else
            {
                p.next=second;
                second=second.next;
            }

            p=p.next;

            if(first==null)
            {
                p.next=second;
            }

            else if(second==null)
            {
                p.next=first;
            }
        }

        return head.next;
	}
}
