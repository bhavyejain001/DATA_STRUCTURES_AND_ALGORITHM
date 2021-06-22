
public class Search_Element {
	public static void main(String[] args) {
		int[] arr= {1000, 10, 20,90,2000,120};
		int search_Element=2000;
		if(findElement(arr,0,arr.length-1,search_Element)) {
			System.out.println("Element is found");
		}else {
			System.out.println("Element is not found");
		}
	}
	
	static boolean findElement(int[] arr,int left,int right,int search_Element) {
		if(right < left) {
			return false;
		}
		if(arr[left]==search_Element || arr[right]==search_Element) {
			return true;
		}
		return findElement(arr, left+1, right-1, search_Element);
	}
}
