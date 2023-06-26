import java.util.*;
public class Solution {

    public static int minCharsforPalindrome(String str) 
    {
        int ans=0;
        int n=str.length();
        int left=0;
        int right=n-1;

        while(left<right)
        {
            if(str.charAt(left)==str.charAt(right))
            {
                left++;
                right--;
            }

            else
            {
                ans++;
                left=0;
                right=n-ans-1;
            }
        }

        return ans;
    }

}
