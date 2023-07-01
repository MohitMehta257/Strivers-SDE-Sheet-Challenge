import java.util.*;

public class Solution {

    public static List<List<Integer>> stronglyConnectedComponents(int n, int[][] edges) {
        // Write your code here
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }

        for(int[] row:edges)
        {
            adj.get(row[0]).add(row[1]);
        }


        int[] vis=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
            {
                dfs(i,vis,adj,st);
            }
        }

        List<List<Integer>> adjT=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            adjT.add(new ArrayList<>());
        }

        Arrays.fill(vis,0);

        for(int i=0;i<n;i++)
        {
            for(int it:adj.get(i))
            {
                adjT.get(it).add(i);
            }
        }

        List<List<Integer>> ans=new ArrayList<>();

        while(!st.isEmpty())
        {
            int node=st.peek();
            st.pop();

            List<Integer> list=new ArrayList<>();
            if(vis[node]==0)
            {
                dfs3(node,vis,adjT,list);
            }

            ans.add(list);

        }

        return ans;
    }

    public static void dfs3(int node, int[] vis, List<List<Integer>> adjT, List<Integer> list)
    {
        vis[node]=1;
        list.add(node);

        for(int it:adjT.get(node))
        {
            if(vis[it]==0)
            {
                dfs3(it,vis,adjT,list);
            }
            
        }
    }

    public static void dfs(int node, int[] vis, List<List<Integer>> adj, Stack<Integer> st)
    {
        vis[node]=1;

        for(int it:adj.get(node))
        {
            if(vis[it]==0)
            {
                dfs(it,vis,adj,st);
            }
        }

        st.push(node);
    }
}
