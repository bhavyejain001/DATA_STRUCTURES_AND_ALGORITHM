
public class find_Element_In_Matrix {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},
					  {4,5,6},
					  {7,8,9},
					  {10,11,12}}; 
		int searchElement=12;
		
		//O(N*N)
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr[i].length-1;j++) {
				if(searchElement==arr[i][j]) {
					System.out.println("True");
					return;
				}
			}		
		}
		System.err.println("False");
		
		//O(N+N)
		int i=0;
		int j=arr.length-2;
		while(i < arr.length && j >= 0) {
			if(arr[i][j] == searchElement) {
				System.out.println(i+" True "+j);
				return;
			}
			if(arr[i][j] < searchElement) {
				i++;
			}else {
				j--;
			}
		}
		System.err.println("False");
	}
}
