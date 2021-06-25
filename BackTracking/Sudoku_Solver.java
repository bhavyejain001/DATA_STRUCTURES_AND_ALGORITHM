
public class Sudoku_Solver {
	
	static void printSolution(int[][] mat) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) 
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
	}
	
	static boolean isSafe(int[][] mat,int row,int col,int num) {
		
		for(int i=0;i<=8;i++) {
			if(mat[i][col]==num) 
				return false;
		}
		
		for(int i=0;i<=8;i++) {
			if(mat[row][i]==num) 
				return false;
		}
		int start=row-row%3;
		int end=col-col%3;
		for(int i=0;i<3;i++) 
			for(int j=0;j<3;j++) 
				if(mat[start+i][end+j]==num) 
					return false;
		return true;
	}
		
	
	static boolean sudokuSolver(int[][] mat,int row,int col) {
		if(row==mat.length-1 && col==mat.length) { 
			return true;
		}
		
		if (col == mat.length) {
            row++;
            col = 0;
        }
		
		if(mat[row][col]!=0) {
			return sudokuSolver(mat, row, col+1);
		}
		
		for(int num=1;num<10;num++) {
			if(isSafe(mat,row,col,num)) {
				mat[row][col]=num;
				if(sudokuSolver(mat, row, col+1))
					return true;
			}
			mat[row][col]=0;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[][] mat={ { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
	                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
	                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
	                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
	                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
	                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
	                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
	                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
	                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };;
		if(sudokuSolver(mat,0,0)) {
			printSolution(mat);	
		}else {
			System.out.println("no");
		}
	}
}
