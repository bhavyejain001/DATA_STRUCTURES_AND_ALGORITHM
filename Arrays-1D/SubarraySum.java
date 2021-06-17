
public class SubarraySum {
	public static void main(String[] args) {
		int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
	    int sum = 33;
	    int[] result=findSubarray(arr,sum);
	    for(int index : result) {
	    	System.out.print("  "+arr[index]);
	    }
	}
	    
	    public static int[] findSubarray(int[] arr, int sum) {
	    int i=0;
	    int j=1;
	    int n=arr.length;
	    int currSum=arr[0];
	    while(j <= n) {
	    	while(currSum > sum && i < j-1) {
	    		currSum -= arr[i];
	    		i++;
	    	}
	    	if(currSum ==sum) {
	    		return new int[] {i,j-1};
	    	}
	    	if(j < n)
	    		currSum += arr[j];
	    	j++;
	    }
	    return new int[] {-1};
	 }
}
