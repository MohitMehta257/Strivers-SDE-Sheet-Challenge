import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		ArrayList<Long> arr=new ArrayList<>();

		while(head!=null)
		{
			arr.add((long)head.data);
			head=head.next;
		}

		ArrayList<Long> arr2=new ArrayList<>();

		for(int i=arr.size()-1;i>=0;i--)
		{
			arr2.add(arr.get(i));
		}

		return arr.equals(arr2);

		//return true;
	}
}
