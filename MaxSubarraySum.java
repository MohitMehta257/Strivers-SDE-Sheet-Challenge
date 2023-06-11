import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long maximum=Long.MIN_VALUE;
		long local=0;
		long sum=0;

		long count=0;

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				count++;
			}
		}

		if(count==arr.length)
		{
			return 0;
		}

		for(int i=0;i<arr.length;i++)
		{
			sum+=(long)arr[i];

			maximum=Math.max(maximum,sum);

			if(sum<0)
			{
				sum=0;

			}
		}

		return maximum;
	}

}
