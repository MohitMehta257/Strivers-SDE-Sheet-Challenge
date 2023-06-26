	import java.util.* ;
	import java.io.*; 
	public class Solution {

		public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
			Arrays.sort(arr);
			ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

			Set<ArrayList<Integer>> map=new HashSet<>();

			for(int i=0;i<n;i++)
			{
				int left=i+1;
				int right=n-1;

				int sum=K-arr[i];

				while(left<right)
				{
					if(arr[left]+arr[right]==sum)
					{
						ArrayList<Integer> list=new ArrayList<>();
						list.add(arr[i]);
						list.add(arr[left]);
						list.add(arr[right]);

						map.add(list);
						left++;
					}

					else if(arr[left]+arr[right]>sum)
					{
						right--;
					}

					else if(arr[left]+arr[right]<sum)
					{
						left++;
					}
				}
			}

			ans.addAll(map);
			return ans;
		}
	}
