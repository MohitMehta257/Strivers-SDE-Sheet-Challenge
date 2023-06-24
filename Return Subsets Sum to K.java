import java.util.*;
public class Solution 
{
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        find(0,k,n,ans,arr,new ArrayList<>()); 
        return ans;
    }

    public static void find(int ind, int target, int n, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> arr, ArrayList<Integer> temp)
    {
        if(ind==n)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(temp));
                
            }
            
            return;
        }

        temp.add(arr.get(ind));
        find(ind+1,target-arr.get(ind),n,ans,arr,temp);
        temp.remove(temp.size()-1);
        find(ind+1,target,n,ans,arr,temp);
    }
}
