import java.util.* ;

import java.io.*; 
/*
	
	Following is the Binary Tree node structure:

	public class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.data = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	       this.data = val;
	        this.left = left;
	        this.right = right;
	    }
	}

*/

public class Solution {
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	List<Integer> ans=new LinkedList<>();
		if(root==null)
		{
			return ans;
		}

		Stack<TreeNode> stack=new Stack<>();

		stack.push(root);

		while(!stack.isEmpty())
		{
			TreeNode node=stack.pop();

			ans.add(node.data);

			if(node.right!=null)
			{	
				stack.push(node.right);
			}

			if(node.left!=null)
			{
				stack.push(node.left);
			}
		}

		return ans;
    }
}
