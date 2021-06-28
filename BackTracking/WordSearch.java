
public class WordSearch {
	
	static char[][] board = {  {'A','B','C','E'},
						       {'S','F','C','S'},
						       {'A','D','E','E'} };
	 static boolean[][] visited;
	static boolean searchWord(int i ,int j ,int index,String word , char[][] board) {
		
		if(index == word.length()) {
			return true;
		}
		
		if(i < 0 || i>=board.length || j<0 || j >=board[0].length || word.charAt(index)!= board[i][j] || visited[i][j]) {
			return false;
		}
		visited[i][j] = true;
		
		if(
				searchWord(i+1, j, index+1, word, board) ||
				searchWord(i-1, j, index+1, word, board) ||
				searchWord(i, j+1, index+1, word, board) ||
				searchWord(i, j-1, index+1, word, board)   ) {
			return true;
		}
		visited[i][j] = false;
		return false;
	}
	
	static boolean exist(char[][] board , String word) {
		int rows = board.length;
		int col = board[0].length;
		visited = new boolean[rows][col];
		for(char i = 0 ;i < rows ;i++) {
			for(char j= 0 ; j < col ;j++) {
				if(word.charAt(0) == board[i][j] && searchWord(i,j,0,word,board)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String word = "ABCCEE";
		boolean result = exist(board,word);
		System.out.println(result);
	}
}
