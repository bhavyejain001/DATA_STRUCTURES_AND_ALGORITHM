
public class coin_Change_Problem {
	
	static int coinChange(int[] coins,int totalMoney) {
		if(totalMoney==0) {
			return 1;
		}
		if(totalMoney < 0) {
			return 0;
		}
		int result=0;
		for(int i=0;i<coins.length;i++) {
			result +=coinChange(coins, totalMoney-coins[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr= {2,3,5,6};
		int totalMoney=10;
		System.out.println(coinChange(arr,totalMoney));
	}
	
}
