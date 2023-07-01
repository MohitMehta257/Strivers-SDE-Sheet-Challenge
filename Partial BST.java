import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

 *************************************************************/

public class Solution {
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        // Write your code here

        if(root==null || (root.left==null && root.right==null))
        {
            return true;
        }

        boolean left=validateBST(root.left);
        boolean right=validateBST(root.right);

        boolean ans=true;

        if(root.left!=null)
        {
            ans=ans &&(root.data>=root.left.data);
        }

        if(root.right!=null)
        {
            ans=ans &&(root.data<=root.right.data);
        }

        return ans && left && right;
    }
}
