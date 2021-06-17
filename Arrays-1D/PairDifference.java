import java.util.Arrays;

public class PairDifference {
	public static void main(String[] args) {
		int arr[]= { 1, 5, 2, 2, 2, 5, 5, 4 };
		int diff=2;
		findPair(arr , diff);
	}
	public static void findPair(int[] arr, int diff) {
		Arrays.sort(arr);
		int i=0;
		int j=0;
		int n=arr.length;
		
		while(i < n && j < n) {
			if(arr[j]-arr[i] > diff) {
				i++;
			}
			if(arr[j] - arr[i] < diff) {
				j++;
			}
			else {
				System.out.println("(" + arr[j] + ", " + arr[i] + ")");
				return;
			}
		}
		System.out.println("Pair not Found");
	}
}

	

