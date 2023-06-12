public class Trie {


    //Initialize your data structure here
    Node root;
    Trie() {
        //Write your code here
        root=new Node();
    }


    //Inserts a word into the trie

    public void insert(String word) {
        //Write your code here
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);

            if(curr.children[ch-'a']==null)
            {
                curr.children[ch-'a']=new Node();
            }

            curr=curr.children[ch-'a'];
        }

        curr.isEnd=true;
    }


    //Returns if the word is in the trie

    public boolean search(String word) {
        //Write your code here

        Node curr=root;

        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);

            if(curr.children[ch-'a']==null)
            {
                return false;
            }

            curr=curr.children[ch-'a'];
        }

        return curr.isEnd;
    }

    
    //Returns if there is any word in the trie that starts with the given prefix

    public boolean startsWith(String prefix) {
        //Write your code here
        Node curr=root;

        for(int i=0;i<prefix.length();i++)
        {
            char ch=prefix.charAt(i);

            if(curr.children[ch-'a']==null)
            {
                return false;
            }

            curr=curr.children[ch-'a'];
        }

        return true;
    }
}

class Node{
    boolean isEnd=false;
    Node[] children=new Node[26];
}
