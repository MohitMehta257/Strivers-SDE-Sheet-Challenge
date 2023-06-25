import java.util.*;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        //    Write your code here.
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        combinations(0,arr,target,ans,new ArrayList<>());

        return ans;
    }

    public static void combinations(int index, ArrayList<Integer> arr, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> list)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=index;i<arr.size();i++)
        {
            if(i>index && arr.get(i)==arr.get(i-1))
            {
                continue;
            }

            if(arr.get(i)>target)
            {
                break;
            }

            list.add(arr.get(i));
            combinations(i+1,arr,target-arr.get(i),ans,list);
            list.remove(list.size()-1);
        }
    }
}
