import java.util.*;

public class Solution {
	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		// Write your code here.
		int[][] dp=new int[n][w+1];

		for(int[] row:dp)
		{
			Arrays.fill(row,-1);
		}

		return f(n-1,w,n,values,weights,dp);
	}

	public static int f(int ind, int w, int n, ArrayList<Integer> values, ArrayList<Integer> weights, int[][] dp)
	{
		if(ind==0)
		{
			if(w>=weights.get(0))
			{
				return values.get(0);
			}
			else 
			{
				return 0;
			}
		}

		if(dp[ind][w]!=-1)
		{
			return dp[ind][w];
		}

		int nottake=f(ind-1,w,n,values,weights,dp);
		int take=Integer.MIN_VALUE;

		if(weights.get(ind)<=w)
		{
			take=values.get(ind)+f(ind-1,w-weights.get(ind),n,values,weights,dp);
		}

		dp[ind][w]=Math.max(take,nottake);
		return dp[ind][w];
	}
}
