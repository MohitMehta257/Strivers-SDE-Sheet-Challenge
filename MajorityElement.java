import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		Map<Integer,Integer> maps=new HashMap<>();

		for(int i:arr)
		{
			if(maps.containsKey(i)==false)
			{
				maps.put(i,1);
			}
			else
			{
				maps.put(i,maps.get(i)+1);
			}
		}

		for(int i:arr)
		{
			if(maps.get(i)>Math.floor(n/2))
			{
				return i;
			}
		}

		return -1;
	}
}
