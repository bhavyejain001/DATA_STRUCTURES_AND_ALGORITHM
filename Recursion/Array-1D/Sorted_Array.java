
public class Sorted_Array {
	public static void main(String[] args) {
		int[] arr= {10, 20,90,100,120};
		int n=arr.length;
		if(sorted(arr,n)) {
			System.out.println("Given Array is Sorted");
		}else {
			System.out.println("Given Array is not Sorted");
		}
	}
	public static boolean sorted(int[] arr,int n) {
		if(n==0 || n==1) {
			return true;
		}
		if(arr[n-1]<arr[n-2]) {
			return false;
		}
		return sorted(arr,n-1);
	}
}
