import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] arr, int n) {
        long[] leftmax=new long[n];
        long[] rightmax=new long[n];

        leftmax[0]=arr[0];
        rightmax[n-1]=arr[n-1];

        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }

        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }

        long ans=0;

        for(int i=0;i<n;i++)
        {
            ans+=(Math.min(leftmax[i],rightmax[i])-arr[i]);
        }

        return ans;
    }
}
