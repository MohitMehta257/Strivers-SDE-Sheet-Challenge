import java.util.*;
//Bellman Ford Algorithms

public class Solution {
  static int floydWarshall(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {

    int[] dist=new int[n+1];
    Arrays.fill(dist,(int)1e9);
    dist[src]=0;
    

    for(int i=0;i<n-1;i++)
    {

    
    for(ArrayList<Integer> arr:edges)
    {
      if(dist[arr.get(0)]!=(int)1e9 && dist[arr.get(0)]+arr.get(2)<dist[arr.get(1)])
      {
        dist[arr.get(1)]=dist[arr.get(0)]+arr.get(2);
      }
    }
    }
    return dist[dest];
  }

}
