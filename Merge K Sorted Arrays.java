import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		PriorityQueue<Integer> queue=new PriorityQueue<>();

		for(ArrayList<Integer> list:kArrays)
		{
			for(int i:list)
			{
				queue.add(i);
			}
		}

		ArrayList<Integer> ans=new ArrayList<>();

		while(!queue.isEmpty())
		{
			ans.add(queue.poll());
		}

		return ans;
	}
}
