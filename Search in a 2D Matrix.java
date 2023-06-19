import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int m=mat.size();
        int n=mat.get(0).size();

        int low=0;
        int high=(m*n)-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(mat.get(mid/n).get(mid%n)==target)
            {
                return true;
            }
            if(mat.get(mid/n).get(mid%n)>target)
            {
                high=mid-1;
            }

            else
            {
                low=mid+1;
            }
        }

        return false;
    }
}
