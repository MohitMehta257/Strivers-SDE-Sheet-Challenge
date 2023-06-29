import java.util.* ;

 

import java.io.*; 

class Trie{

    Trie [] child;

    Trie(){

        child=new Trie[2];

        child[0]=null;

        child[1]=null;

    }

}

public class Solution {

    public static Trie insert(Trie root,int n){

        Trie temp=root;

        int i=0;

        while(i<32){

            int num=(n>>(31-i) &1);

            if(temp.child[num]!=null){

                temp=temp.child[num];

            }

            else{

                temp.child[num]=new Trie();

                temp=temp.child[num];

            }

            i++;

        }

        return root;

    }

    public static int maxxor(Trie root,int n){

        int i=0;

        Trie temp=root;

        int ans=0;

        while(i<32){

            int num=(n>>(31-i) &1);

            if(num==0 && temp.child[1]!=null){

                ans=ans+(int)Math.pow(2,31-i);

                temp

                =temp.child[1];

            }

            else if(num==1 && temp.child[0]!=null){

                ans=ans+(int)Math.pow(2,31-i);

                temp=temp.child[0];

            }

            else

            temp=temp.child[num];

 

            i++;

        }

        return ans;

    }

    public static int maximumXor(int[] A) {

        

        // Write your Code here

         int ans=0;

        Trie root=new Trie();

        for(int i=0;i<A.length;i++){

            root=insert(root, A[i]);

        }

 

        for(int i=0;i<A.length;i++){

            ans=Math.max(ans,maxxor(root, A[i]));

        }

        return ans;

    }

}

