
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1,2,2,2,3,4};
		int n=removeDuplicates(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public static  int removeDuplicates(int[] arr){
		int n=arr.length;
		int i=0;
		for(int j=0;j < n-1;j++) {
			if(arr[j]!=arr[j+1]) {
				arr[i++]=arr[j];
			}
		}
		arr[i++]=arr[n-1];// to store last element 
		return i;
	}
}
