
public class Count_Search_Element {
	public static void main(String[] args) {
		int[] arr= {1000, 10, 2000,90,2000,120,2000,2000};
		int search_Element=5;
		int count=0;
		System.out.println(findCount(arr,0,count,search_Element));
	}
	static int findCount(int[] arr,int startIndex,int count,int search_Element) {
		if(arr.length==0) {
			return 0;
		}
		if(arr[startIndex]==search_Element) {
			count++;
		}
		if(startIndex==arr.length-1) {
			return count;
		}
		return findCount(arr, startIndex+1,count, search_Element);
	}
}
