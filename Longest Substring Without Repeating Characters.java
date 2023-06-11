import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		int ans=0;
		int l=0;

		Set<Character> set=new HashSet<>();

		for(int r=0;r<input.length();r++)
		{
			if(set.contains(input.charAt(r)))
			{
				while(l<r && set.contains(input.charAt(r)))
				{
					set.remove(input.charAt(l));
					l++;
				}
			}

			set.add(input.charAt(r));
			ans=Math.max(ans,r-l+1);
		}

		return ans;
	}
}
