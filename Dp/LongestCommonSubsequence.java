
public class LongestCommonSubsequence {
	
	//printing LCS
	static void printLcs(String s1, String s2 ,int n,int m) {
		int[][] dp=new int[n+1][m+1];
		for(int i=0 ;i <= n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1 ;i <= n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j]= 1+ dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        int index = dp[n][m];	
		int temp = index;
		char[] lcs=new char[index+1];
		 lcs[index] = '\u0000';
		int i = n;
		int j= m;
		while(i > 0 && j > 0) {
			if(s1.charAt(i-1) == s2.charAt(j-1)) {
				lcs[index-1] = s1.charAt(i-1);
				i--;
				j--;
				index--;
			}else if(dp[i-1][j] > dp[i][j-1]) {
				i--;
			}else {
				j--;
			}
		}
		for(int k=0;k<=temp;k++) {
			System.out.print(lcs[k]);
		}
	}
	
	static int findLcsWithTab(String s1, String s2 ,int n,int m) {
		int[][] dp=new int[n+1][m+1];
		for(int i=0 ;i <= n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1 ;i <= n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j]= 1+ dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][m];	
    }
	
	// using Memoization 
	static int findLcsWithMemo(String s1, String s2 ,int n, int m ,int[][] cache) {
		if(n ==0 || m==0) {
			return 0;
		}
		if(cache[n][m]!=0) {
			return cache[n][m];
		}
		if(s1.charAt(n-1) == s2.charAt(m-1)) {
			return cache[n][m] = 1 + findLcsWithMemo(s1, s2, n-1, m-1, cache);
		}
		cache[n][m] = Math.max(findLcsWithMemo(s1, s2, n-1, m, cache), findLcsWithMemo(s1, s2, n, m-1, cache));
		return cache[n][m];
	}
	
	//Using Recursion 
	static int findLcs(String s1, String s2 ) {
		if( s1.length()==0 || s2.length()==0) {
			return 0;
		}
		if(s1.charAt(0) == s2.charAt(0)) {
			return 1 + findLcs(s1.substring(1), s2.substring(1));
		}
		return Math.max(findLcs(s1.substring(1), s2), findLcs(s1, s2.substring(1)));
	}

	public static void main(String[] args) {
		String s1 = "ABCBDAB";
		String s2 = "BDCABA";
		int n = s1.length();
		int m = s2.length();
		System.out.println(findLcs(s1,s2));
		int[][] cache = new int[n+1][m+1];
		System.out.println(findLcsWithMemo(s1,s2,n,m,cache));
		System.out.println(findLcsWithTab(s1,s2,n,m));
		printLcs(s1,s2,n,m);
	}
}
