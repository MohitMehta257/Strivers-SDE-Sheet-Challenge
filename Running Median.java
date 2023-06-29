import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

public class Solution {
	public static void findMedian(int arr[])  {
        if(arr.length==0)return;
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        System.out.print(arr[0]+" ");
        maxheap.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=maxheap.peek()){
                maxheap.add(arr[i]);
            }
            else{
                minheap.add(arr[i]);
            }
            if(maxheap.size() > minheap.size()+1){
                minheap.add(maxheap.remove());
            }
            else if(minheap.size() > maxheap.size()){
                maxheap.add(minheap.remove());
            }
            if(maxheap.size()==minheap.size()){
                System.out.print((int)(maxheap.peek()+minheap.peek())/2+" ");
            }
            else{
                System.out.print(maxheap.peek()+" ");
            }
        }
    }
}
