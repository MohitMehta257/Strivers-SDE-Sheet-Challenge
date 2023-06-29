import java.util.*;
public class Solution {
    public static int[] findMedian(int[] arr, int n) {
        // Write your code here.
        int[] ans=new int[n];
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minheap=new PriorityQueue<>();

        ans[0]=arr[0];
        maxheap.add(arr[0]);

        for(int i=1;i<n;i++)
        {
            if(arr[i]<=maxheap.peek())
            {
                maxheap.add(arr[i]);
            }

            else
            {
                minheap.add(arr[i]);
            }

            if(maxheap.size()>minheap.size()+1)
            {
                minheap.add(maxheap.remove());
            }

            else if(minheap.size()>maxheap.size())
            {
                maxheap.add(minheap.remove());
            }

            if(maxheap.size()==minheap.size())
            {
                ans[i]=(minheap.peek()+maxheap.peek())/2;
            }

            else 
            {
                ans[i]=maxheap.peek();
            }
        }

        return ans;
    }
}
