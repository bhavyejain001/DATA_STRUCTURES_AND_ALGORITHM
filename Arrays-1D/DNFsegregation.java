import java.util.Arrays;

public class DNFsegregation {
	public static void main(String[] args) {
		int[] arr= { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 ,2};
		int left=0;
		int right=arr.length-1;
		int mid=0;
		int temp=0;
		while(mid <= right) {
			switch(arr[mid]) {
			case 0:{
				temp=arr[left];
				arr[left]=arr[mid];
				arr[mid]=temp;
				left++;
				mid++;
				break;
			}
			case 1:{
				mid++;
				break;
			}
			case 2:{
				temp=arr[mid];
				arr[mid]=arr[right];
				arr[right]=temp;
				right--;
				break;
			}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
