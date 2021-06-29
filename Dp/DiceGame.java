
public class DiceGame {
	
	// Using Tabulation Method
	static int countWaysWithTab(int curr, int end) {
		int[] dp=new int[end+1];
		dp[end] = 1;
		for(int i=end-1;i>=0;i--) {
			int count=0;
			for(int dice=1;dice<=6 && dice+i<dp.length;dice++) {
				count = count + dp[dice+i];
			}
			dp[i] = count;
		}
		
		// for checking count of every index
		for(int i=0;i<dp.length-1;i++) {
			System.out.println(dp[i]+" "+i);
		}
		return dp[curr];
	}
	
	// Using Memoization
	static int countWaysWithMemo(int curr, int end,int[] cache) {
		if(curr==end) {
			return 1;
		}
		if(curr > end) {
			return 0;
		}
		if(cache[curr]!=0) {
			return cache[curr];
		}
		int count=0;
		for(int dice=1;dice<=6;dice++) {
			count += countWays(curr + dice,end); 
		}
		cache[curr] = count ;
		return cache[curr];
	}
	
	// Using Recursion
	static int countWays(int curr,int end) {
		if(curr==end) {
			return 1;
		}
		if(curr > end) {
			return 0;
		}
		int count=0;
		for(int dice=1;dice<=6;dice++) {
			count += countWays(curr + dice,end); 
		}
		return count;
	}
	
	public static void main(String[] args) {
		int start=0;
		int end=10;
		System.out.println(countWays(start,end));
		int[] cache=new int[end+1];
		System.out.println(countWaysWithMemo(start,end,cache));
		System.out.println(countWaysWithTab(start,end));
	}
}
