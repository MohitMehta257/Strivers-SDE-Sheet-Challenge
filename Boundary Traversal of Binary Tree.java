import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> traverseBoundary(TreeNode root)
	{
		ArrayList<Integer> ans=new ArrayList<>();
		if(isleaf(root)==false)
		{
			ans.add(root.data);
		}


		addleftboundary(root,ans);
		addleaves(root,ans);
		addrightboundary(root,ans);

		return ans;
	}

	public static void addleftboundary(TreeNode root, ArrayList<Integer> res)
	{
		TreeNode curr=root.left;

		while(curr!=null)
		{
			if(isleaf(curr)==false)
			{
				res.add(curr.data);
			}

			if(curr.left!=null)
			{
				curr=curr.left;
			}
			else
			{
				curr=curr.right;
			}
		}
	}
	
	public static void addrightboundary(TreeNode root, ArrayList<Integer> res)
	{
		TreeNode curr=root.right;
		ArrayList<Integer> tmp=new ArrayList<>();

		while(curr!=null)
		{
			if(isleaf(curr)==false)
			{
				tmp.add(curr.data);
			}

			if(curr.right!=null)
			{
				curr=curr.right;
			}

			else
			{
				curr=curr.left;
			}
		}


		for(int i=tmp.size()-1;i>=0;--i)
		{
			res.add(tmp.get(i));
		}
	}

	public static void addleaves(TreeNode root, ArrayList<Integer> res)
	{
		if(isleaf(root))
		{
			res.add(root.data);
			return;
		}

		if(root.left!=null)
		{
			addleaves(root.left, res);
		}

		if(root.right!=null)
		{
			addleaves(root.right, res);
		}
	}
	public static boolean isleaf(TreeNode root)
	{
		if(root.right==null && root.left==null)
		{
			return true;
		}

		return false;
	}

}
