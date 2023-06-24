import java.util.* ;
import java.io.*; 
 
 
/*************************************************************
	Following is the Binary Tree node structure
	class TreeNode<T> {
		public T data;
		public TreeNode<T> left;
		public TreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = right = null;
		}

};************************************************************/
public class Solution {
 
	public static TreeNode<Integer> preOrderTree(int[] preOrder) {
		return preorderbst(preOrder,Integer.MAX_VALUE,new int[]{0});
	}

	public static TreeNode<Integer> preorderbst(int[] preorder,int bound, int[] i)
	{
		if(i[0]==preorder.length || preorder[i[0]]>bound)
		{
			return null;
		}

		TreeNode<Integer> root=new TreeNode<Integer>(preorder[i[0]++]);
		root.left=preorderbst(preorder, root.data, i);
		root.right=preorderbst(preorder, bound, i);
		return root;
	}

}
