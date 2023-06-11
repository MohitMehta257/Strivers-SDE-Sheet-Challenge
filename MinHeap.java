import java.util.* ;
import java.io.*; 

public class Solution {

    // minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        List<Integer> list=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int[] row:q)
        {
            if(row[0]==0)
            {
                pq.add(row[1]);
            }

            else if(row[0]==1)
            {
                list.add(pq.remove());
            }
        }
        int[] ans=new int[list.size()];

        for(int i=0;i<ans.length;i++)
        {
            ans[i]=list.get(i);
        }
        return ans;

    }
}
