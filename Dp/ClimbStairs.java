
public class ClimbStairs {
	
	//Using Tabulation Method
	static int countWaysWithTab(int stairs) {
		int[] dp=new int[stairs+2];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<=stairs;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[stairs];
	}
	
	//Using Memoization
	static int countWaysWithMemo(int stairs, int[] cache) {	
		if(stairs < 0) {
			return 0;
		}
		if(stairs == 0) {
			return 1;
		}
		if(cache[stairs]!=0) {
			return cache[stairs];
		}
		int result=countWaysWithMemo(stairs-1,cache)+ countWaysWithMemo(stairs-2,cache);
		cache[stairs]=result;
		return cache[stairs];
	}
	
	// Recursion
	static int countWays(int stairs) {
		if( stairs <= 1) {
			return stairs;
		}
		return countWays(stairs-1) + countWays(stairs-2);
	}
	
	
	public static void main(String[] args) {
		int stairs = 4;
		System.out.println(countWays(stairs+1));
		int[] cache=new int[stairs+1];
		System.out.println(countWaysWithMemo(stairs,cache));
		System.out.println(countWaysWithTab(stairs));
	}
}
