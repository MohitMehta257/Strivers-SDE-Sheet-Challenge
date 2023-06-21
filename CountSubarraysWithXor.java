import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.

		Map<Integer,Integer> maps=new HashMap<>();
		maps.put(0,1);

		int xr=0;
		int count=0;


		for(int i=0;i<arr.size();i++)
		{
			xr=xr^arr.get(i);
			int k=xr^x;

			if(maps.containsKey(k))
			{
				count+=maps.get(k);
				
			}
		

			maps.put(xr,maps.getOrDefault(xr,0)+1);
		}

		return count;
	}
}
