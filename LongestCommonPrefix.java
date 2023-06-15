import java.util.*;
public class Solution {
	public static String longestCommonPrefix(String[] arr, int n) {
		// Write your code here
		Arrays.sort(arr);
		String p=arr[0];
		String q=arr[n-1];
		String ans="";

		for(int i=0;i<p.length();i++)
		{
			if(p.charAt(i)==q.charAt(i))
			{
				ans+=p.charAt(i);
			}
			else
			{
				break;
			}
		}

		return ans;
	}

}
