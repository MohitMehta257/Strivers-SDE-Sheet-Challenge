import java.util.* ;
import java.io.*; 
public class Queue {
    List<Integer> list;
    Queue() {
        // Implement the Constructor
        list=new ArrayList<>();
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        if(list.size()==0)
        {
            return true;
        }

        return false;
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        list.add(data);
    }

    int dequeue() {
        // Implement the dequeue() function
        if(list.size()==0)
        {
            return -1;
        }

        return list.remove(0);
    }

    int front() {
        // Implement the front() function
        if(list.size()==0)
        {
            return -1;
        }

        return list.get(0);
    }

}
