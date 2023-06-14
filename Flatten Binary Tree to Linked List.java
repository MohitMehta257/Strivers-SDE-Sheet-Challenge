import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure.

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/

public class Solution 
{
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        // Write your code here.
		Stack<TreeNode<Integer>> stack=new Stack<>();
		stack.push(root);

		while(!stack.isEmpty())
		{
			TreeNode<Integer> node=stack.pop();

			if(node.right!=null)
			{
				stack.push(node.right);
			}

			if(node.left!=null)
			{
				stack.push(node.left);
			}

			if(!stack.isEmpty())
			{
				node.right=stack.peek();
			}

			node.left=null;
		}

		return root;
    }
}
