import java.util.* ;
import java.io.*; 

/*************************************************************
 class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

*************************************************************/


public class Solution {
	static BinaryTreeNode<Integer> prev;
	static BinaryTreeNode<Integer> head;
	public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
		// Write your code here
		head=null;
		prev=null;
		
		f(root);
		return head;
		
	}

	public static void f(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}

		f(root.left);

		if(prev==null)
		{
			head=root;
		}

		else
		{
			root.left=prev;
			prev.right=root;
		}

		prev=root;
		f(root.right);
	}

}
