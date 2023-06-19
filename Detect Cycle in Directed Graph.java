import java.util.*;
public class Solution {
  public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
      int[] indegree=new int[n+1];
      
      Queue<Integer> queue=new LinkedList<>();
      ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
      
      for(int i=0;i<n+1;i++)
      {
        adj.add(new ArrayList<>());
      }

      for(ArrayList<Integer> arr:edges)
      {
        adj.get(arr.get(0)).add(arr.get(1));
      }
      
      
      for(int i=1;i<indegree.length;i++)
      {
        for(int j:adj.get(i))
        {
          indegree[j]++;
        }
      }

       for(int i=1;i<indegree.length;i++)
       {
         if(indegree[i]==0)
         {
           queue.add(i);
         }
       }

       int count=0;
       
       while(!queue.isEmpty())
       {
         int node=queue.remove();
         count++;

         for(int i:adj.get(node))
         {
           indegree[i]--;
           if(indegree[i]==0)
           {
             queue.add(i);
           }
         }    
       }

       return count==n?false:true;
  }
}
