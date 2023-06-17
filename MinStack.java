import java.util.* ;
import java.io.*; 

public class Solution {

    static class MinStack {
        Stack<Integer> all=new Stack<>();
        Stack<Integer> min=new Stack<>();
        
        // Constructor
        MinStack() {
            // Write your code here.
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            // Write your code here.
            all.push(num);
            
            if(min.size()==0 || num<=min.peek())
            {
                min.push(num);
            }
        }

        // Function to remove the top element of the stack.
        int pop() {
            // Write your code here.
            if(all.size()==0)
            {
                return -1;
            }
            int val=all.pop();

            if(val==min.peek())
            {
                min.pop();
            }
                
            return val;
            
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            // Write your code here.
            if(all.size()==0)
            {
                return -1;
            }
            else

            {
                return all.peek();
            }
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            // Write your code here.
            if(all.size()==0)
            {
                return -1;
            }

            return min.peek();
                    }
    }
}
