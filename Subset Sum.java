import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        ArrayList<Integer> ans=new ArrayList<>();
        subsum(0,0,ans,num);
        Collections.sort(ans);
        return ans;
    }

    public static void subsum(int ind, int sum, ArrayList<Integer> ans, int[] nums)
    {
        if(ind==nums.length)
        {
            ans.add(sum);
            return;        }

        subsum(ind+1,sum,ans,nums);
        subsum(ind+1,sum+nums[ind],ans,nums);
    }

}
