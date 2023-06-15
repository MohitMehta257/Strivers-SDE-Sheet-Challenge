import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
		int l=0;
		int r=0;
		int zero=0;

		int ans=0;

		while(r<arr.size())
		{
			if(arr.get(r)==0)
			{
				zero++;
			}

			while(zero>k)
			{
				ans=Math.max(ans,r-l);

				if(arr.get(l)==0)
				{
					zero--;
				}

				l++;
			}
			r++;
		}
		ans=Math.max(ans,r-l);
		return ans;
	}
}
