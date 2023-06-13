import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/

public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		ArrayList<Integer> ans=new ArrayList<>();
		if(root==null)
		{
			return  ans;
		}

		Map<Integer,Integer> map=new TreeMap<>();
		Queue<Pair> queue=new LinkedList<>();

		queue.add(new Pair(root,0));

		while(!queue.isEmpty())
		{
			Pair p=queue.remove();
			int hd=p.hd;

			BinaryTreeNode temp=p.node;

			if(map.get(hd)==null)
			{
				map.put(hd,temp.val);
			}

			if(temp.left!=null)
			{
				queue.add(new Pair(temp.left,hd-1));
			}

			if(temp.right!=null)
			{
				queue.add(new Pair(temp.right,hd+1));
			}


		}

		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			ans.add(entry.getValue());
		}

		return ans;
	}
}

class Pair{
	BinaryTreeNode node;
	int hd;

	public Pair(BinaryTreeNode node, int hd)
	{
		this.node=node;
		this.hd=hd;
	}
}
