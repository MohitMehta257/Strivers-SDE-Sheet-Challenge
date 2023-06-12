import java.util.* ;
import java.io.*; 
public class Solution {

	public static int[] KMostFrequent(int n, int k, int[] arr)
	{

		Map<Integer,Integer> maps=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(maps.containsKey(arr[i]))
			{
				maps.put(arr[i],maps.get(arr[i])+1);
			}

			else
			{
				maps.put(arr[i],1);
			}
		}

		PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->maps.get(a)-maps.get(b));

		for(int i:maps.keySet())
		{
			queue.add(i);
			if(queue.size()>k)
			{
				queue.poll();
			}
		}

		int[] ans=new int[k];
		int i=0;

		while(!queue.isEmpty())
		{
			ans[i]=queue.poll();
			i++;
		}

		return ans;
	}

}
