
public class Fibonacci {
	
	public static int fiboWithTab(int n ) {
		int[] dp=new int[n+2];
		dp[0]=0;
		dp[1]=1;
		for(int i = 2;i <= n ; i++ ) {
			dp[i] = dp[i-1] + dp[i-2] ;
		}
		return dp[n];
	}
	
	
	//using using memoization (Top down approach)
	public static int fiboWithMemo(int[] dp , int n) {
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int first = fiboWithMemo(dp,n-1);
		int second = fiboWithMemo(dp,n-2);
		int sum = first + second;
		dp[n] = sum ;
		return dp[n];
	}
	
	//using Recursion
	public static int fiboWithRecur(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		return fiboWithRecur(n-1) + fiboWithRecur(n-2) ;
	}
	public static void main(String[] args) {
		int n=10;
		System.out.println(fiboWithRecur(n));
		System.out.println(fiboWithTab(n));
		int dp[] =new int[n+1];
		System.out.println(fiboWithMemo(dp,n));

	}
}
