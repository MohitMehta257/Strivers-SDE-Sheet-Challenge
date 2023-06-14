import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static ArrayList < Integer > dijkstra(ArrayList< ArrayList < Integer > > vec, int vertices, int edges, int source){
		ArrayList<ArrayList<Pair>> graph=new ArrayList<>();
		
		for(int i=0;i<vertices;i++)
		{
			graph.add(new ArrayList<>());
		}

		for(ArrayList<Integer> arr:vec)
		{
			graph.get(arr.get(0)).add(new Pair(arr.get(1),arr.get(2)));
			graph.get(arr.get(1)).add(new Pair(arr.get(0),arr.get(2)));
		}

		PriorityQueue<Pair> pq=new PriorityQueue<>((x,y)->x.first-y.first);
		int[] parent=new int[vertices];
		int[] dist=new int[vertices];

		Arrays.fill(dist,Integer.MAX_VALUE);

		for(int i=0;i<parent.length;i++)
		{
			parent[i]=i;
		}

		dist[source]=0;
		pq.add(new Pair(0,0));
		
		while(!pq.isEmpty())
		{
			Pair it=pq.remove();
			int node=it.second;
			int dis=it.first;

			for(Pair iter:graph.get(node))
			{
				int adjnode=iter.first;
				int edw=iter.second;

				if(dis+edw<dist[adjnode])
				{
					dist[adjnode]=dis+edw;
					pq.add(new Pair(dis+edw,adjnode));
					parent[adjnode]=node;
				}
			}
		}

		ArrayList<Integer> ans=new ArrayList<>();
		/*if(dist[vertices-1]==1e9)
		{
			ans.add(-1);
			return ans;
		}

		int node=vertices-1;
		
		while(parent[node]!=node)
		{
			ans.add(node);
			node=parent[node];
		}
		ans.add(0);
		return ans;*/
		
		for(int i=0;i<dist.length;i++)
		{
			ans.add(dist[i]);
		}
		return ans;
	}
}

class Pair{
	int first;
	int second;

	public Pair(int first, int second)
	{
		this.first=first;
		this.second=second;
	}
}
