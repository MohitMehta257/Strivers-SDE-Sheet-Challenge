import java.util.* ;
import java.io.*; 
public class Solution {
    static int bellmonFord(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
      // Write your code here.
      int[] dist=new int[n+1];
      long max=Long.MAX_VALUE;

      Arrays.fill(dist,1000000000);

      dist[src]=0;

      for(int i=1;i<=n-1;i++)
      {
        for(ArrayList<Integer> arr:edges)
        {
          if(dist[arr.get(0)]!=1e9 && dist[arr.get(0)]+arr.get(2)<dist[arr.get(1)])
          {
            dist[arr.get(1)]=dist[arr.get(0)]+arr.get(2);
          }
        }
      }

      return dist[dest];
    }
    
}
