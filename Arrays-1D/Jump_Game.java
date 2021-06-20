
/*Given an array of non-negative integers nums, you are initially
positioned at the first index of the array.
Each element in the array represents your maximum jump length at
that position.

Determine if you are able to reach the last index.
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the 
last index*/


public class Jump_Game {
	public static void main(String[] args) {
		int arr[]= {2,0,0};
		boolean canJump=jumpGame(arr);
		System.out.println(canJump);
	}
	
	public static boolean jumpGame(int[] arr) {
		int max=arr[0];
        if(arr.length==1)return true;
        for(int i=0;i<arr.length;i++){
            if(max<=i && arr[i]==0)
                return false;
            if(i+arr[i] > max)
                max=i+arr[i];
            if(max >= arr.length-1)
                return true;
        }
        return false;
	}
}
