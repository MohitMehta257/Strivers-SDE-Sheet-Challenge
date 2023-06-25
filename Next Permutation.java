import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		//ArrayList<Integer> ans=new ArrayList<>();
		if(permutation.size()==1)
		{
			return permutation;
		}
		int n=permutation.size();
		int ind=-1;

		for(int i=n-2;i>=0;i--)
		{
			if(permutation.get(i)<permutation.get(i+1))
			{
				ind=i;
				break;
			}
		}

		if(ind==-1)
		{
			Collections.reverse(permutation);
			return permutation;
		}

		for(int i=n-1;i>ind;i--)
		{
			if(permutation.get(ind)<permutation.get(i));
			{
				int num=permutation.get(i);
				permutation.set(i,permutation.get(ind));
				permutation.set(ind,num);
				break;
			}
		}

		ArrayList<Integer> list=new ArrayList<>();
		for(int i=ind+1;i<n;i++)
		{
			list.add(permutation.get(i));
		}

		Collections.reverse(list);

		int m=ind+1;
		for(int i=0;i<list.size();i++)
		{
			permutation.set(m,list.get(i));
			m++;
		}

		return permutation;


	}
}
