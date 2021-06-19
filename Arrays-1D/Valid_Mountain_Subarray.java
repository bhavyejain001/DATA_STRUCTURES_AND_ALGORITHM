
/*				
 * Input: arr = [0,3,2,1] 
				Output: true

*/


public class Valid_Mountain_Subarray {
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,7,1};
		int i=0;
		int j;
		if(arr.length < 3) {
			System.out.println("Not A Valid Mountain Subarray");
			return;
		}
		for(i =1;i<arr.length;i++) {
			if(arr[i]<=arr[i-1]) {
				i -=1;
				break;
			}
		}
		for(j=arr.length-2;j >=0;j--) {
			if(arr[j] <= arr[j+1]) {
				j +=1;
				break;
			}
		}
		if(i!=j || i==0 || j==arr.length) {
			System.out.println("Not A Valid Mountain Subarray");
			return;
		}
		System.out.println("It is A Valid Mountain Subarray");
		
	}
}
