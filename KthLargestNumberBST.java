import java.util.* ;
import java.io.*; 
/*************************************************************
    Following is the Binary Search Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.ArrayList;

public class Solution {
	
	public static int KthLargestNumber(TreeNode<Integer> root, int k)
	{
		List<Integer> arr=new ArrayList<>();
		inorder(root,arr);
		Collections.sort(arr,Collections.reverseOrder());
		if(arr.size()<k)
		{
			return -1;
		}

		return arr.get(k-1);
		
	}

	public static void inorder(TreeNode<Integer> root,List<Integer> arr)
	{
		if(root==null)
		{
			return;
		}

		inorder(root.left,arr);
		arr.add(root.data);
		inorder(root.right,arr);
	}
}
