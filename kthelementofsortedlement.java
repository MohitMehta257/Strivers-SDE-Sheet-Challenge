public class Solution {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        int[] sorted=new int[m+n];
        
        int i=0;
        int j=0;
        int d=0;

        while(i<m && j<n)
        {
            if(row1[i]<row2[j])
            {
                sorted[d++]=row1[i++];
            }
            else
            {
                sorted[d++]=row2[j++];
            }
        }

        while(i<m)
        {
            sorted[d++]=row1[i++];
        }

        while(j<n)
        {
            sorted[d++]=row2[j++];
        }

        return sorted[k-1];
    }
}
