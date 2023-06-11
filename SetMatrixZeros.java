import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[] arr=new int[m];
        int[] col=new int[n];

        Arrays.fill(arr,-1);
        Arrays.fill(col,-1);

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    arr[i]=0;
                    col[j]=0;

                }
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]==0 || col[j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }

}
