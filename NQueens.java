import java.util.ArrayList;

public class Solution {
    static ArrayList<ArrayList<Integer>> ans;
    public static ArrayList<ArrayList<Integer>> solveNQueens(int n)
    {
        ans=new ArrayList<>();
        int[][] board=new int[n][n];

        int[] left=new int[n];
        int[] upperDia=new int[2*n-1];
        int[] lowerDia=new int[2*n-1];

        backtrack(0,board,left,upperDia,lowerDia,n);
        return ans;

    }

    public static void backtrack(int col, int[][] board,int[] left, int[] upperDia, int[] lowerDia, int n)
    {
        if(col==n)
        {
            ans.add(construct(board));
            return;
        }

        for(int i=0;i<n;i++)
        {
            if(left[i]==0 && lowerDia[i+col]==0 && upperDia[n-1+col-i]==0)
            {
                board[i][col]=1;
                left[i]=1;
                lowerDia[i+col]=1;
                upperDia[n-1+col-i]=1;
                backtrack(col+1,board,left,upperDia,lowerDia,n);
                board[i][col]=0;
                left[i]=0;
                lowerDia[i+col]=0;
                upperDia[n-1+col-i]=0;
            }
        }
    }

    public static ArrayList<Integer> construct(int[][] board)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                list.add(board[i][j]);
            }
            //ans.add(board[i]);
        }

        return list;
    }
}
