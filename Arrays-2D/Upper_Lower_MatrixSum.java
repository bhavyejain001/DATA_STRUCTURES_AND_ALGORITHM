
public class Upper_Lower_MatrixSum {
		public static void main(String[] args) {
			int[][] arr= {{1,2,3},
						  {4,5,6},
						  {7,8,9}};
			int upperSum=0;
			int lowerSum=0;
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(i <= j ) {
						upperSum +=arr[i][j];
					}
					if(i >= j) {
						lowerSum +=arr[i][j];
					}
				}
			}
			System.out.println("Upper Triangle Sum In Matrix: "+upperSum);
			System.out.println("Lower Triangle Sum In Matrix: "+lowerSum);
		}
}
