import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{   
    //static int count=0;
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n=arr.size();
        int[] temp=new int[n];

        for(int i=0;i<n;i++)
        {
            temp[i]=arr.get(i);
        }

        return ms(temp,0,n-1);
        //return count;
    }

    public static int ms(int[] arr, int low, int high)
	{
        int count=0;
		if(low>=high)
		{
			return count;
		}

		int mid=(low+high)/2;
		count+=ms(arr,low,mid);
		count+=ms(arr,mid+1,high);
        count+=countpairs(arr,low,mid,high);
		merge(arr,low,mid,high);
        return count;
	}

    public static int countpairs(int[] arr, int low, int mid, int high)
    {
        int count=0;
        int right=mid+1;

        for(int i=low;i<=mid;i++)
        {
            while(right<=high && arr[i]>2*arr[right])
            {
                right++;
            }

            count+=(right-(mid+1));
        }

        return count;
    }

	public static void merge(int[] arr,int low, int mid, int high)
	{
		ArrayList<Integer> temp=new ArrayList<>();
		int left=low;
		int right=mid+1;

		while(left<=mid && right<=high)
		{
			if(arr[left]<=arr[right])
			{
				temp.add(arr[left]);
				left++;
			}

			else
			{
				temp.add(arr[right]);
				right++;
			}
		}

		while(left<=mid)
		{
			temp.add(arr[left]);
			left++;
		}

		while(right<=high)
		{
			temp.add(arr[right]);
			right++;
		}

		for(int i=low;i<=high;i++)
		{
			arr[i]=temp.get(i-low);
		}
	}
}
