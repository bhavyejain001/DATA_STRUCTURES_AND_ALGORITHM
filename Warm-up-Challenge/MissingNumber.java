
public class MissingNumber {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,7,8};
		System.out.println("Missing Number is:- "+missingNumber(arr));
	}
	public static int missingNumber(int[] arr) {
		int xorResult1=0;
		int xorResult2=0;
		int min=1;
		int max=arr.length+1;
		for(int i=min;i<=max;i++) {
			xorResult1 ^= i;
		}
		for(int i=0;i<arr.length;i++) {
			xorResult2 ^=arr[i];
		}
		return (xorResult1^xorResult2);
	}
}
