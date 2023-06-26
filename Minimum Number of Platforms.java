import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);

        int plat_needed=1;
        int result=1;
        int i=1;
        int j=0;

        while(i<n && j<n)
        {
            if(at[i]<=dt[j])
            {
                i++;
                plat_needed++;
            }

            else if(dt[j]<=at[i])
            {
                j++;
                plat_needed--;
            }

            if(plat_needed>result)
            {
                result=plat_needed;
            }
        }

        return result;
    }
}
