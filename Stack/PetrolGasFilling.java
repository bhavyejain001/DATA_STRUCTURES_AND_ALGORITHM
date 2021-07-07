
public class PetrolGasFilling {
	
	public static  int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int prev_gas =0;
        int curr_gas = 0;
        for(int i = 0;i <  gas.length ;i++){
            curr_gas += gas[i] - cost[i];
            while(curr_gas < 0){
                prev_gas +=curr_gas;
                start = i+1;
                curr_gas =0;
            }
        }
        return ((curr_gas + prev_gas) >= 0 ? start: -1);
    }
	
	public static void main(String[] args) {
		int[] gas = {1,2,3,4,5}; 
		int[] cost = {3,4,5,1,2};
		System.out.println(canCompleteCircuit(gas,cost));
	}
}
