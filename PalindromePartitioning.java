import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        dfs(0,new ArrayList<>(), ans, s);
        return ans;
    }

    public static void dfs(int start, List<String> curr, List<List<String>> ans, String s)
    {
        if(start==s.length())
        {
            ans.add(new ArrayList<>(curr));
        }

        for(int i=start;i<s.length();i++)
        {
            if(palindrome(s,start,i))
            {
                curr.add(s.substring(start,i+1));
                dfs(i+1,curr,ans,s);
                curr.remove(curr.size()-1);
            }
        }
    }

    public static boolean palindrome(String s, int low, int high)
    {
        while(low<high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }

        return true;
    }
}
