import java.util.* ;
import java.io.*; 

class Node
{
    Node[] children=new Node[26];
    int cntpre=0;
    int cntew=0;
}
public class Trie {
    Node root;
    public Trie() 
    {
        root=new Node();
    }

    public void insert(String word) 
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(curr.children[ch-'a']==null)
            {
                curr.children[ch-'a']=new Node();
            }
            curr=curr.children[ch-'a'];
            curr.cntpre++;
        }
        curr.cntew++;
    }

    public int countWordsEqualTo(String word)
    {
        Node curr=root;
        
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(curr.children[ch-'a']!=null)
            {
                curr=curr.children[ch-'a'];
            }
            else
            {
                return 0;
            }
        }
        return curr.cntew;
    }

    public int countWordsStartingWith(String word)
    {
        Node curr=root;
        
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(curr.children[ch-'a']!=null)
            {
                curr=curr.children[ch-'a'];
            }
            else
            {
                return 0;
            }
        }
        return curr.cntpre;
    }

    public void erase(String word) 
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(curr.children[ch-'a']!=null)
            {
                curr=curr.children[ch-'a'];
                curr.cntpre--;
            }
            else
            {
                return;
            }
        }
        
        curr.cntew--;
    }

}
