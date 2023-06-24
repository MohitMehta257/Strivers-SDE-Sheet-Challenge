import java.util.* ;
import java.io.*; 
public class Solution {
    public static int allocateBooks(ArrayList<Integer> arr, int n, int m) {
        int s=0;
        int sum=0;

        for(int i:arr)
        {
            sum+=i;
        }

        int e=sum;
        int mid=s+(e-s)/2;
        int ans=-1;

        while(s<=e)
        {
            if(ispossible(arr,n,m,mid))
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }

            mid=s+(e-s)/2;
        }

        return ans; 
    }

    public static boolean ispossible(ArrayList<Integer> arr, int n, int m, int mid)
    {
        int studentcount=1;
        int pagesum=0;

        for(int i=0;i<n;i++)
        {
            if(pagesum+arr.get(i)<=mid)
            {
                pagesum+=arr.get(i);
            }

            else
            {
                studentcount++;
                if(studentcount>m || arr.get(i)>mid)
                {
                    return false;
                }

                pagesum=arr.get(i);
            }
        }

        return true;
    }
}
