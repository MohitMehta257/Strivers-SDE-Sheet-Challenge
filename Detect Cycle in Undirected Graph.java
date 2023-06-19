import java.util.ArrayList;

public class Solution {
    
    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<n+1;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int[] row:edges)
        {
            adj.get(row[0]).add(row[1]);
            adj.get(row[1]).add(row[0]);
        }

        boolean[] vis=new boolean[n+1];
        
        String ans="";

        for(int i=1;i<=n;i++)
        {
            if(vis[i]==false)
            {
                if(dfs(adj,vis,-1,i))
                {
                    return "Yes";
                }
            }
        }

        return "No";
    }

    public static Boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int parent, int i)
    {
        vis[i]=true;

        for(int child:adj.get(i))
        {
            if(vis[child]==false)
            {
                if(dfs(adj,vis,i,child))
                {
                    return true;
                }
            }
            else if(child!=parent) 
            {
                return true;
            }
        }

        return false;
    }
    
}
