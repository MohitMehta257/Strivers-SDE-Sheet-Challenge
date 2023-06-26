import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int pre=1;
		int suff=1;
		int ans=Integer.MIN_VALUE;

		for(int i=0;i<n;i++)
		{
			if(pre==0)
			{
				pre=1;

			}

			if(suff==0)
			{
				suff=1;
			}

			pre=pre*arr.get(i);
			suff=suff*arr.get(n-1-i);

			ans=Math.max(ans,Math.max(pre,suff));
		}

		return ans;
	}
}
