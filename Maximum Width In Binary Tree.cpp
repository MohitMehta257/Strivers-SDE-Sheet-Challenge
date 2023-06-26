#include <bits/stdc++.h> 
/************************************************************

    Following is the TreeNode class structure

    template <typename T>
    class TreeNode {
       public:
        T val;
        TreeNode<T> *left;
        TreeNode<T> *right;

        TreeNode(T val) {
            this->val = val;
            left = NULL;
            right = NULL;
        }
    };

************************************************************/

int getMaxWidth(TreeNode<int> *root) {  

 if(root==NULL)   

 {        return 0;    

}    

queue<TreeNode<int> *> q;   

 q.push(root);int res=0;    

while(!q.empty())    {      

  int n=q.size();      

   res=max(res,n);     

   for(int i=0;i<n;i++)        {          

  TreeNode<int> *curr=q.front();          

  q.pop();                    

   if(curr->left!=NULL)         

   {                q.push(curr->left);            }        

    if(curr->right!=NULL)       

     {                q.push(curr->right);            }      

  } 

   }

    return res; 

}

