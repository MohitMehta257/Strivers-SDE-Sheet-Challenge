import java.util.* ;
import java.io.*; 
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

import java.util.ArrayList;

public class Solution 
{
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  inorder, ArrayList<Integer>  preorder) 
    {
        //    Write your code here.
        if(inorder.size()!=preorder.size())
        {
            return null;
        }

        Map<Integer,Integer> maps=new HashMap<>();

        for(int i=0;i<inorder.size();i++)
        {
            maps.put(inorder.get(i),i);
        }

        return build(inorder,preorder,0,inorder.size()-1,0,preorder.size()-1,maps);

    }

    public static TreeNode<Integer> build(ArrayList<Integer> inorder, ArrayList<Integer> preorder, int is, int ie, int pi, int pe, Map<Integer,Integer> maps)
    {
        if(is>ie || pi>pe)
        {
            return null;
        }

        TreeNode<Integer> root=new TreeNode<Integer>(preorder.get(pi));

        int rootind=maps.get(preorder.get(pi));
        int numsleft=rootind-is;

        root.left=build(inorder, preorder, is, rootind-1, pi+1, pi+numsleft, maps);
        root.right=build(inorder, preorder, rootind+1, ie, pi+numsleft+1, pe, maps);

        return root;
    }
}
