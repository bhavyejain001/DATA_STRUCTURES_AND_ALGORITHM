

/*Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row
and the maximum in its column*/


public class LuckyNumInMatrix {
	public static void main(String[] args) {
		
		int[][] arr= {{3,7,8},{9,11,13},{15,16,17}};
		
		for(int i=0;i<arr.length;i++) {
			int min=Integer.MAX_VALUE;
			int index=0;
			for(int j=0;j<arr[i].length;j++) {
				if(min > arr[i][j]) {
					min = arr[i][j];
					index = j;
				}
			}
			
			boolean lucky=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[j][index] > min) {
					lucky=true;
				}
			}
			
			if(!lucky) {
				System.out.println("Lucky Number is:-  "+min);
			}
		}
	}
}
