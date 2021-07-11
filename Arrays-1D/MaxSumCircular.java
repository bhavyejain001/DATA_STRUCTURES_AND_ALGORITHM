
public class MaxSumCircular {
	
	public static int kadaneSum(int[] arr) {
		int maxResult = 0 , max = 0;
		for(int i = 0 ; i < arr.length ;i++) {
			max += arr[i];
			if(max < 0) {
				max = 0;
			}
			if(maxResult < max) {
				maxResult = max;
			}
		}
		return maxResult;
	}
	
	public static int maxSumCircular(int[] arr) {
		int kadaneSum = kadaneSum(arr);
		int circularSum = 0;
		for(int i = 0 ;i < arr.length ;i++) {
			circularSum += arr[i];
			arr[i] = -arr[i];
		}
		circularSum += kadaneSum(arr);
		if(circularSum > kadaneSum) {
			return circularSum;
		}else {
			return kadaneSum;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,7,-1,4};
		System.out.println(maxSumCircular(arr));
	}
}
