import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        int[] freq=new int[n+1];

        for(int i=0;i<n;i++)
        {
            if(freq[arr.get(i)]==0)
            {
                freq[arr.get(i)]++;
            }
            else
            {
                return arr.get(i);
            }
        }

        return 0;
    }
}
