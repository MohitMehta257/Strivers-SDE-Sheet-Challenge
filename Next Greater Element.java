import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		Stack<Integer> stack=new Stack<>();
		int[] ans=new int[n];
		//Arrays.fill(ans,-1);

		stack.push(arr[n-1]);
		ans[n-1]=-1;
		for(int i=n-2;i>=0;i--)
		{
			while(stack.size()>0 && arr[i]>=stack.peek())
			{
				stack.pop();
			}

			if(stack.size()==0)
			{
				ans[i]=-1;
			}

			else
			{
				ans[i]=stack.peek();
			}

			stack.push(arr[i]);
		}
		return ans;
	}

}
