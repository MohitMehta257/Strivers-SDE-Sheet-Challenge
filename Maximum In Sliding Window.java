import java.util.* ;
import java.io.*; 

import java.util.ArrayList;

public class Solution 
{

	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

		ArrayList<Integer> ans=new ArrayList<>();

		for(int i=0;i<k;i++)
		{
			pq.add(nums.get(i));
		}

		ans.add(pq.peek());

		int j=0;

		for(int i=k;i<nums.size();i++)
		{
			pq.add(nums.get(i));
			pq.remove(nums.get(j));
			j++;
			ans.add(pq.peek());
		}

		return ans;
	}
}
