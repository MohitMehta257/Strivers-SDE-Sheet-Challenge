import java.util.*;


public class Solution {

	public static int minTimeToRot(int[][] grid, int n, int m)
	{
		Queue<Pair> queue=new LinkedList<>();
		int[][] vis=new int[n][m];

		int count=0;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(grid[i][j]==2)
				{
					queue.add(new Pair(i,j,0));
					vis[i][j]=1;
				}

				else 
				{
					vis[i][j]=0;
				}

				if(grid[i][j]==1)
				{
					count++;
				}
			}
		}

		int tm=0;

		int[] delrow={-1,1,0,0};
		int[] delcol={0,0,-1,1};

		int cnt=0;

		while(!queue.isEmpty())
		{
			int r=queue.peek().row;
			int c=queue.peek().col;
			int t=queue.peek().tm;

			tm=Math.max(tm,t);

			queue.remove();

			for(int i=0;i<4;i++)
			{
				int nrow=r+delrow[i];
				int ncol=c+delcol[i];

				if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1)
				{
					queue.add(new Pair(nrow,ncol,t+1));
					vis[nrow][ncol]=1;
					cnt++;
				}
			}
		}

		if(cnt!=count)
		{
			return -1;
		}

		return tm;
		
	}

}


class Pair{
	int row;
	int col;
	int tm;

	public Pair(int row, int col, int tm)
	{
		this.row=row;
		this.col=col;
		this.tm=tm;
	}
}
