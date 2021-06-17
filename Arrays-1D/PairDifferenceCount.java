import java.util.Arrays;

public class PairDifferenceCount {
	
	public static void main(String[] args) {
		int arr[]= { 1, 5, 2, 2, 2, 5, 5, 4 };
		int diff=3;
		findPairs(arr , diff);
	}
	
	public static void findPairs(int[] arr, int diff) {
		Arrays.sort(arr);
		int i=0;
		int j=0;
		int n=arr.length;
		while( i < n && j < n) {
			// to avoid printing duplicates
			while(i < n-1 && arr[i]==arr[i+1]) {
				i++;
			}
			while(j < n-1 && arr[j]==arr[j+1]) {
				j++;
			}
			 if (arr[j] - arr[i] > diff) {
	                i++;
	        }
			 if (arr[j] - arr[i] < diff) {
	                j++;
	        }
			else {
	                System.out.println("(" + arr[j] + ", " + arr[i] + ")");
	                i++;
	                j++;
	        }
		}
	}
}
