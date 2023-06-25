import java.util.*;
public class Solution {
	public static int cutRod(int price[], int n) {
		// Write your code here.
		int[][] dp=new int[n][n+1];

		for(int[] row:dp)
		{
			Arrays.fill(row,-1);
		}

		return f(price,n-1,n,dp);
	}

	public static int f(int[] price, int ind, int n, int[][] dp)
	{
		if(ind==0)
		{
			return n*price[0];
		}

		if(dp[ind][n]!=-1)
		{
			return dp[ind][n];
		}

		int notTaken=f(price,ind-1,n,dp);
		
		int taken=Integer.MIN_VALUE;

		int rodlength=ind+1;

		if(rodlength<=n)
		{
			taken=price[ind]+f(price,ind,n-rodlength,dp);
		}

		return dp[ind][n]=Math.max(taken,notTaken);
	}
}
