
/*Spiral Matrix:-
			
			 1  ->  2 -> 3 -> 4
			 				  |
		     12 -> 13 -> 14   5
			  |		     | 	  |
		     11    16 <- 15   6 
		      |				  |
		     10 <- 9  <- 8 <- 7 		
		     								**/
public class Spiral_Matrix {
	public static void main(String[] args) {
		int[] arr1= { 1 , 2 , 3 , 4 ,5 , 6 , 7 , 8 ,9 , 10 , 11 , 12 ,13 , 14, 15 , 16};
		int r=4;
		int c=4;
		int[][] arr=new int[r][c];
		int top=0,left=0;
		int bottom=r-1,right=c-1;
		int index=0;
		while(left < right) {
			
			if(left > right)
				break;
			for(int i=left;i<=right;i++) 
				arr[top][i]=arr1[index++];
			top++;
			
			if(top > bottom)
				break;
			for(int i=top;i<=bottom ;i++) 
				arr[i][right]=arr1[index++];
			right--;
			
			if(left > right)
				break;
			for(int i=right;i>=left;i--) 
				arr[bottom][i]=arr1[index++];
			bottom--;
			
			if(top > bottom)
				break;
			for(int i=bottom;i>=top ;i--) 
				arr[i][left]=arr1[index++];
			left++;
		
	}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(" "+arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

