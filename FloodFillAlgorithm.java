public class Solution
{   
    static int[] delrow={-1,0,1,0};
    static int[] delcol={0,1,0,-1};
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        int inicolor=image[x][y];
        int[][] ans=image;

        dfs(x,y,ans,image,newColor,inicolor);
        return ans;
    }

    public static void dfs(int i, int j, int[][] ans, int[][] image, int newColor, int inicolor)
    {
        ans[i][j]=newColor;
        int m=ans.length;
        int n=ans[0].length;

        for(int k=0;k<4;k++)
        {
            int nrow=i+delrow[k];
            int ncol=j+delcol[k];

            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && image[nrow][ncol]==inicolor && ans[nrow][ncol]!=newColor)
            {
                dfs(nrow,ncol,ans,image,newColor,inicolor);
            }
        }

    }
}

