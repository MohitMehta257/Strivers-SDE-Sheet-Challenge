/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.*;
public class Solution 
{
    public static String serializeTree(TreeNode<Integer> root)
    {
        if(root==null)
        {
            return "";
        }
        
        Queue<TreeNode<Integer>> queue=new LinkedList<>();
        StringBuilder res=new StringBuilder();
        
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            TreeNode<Integer> node=queue.poll();
            
            if(node==null)
            {
                res.append("# ");
                continue;
            }
            
            res.append(node.data+" ");
            queue.add(node.left);
            queue.add(node.right);
        }
        return res.toString();
    }
    
    public static TreeNode<Integer> deserializeTree(String data)
    {
        if(data=="")
        {
            return null;
        }
        
        Queue<TreeNode<Integer>> queue=new LinkedList<>();
        String[] values=data.split(" ");
        
        TreeNode<Integer> root=new TreeNode(Integer.parseInt(values[0]));
        queue.add(root);
        
        for(int i=1;i<values.length;i++)
        {
            TreeNode<Integer> parent=queue.poll();
            
            if(!values[i].equals("#"))
            {
                TreeNode<Integer> left=new TreeNode(Integer.parseInt(values[i]));
                parent.left=left;
                queue.add(left);
            }
            
            if (!values[++i].equals("#")) {
                TreeNode<Integer> right = new TreeNode(Integer.parseInt(values[i]));
                parent.right = right;
                queue.add(right);
            }
        }
        return root;
    }
}
