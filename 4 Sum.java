import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Arrays.sort(arr);

      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          int l=j+1;
          int r=n-1;

          int sum=target-(arr[i]+arr[j]);

          while(l<r)
          {
            if(sum==arr[l]+arr[r])
            {
              return "Yes";
            }

            else if(sum<arr[l]+arr[r])
            {
              r--;
            }

            else
            {
              l++;
            }
          }
        }
      }

      return "No";
  }
}
