import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        generate(0,arr,new ArrayList<>(),ans);
        return ans;
    }

    public static void generate(int index, int[] nums,ArrayList<Integer> list, ArrayList<ArrayList<Integer>> ans)
    {
        ans.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++)
        {
            if(i!=index && nums[i]==nums[i-1])
            {
                continue;
            }

            list.add(nums[i]);
            generate(i+1, nums, list, ans);
            list.remove(list.size()-1);
        }
    }
}
