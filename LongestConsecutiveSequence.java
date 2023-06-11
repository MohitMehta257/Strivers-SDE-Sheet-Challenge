import java.io.*;
import java.util.* ;

public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        Set<Integer> set=new HashSet<>();

        int longeststreak=0;
        for(int i:arr)
        {
            set.add(i);
        }

        for(int num:arr)
        {
            if(!set.contains(num-1))
            {
                int current=num;
                int currentstreak=1;

                while(set.contains(current+1))
                {
                    current++;
                    currentstreak++;
                }

            longeststreak=Math.max(longeststreak,currentstreak);
            }
        }

        return longeststreak;
    }
}
