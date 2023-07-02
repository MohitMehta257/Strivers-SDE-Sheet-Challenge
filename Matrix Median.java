import java.util.ArrayList;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		int m=matrix.size();
		int n=matrix.get(0).size();

		int[][] arr=new int[m][n];

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=matrix.get(i).get(j);
			}
		}
		
		int low=1;
		int high=1000000009;

		while(low<=high)
		{
			int mid=(low+high)/2;

			int count=0;

			for(int i=0;i<m;i++)
			{
				count+=countsmaller(arr[i],mid);
			}

			if(count<=(m*n)/2)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}

		return low;
	}

	public static int countsmaller(int[] row, int mid)
	{
		int l=0;
		int h=row.length-1;

		while(l<=h)
		{
			int md=(l+h)/2;

			if(row[md]<=mid)
			{
				l=md+1;

			}

			else
			{
				h=md-1;
			}
		}

		return l;
	}
}
