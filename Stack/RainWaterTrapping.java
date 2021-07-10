import java.util.Stack;

public class RainWaterTrapping {
	
	// Using stack
	static int trapWater4(int[] arr,int n) {
		int maxWater = 0;
		Stack<Integer> stack = new Stack<>();
		int current = 0;
		while(current < n) {
			while(!stack.isEmpty() && arr[current] > stack.peek()) {
				int top = stack.peek();
				stack.pop();
			
			if(stack.isEmpty()) 
				break;
			
			int distance = current - stack.peek() - 1;
			int bounded_height = Math.min(arr[current], arr[stack.peek()]) - arr[top];
			maxWater += distance * bounded_height;
			}
			stack.push(current);
			current += 1;
		}
		return maxWater;
	}
	
	// Dp Approach
	static int trapWater3(int[] arr,int n) {
		int maxWater = 0;
		int left_max[] = new int[n] ;
		int right_max[] = new int[n]; 
		left_max[0] = arr[0];
		for(int i = 1 ;i < n;i++) {
			left_max[i] = Math.max(left_max[i-1], arr[i]);
		}
		right_max[n-1] = arr[n-1];
		for(int i = n-2;i>=0 ;i--) {
			right_max[i] = Math.max(right_max[i+1], arr[i]);
		}
		for(int i = 0 ; i < n-1 ;i++) {
			maxWater += Math.min(left_max[i], right_max[i]) - arr[i];
		}
		return maxWater;
	}
	
	//  Naive Approach
	static int trapwater2(int[] arr, int n) {
		int result = 0;
		int left = 0 ,right = 0;
		for(int i = 0 ;i < n;i++) {
			left = arr[i];
			for(int j = 0 ;j < i;j++) {
				left = Math.max(left , arr[j]);
			}
			right = arr[i];
			for(int j = i+1;j<n;j++) {
				right = Math.max(right, arr[j]);
			}
			result += Math.min(left, right) - arr[i];
		}
		return result;
	}
	
	// Optimised Approach Using Two Pointer
	static int trapWater(int[] arr,int n) {
		int result = 0;
		int low = 0 , high =n-1;
		int left = 0 , right =0;
		while(low <= high) 
		{
			if(arr[low] < arr[high]) 
			{
				if(arr[low] > left) 
				{
					left = arr[low];
				}
				else 
				{
					result += left - arr[low];
				}
				low++;
			}
			else 
			{
				if(arr[high] > right) 
				{
					right = arr[high];
				}else 
				{
					result += right - arr[high];
				}
				high--;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,0,2};
		int n =arr.length;
		System.out.println(trapWater(arr,n));
		System.out.println(trapwater2(arr,n));
		System.out.println(trapWater3(arr,n));
		System.out.println(trapWater4(arr,n));
	}
}
