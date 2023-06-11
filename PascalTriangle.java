import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) 
	{
		ArrayList<ArrayList<Long>> ans=new ArrayList<>();
		ArrayList<Long> l=new ArrayList<>();

		l.add((long)1);

		ans.add(new ArrayList<>(l));

		for(int i=1;i<n;i++)
		{
			ArrayList<Long> list=new ArrayList<>();
			list.add((long)1);

			for(int j=1;j<=i;j++)
			{
				if(j==i)
				{
					list.add((long)1);
					break;
				}

				long sum=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
				list.add(sum);
			}

			ans.add(new ArrayList<>(list));
		}

		return ans;
	}
}
