import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

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

	public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		List<Integer> arr=new ArrayList<>();
		inorder(root,arr);
		Collections.sort(arr);
		return arr.get(k-1);
	}

	public static void inorder(TreeNode<Integer> root, List<Integer> arr)
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
