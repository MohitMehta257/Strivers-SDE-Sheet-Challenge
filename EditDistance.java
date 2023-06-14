import java.util.*;
public class Solution {

    public static int editDistance(String str1, String str2) {
        int m=str1.length();
        int n=str2.length();

        int[][] dp=new int[m][n];

        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }

        return f(0,0,m,n,str1,str2,dp);
    }

    public static int f(int i, int j, int m, int n, String str1, String str2, int[][] dp)
    {
        if(i>=m)
        {
            return n-j;
        }

        if(j>=n)
        {
            return m-i;
        }


        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        if(str1.charAt(i)==str2.charAt(j))
        {
            dp[i][j]=f(i+1,j+1,m,n,str1,str2,dp);
        }

        else
        {
            int insert=1+f(i,j+1,m,n,str1,str2,dp);
            int replace=1+f(i+1,j+1,m,n,str1,str2,dp);
            int delete=1+f(i+1,j,m,n,str1,str2,dp);

            dp[i][j]=Math.min(insert,Math.min(replace,delete));
        }

        return dp[i][j];
    }
}
