
public class MCP {
	
	static int findMCP(int[][] mat, int n,int m) {
		int[][] dp=new int[n][m];
//		if(m==0 && n==0) {
//			return mat[n][m];
//		}
//		if(n <0 || m<0) {
//			return Integer.MAX_VALUE;
//		}
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				if(i==0 || j==0) {
//					dp[i][j]=0;
//				}
//			}
//		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				 dp[i][j] = mat[i][j];
				 if (i == 0 && j > 0) {
	                    dp[0][j] += dp[0][j - 1];
	                }else if (j == 0 && i > 0) {
	                    dp[i][0] += dp[i - 1][0];
	                }else if (i > 0 && j > 0) {
	                    dp[i][j] += Integer.min(dp[i - 1][j], dp[i][j - 1]);
	                }
			}
		}
		return dp[n-1][m-1];
	}
	
	public static void main(String[] args) {
		int[][] mat= {  { 4, 7, 8, 6, 4 },
			            { 6, 7, 3, 9, 2 },
			            { 3, 8, 1, 2, 4 },
			            { 7, 1, 7, 3, 7 },
			            { 2, 9, 8, 9, 3 }};
		int rows = mat.length;
		int col = mat[0].length;
		System.out.println(findMCP(mat,rows,col));
	}
}
