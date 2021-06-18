
/*Input: arr = [1,2,3,4,0], index = [0,1,2,3,0]
Output: [0,1,2,3,4]
*/
import java.util.Arrays;

public class Target_Array {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,0};
		int[] index = {0,1,2,3,0};
		int[] target=new int[nums.length];
		
		for(int i=0;i<nums.length;i++) {
			if(index[i] < i) {
				for(int j=i;j>index[i];j--) {
					target[j]=target[j-1];
				}
				target[index[i]]=nums[i];
			}else {
				target[i]=nums[i];
			}
		}
	System.out.println(Arrays.toString(target));//[0, 1, 2, 3, 4]	
	}
}
