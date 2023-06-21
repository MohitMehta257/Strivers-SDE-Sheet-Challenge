import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.
		if(root.left==null && root.right==null)
		{
			return false;
		}
		List<Integer> arr=new ArrayList<>();
		inorder(root,arr);
		return find(0,arr.size()-1,k,arr);
	}

	public static void inorder(BinaryTreeNode root,List<Integer> arr)
	{
		if(root==null)
		{
			return;
		}

		inorder(root.left,arr);
		arr.add(root.data);
		inorder(root.right,arr);
	}

	public static boolean find(int l, int r, int k,List<Integer> arr)
	{
		Collections.sort(arr);
		while(l<r)
		{
			if(arr.get(l)+arr.get(r)==k)
			{
				return true;
			}

			else if((arr.get(l)+arr.get(r))>k)
			{
				r--;
			}

			else if((arr.get(l)+arr.get(r))<k)
			{
				l++;
			}
		}

		return false;
	}
}

