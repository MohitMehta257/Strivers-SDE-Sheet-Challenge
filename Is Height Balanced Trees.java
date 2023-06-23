import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the Binary Tree node structure

class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

*************************************************************/
public class Solution {

	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		// Write your code here.
        if(root==null)
        {
            return true;
        }

        int lh=height(root.left);
        int rh=height(root.right);

        if(Math.abs(lh-rh)>1)
        {
            return false;
        }

        boolean leftb=isBalancedBT(root.left);
        boolean rightb=isBalancedBT(root.right);

        return leftb && rightb;
	}

    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return -1;
        }

        return Math.max(height(root.left),height(root.right))+1;
    }
}
