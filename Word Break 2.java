import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static ArrayList<String> sentences;
	public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// Write your code here.
		Set<String> words=new HashSet<>(dictionary);
		sentences=new ArrayList<>();

		dfs(words,s,0,"");
		return sentences;
	}

	public static void dfs(Set<String> words, String s, int i, String sentence)
	{
		if(i==s.length())
		{
			sentences.add(sentence);
		}

		for(int j=i;j<s.length();j++)
		{
			String word=s.substring(i,j+1);

			if(words.contains(word))
			{
				if(sentence.length()==0)
				{
					dfs(words,s,j+1,sentence+word);
				}
				else
				{
					dfs(words,s,j+1,sentence+" "+word);
				}
			}
		}
	}
}
