#include <bits/stdc++.h>

/************************************************************

 

Following is the Tree node structure

 

template <typename T>

class TreeNode

{

public :

T val;

TreeNode<T> *left;

TreeNode<T> *right;

 

TreeNode(T val)

{

this -> val = val;

left = NULL;

right = NULL;

}

};

 

************************************************************/

 

long long int dfs(TreeNode<int> * root , long long int& maxi){

 

// base case

if(!root)

return 0;

if(!root ->left and !root -> right)

return root -> val;

// recursive case

 

long long int left = dfs(root -> left , maxi);

long long int right = dfs(root -> right , maxi);

 

maxi = max(maxi , left + right + root -> val);

 

return root -> val + max( left , right);

 

}

 

long long int findMaxSumPath(TreeNode<int> *root)

{

// Write your code here.

if(!root)

return -1;

if(!root -> left and !root -> right)

return -1;

if(!root -> left or !root -> right)

return -1;

long long int maxi = 0;

dfs(root , maxi);

 

return maxi;

}
