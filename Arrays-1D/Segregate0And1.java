import java.util.Arrays;

public class Segregate0And1 {
	public static void main(String[] args) {
		int arr[] = {0,0,0,0,0};
		int i=0;
		int j=arr.length-1;
		while(i < j) {
			if(arr[i] ==0 && i < j) {
				i++;
			}else if(arr[j] ==1 && i < j) {
				j--;
			}else if(i < j) {
				arr[i]=0;
				arr[j]=1;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
