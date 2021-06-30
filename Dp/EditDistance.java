
public class EditDistance {
	
	static int editDistance(String s1, String s2 ,int n,int m) {
		int[][] dp=new int[n+1][m+1];
		 for(int i=0;i<=n;i++)
	            dp[i][0]=i;
	        for(int i=0;i<=m;i++)
	            dp[0][i]=i;
        for(int i=1 ;i <= n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=1 + Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1])) ;
            }
        }
        return dp[n][m];	
    }
	
	public static void main(String[] args) {
		String s1 = "Sunday";
		String s2 = "Saturday";
		int n= s1.length();
		int m = s2.length();
		System.out.println(editDistance(s1,s2,n,m));
	}
}
