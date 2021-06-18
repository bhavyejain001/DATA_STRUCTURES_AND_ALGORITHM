
/*Given an array arr, replace every element in that array with 
the greatest element among the elements to its right, and 
replace the last element with -1.
Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]*/
		
import java.util.Arrays;

public class Greatest_Element_On_RightSide {
	public static void main(String[] args) {
		int[] arr= {17,18,5,4,6,1};
		int[] ans=new int[arr.length];
		int max=Integer.MIN_VALUE;
		for(int i=arr.length-1; i >0 ;i--) {
			max=Math.max(max,arr[i]);
			ans[i-1]=max;
		}
		ans[arr.length-1]=-1;
		System.out.println(Arrays.toString(ans));
	}
}
