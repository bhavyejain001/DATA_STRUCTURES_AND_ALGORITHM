
import java.util.Arrays;

public class N_Queen {
	
//	static boolean isSafePlace(boolean[][] chessBoard,int row,int col) {
//		
//		for(int i=row,j=col;i>0 && j>0;i--,j--) {
//			if(chessBoard[i][j]) {
//				return false;
//			}
//		}
//		
//		for(int i=row;i>0;i--) {
//			if(chessBoard[i][col]) {
//				return false;
//			}
//		}
//		
//		for(int i=row,j=col;i>0&&j<chessBoard.length;i--,j++) {
//			if(chessBoard[i][j]) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	static int countQueenPlace(boolean[][] chessBoard,int currRow){
//		
//		if(chessBoard.length==currRow) {
//			return 1;
//		}
//		
//		int count=0;
//		for(int col=0;col < chessBoard.length;col++) {
//			if(isSafePlace(chessBoard,currRow,col)) {
//				chessBoard[currRow][col]=true;
//				count= count+countQueenPlace(chessBoard, currRow+1);
//				chessBoard[currRow][col]=false;
//			}
//		}
//		return count;
//	}

//	public static void main(String[] args) {
//		boolean chessBoard[][]=new boolean[2][2];
//		int ans=countQueenPlace(chessBoard,0);
//		System.out.println(ans);
//	}
	
	static boolean isSafePlace(char[][] chessBoard,int row,int col) {
		for(int i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(chessBoard[i][j]=='Q') {
				return false;
			}
		}
		
		for(int i=row;i>=0;i--) {
			if(chessBoard[i][col]=='Q') {
				return false;
			}
		}
		
		for(int i=row,j=col;i>=0 && j<chessBoard.length;i--,j++) {
			if(chessBoard[i][j]=='Q') {
				return false;
			}
		}
		return true;
	}
	
	static void printSolution(char[][] chessBoard) {
		for(int i=0;i<chessBoard.length;i++) {
			System.out.println(Arrays.toString(chessBoard[i]).replaceAll(",", ""));
		}
		System.out.println();
	}
	
	static void queenPlace(char[][] chessBoard,int row) {
		
		if(chessBoard.length==row) {
			printSolution(chessBoard);
			return;
		}
		for(int col=0;col<chessBoard.length;col++) {
			if(isSafePlace(chessBoard,row,col)) {
				chessBoard[row][col]='Q';
				queenPlace(chessBoard, row+1);
				chessBoard[row][col]='-';
			}
		}
	}

	public static void main(String[] args) {
		char[][] chessBoard=new char[8][8];
		for(int i=0;i<chessBoard.length;i++) {
			Arrays.fill(chessBoard[i],'-');
		}
		queenPlace(chessBoard,0);
	}

}
