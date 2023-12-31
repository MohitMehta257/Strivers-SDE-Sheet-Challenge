import java.util.* ;
import java.io.*; 
/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/

public class Solution {
    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer> ans=new ArrayList<>();

        if(root==null)
        {
            return ans;
        }

        getpath(root,ans,x);
        return ans;
    }

    public static boolean getpath(TreeNode root, ArrayList<Integer> ans, int x)
    {
        if(root==null)
        {
            return false;
        }

        ans.add(root.data);

        if(root.data==x)
        {
            return true;
        }

        if(getpath(root.left,ans,x) || getpath(root.right,ans,x))
        {
            return true;
        }

        ans.remove(ans.size()-1);
        return false;
    }
}
