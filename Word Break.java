import java.util.* ;
import java.io.*;
public class Solution {
    public static Boolean wordBreak(String[] arr, int n, String target) {
        // Write your code here.
        Boolean[] dp=new Boolean[target.length()];
        
        Set<String> set=new HashSet<>();

        for(String str:arr)
        {
            set.add(str);
        }

        return check(0,target,set,dp);
    }

    public static Boolean check(int index, String target, Set<String> set, Boolean[] dp)
    {
        if(index==target.length())
        {
            return true;
        }

        if(dp[index]!=null)
        {
            return dp[index];
        }

        for(int i=index+1;i<=target.length();i++)
        {
            if(set.contains(target.substring(index,i)) && check(i,target,set,dp))
            {
                return dp[index]=true;
            }
        }

        return dp[index]=false;
    }
}
