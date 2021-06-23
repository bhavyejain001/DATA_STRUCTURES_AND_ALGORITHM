
public class Product_Of_Array {
	
	static int productArray(int[] arr,int index) {
		if(index==arr.length) {
			return 1;
		}
		return arr[index]*productArray(arr, index+1);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		System.out.println(productArray(arr,0));
	}
}
