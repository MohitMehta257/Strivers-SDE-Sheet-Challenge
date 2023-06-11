import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
		LinkedListNode<Integer> prev=null;
		LinkedListNode next;

		while(head!=null)
		{
			next=head.next;
			head.next=prev;

			prev=head;
			head=next;
		}

		return prev;
	    }
}
