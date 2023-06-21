public class Solution 
{
    public static int getTotalIslands(int[][] mat) 
	{
        //Your code goes here
        int m=mat.length;
        int n=mat[0].length;

        boolean[][] vis=new boolean[m][n];

        int count=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(vis[i][j]==false && mat[i][j]==1)
                {
                    count++;
                    dfs(i,j,mat,vis);
                }
            }
        }
        return count;
    }

    public static void dfs(int i, int j, int[][] mat, boolean[][] vis)
    {
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length || vis[i][j]==true || mat[i][j]==0)
        {
            return;
        }

        vis[i][j]=true;

        dfs(i-1,j,mat,vis);
        dfs(i+1,j,mat,vis);
        dfs(i,j-1,mat,vis);
        dfs(i,j+1,mat,vis);
        dfs(i-1,j-1,mat,vis);
        dfs(i-1,j+1,mat,vis);
        dfs(i+1,j-1,mat,vis);
        dfs(i+1,j+1,mat,vis);
    }
}
