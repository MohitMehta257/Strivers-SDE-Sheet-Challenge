import java.util.* ;
import java.io.*; 
public class Kthlargest {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int size;
    Kthlargest(int k, int[] arr) {
        // Write your code here
        size=k;
        for(int i:arr)
        {
            pq.add(i);
            if(pq.size()>k)
            {
                pq.remove();
            }
        }

    }

    void add(int num) {
        // Write your code here.
        pq.add(num);
        if(pq.size()>size)
        {
            pq.remove();
        }

    }

    int getKthLargest() {
        // Write your code here.
        return pq.peek();
    }
}
