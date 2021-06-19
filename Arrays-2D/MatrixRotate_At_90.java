
public class MatrixRotate_At_90 {
	static int n=3;
	static int m=3;
	public static void main(String[] args) {
		int[][] arr= { {1,2,3},
					   {4,5,6},
					   {7,8,9}};
	
		transpose(arr);//transpose of a matrix
		reverseArray(arr); // reverse elements of a matrix
	}
	
	public static void transpose(int[][] arr) {
		for(int i=0 ;i < n;i++) {
			for(int j=i+1 ; j < n;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
	
	public static void reverseArray(int[][] arr) {
		//column wise elements reverse
		for(int j=0;j<m;j++) {
			int start=0;
			int end=n-1;
			while(start < end) {
				int temp=arr[start][j];
				arr[start][j]=arr[end][j];
				arr[end][j]=temp;
				start++;
				end--;
			}
		}
		System.out.println("After rotating matrix at 90 degree");
		for(int i = 0 ; i < n;i++) {
			for(int j=0;j < m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
