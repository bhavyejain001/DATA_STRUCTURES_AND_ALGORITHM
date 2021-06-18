
/*	Input: nums = [3,1,2,4]
	Output: [2,4,3,1]
	The outputs [4,2,3,1], [2,4,1,3],
	and [4,2,1,3] would also be accepted.*/

import java.util.Arrays;

public class Sort_Array_By_Parity {
	
	public static void main(String[] args) {
		int[] nums= {3,1,2,4};
		int[] result=sortParityArray(nums);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] sortParityArray(int[] nums) {
		 int[] arr=new int[nums.length];
         int start=0;
           int end=nums.length-1;
       for(int i=0;i < nums.length;i++){
               if(nums[i]%2==0){
                   arr[start]=nums[i];
                   start++;
               }else{
                   arr[end]=nums[i];
                   end--;
               }
           }
       return arr;
	}
}
