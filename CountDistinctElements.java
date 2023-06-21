import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
		ArrayList<Integer> ans=new ArrayList<>();
		Map<Integer,Integer> maps=new HashMap<>();

		int i=0;
		int j=0;

		while(j<arr.size())
		{
			maps.put(arr.get(j),maps.getOrDefault(arr.get(j), 0)+1);
			
			if(j-i+1==k)
			{
				ans.add(maps.size());
				maps.put(arr.get(i),maps.get(arr.get(i))-1);
				if(maps.get(arr.get(i))==0)
				{
					maps.remove(arr.get(i));
				}
				i++;
			}
			
			j++;
			
		}

		return ans;
	}
}
