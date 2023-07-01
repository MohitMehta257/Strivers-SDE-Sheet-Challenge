import java.io.*;
import java.util.* ;
/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/

public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		// Write your code here.

		Map<LinkedListNode<Integer>,LinkedListNode<Integer>> maps=new HashMap<>();

		LinkedListNode<Integer> temp=head;

		while(temp!=null)
		{
			LinkedListNode<Integer> copy=new LinkedListNode(temp.data);
			maps.put(temp,copy);
			temp=temp.next;

		}

		temp=head;

		while(temp!=null)
		{
			maps.get(temp).next=maps.get(temp.next);
			maps.get(temp).random=maps.get(temp.random);
			temp=temp.next;
		}

		return maps.get(head);
	}
}
