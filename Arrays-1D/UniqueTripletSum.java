import java.util.Arrays;

public class UniqueTripletSum {
	
	public static void main(String[] args) {
		int[] arr= {-6,1,1,2,3,3,4,4 };
		findTriplet(arr);	//find triplet whose sum=0;
	}
	
	public static void findTriplet(int[] arr) {
		Arrays.sort(arr);
		
		for(int i=0; i < arr.length;i++) {
			if(i > 0 && arr[i]==arr[i-1]) {
				continue;//skip this element is it already processed
			}
			else{
				int remSum=arr[i]* -1;
				int firstPointer=i+1;
				int secondPointer=arr.length-1;
				
				while(firstPointer <secondPointer) {
					if(arr[firstPointer]+arr[secondPointer] < remSum) {
						firstPointer++;
					}
					else if(arr[firstPointer]+arr[secondPointer] > remSum) {
						secondPointer--;
					}
					else if(arr[firstPointer]+arr[secondPointer] == remSum) {
						
						System.out.println("Pair Found:- A "+arr[i]+" B "+arr[firstPointer]+" C "+arr[secondPointer]);
						
						int firstValue=arr[firstPointer];
						int secondValue=arr[secondPointer];
						if(arr[firstPointer]==arr[secondPointer]) {
							break;
						}
						while(arr[firstPointer]==firstValue) {
							firstPointer++;
						}
						while(arr[secondPointer]==secondValue) {
							secondPointer--;
						}
					}
				}
			}
		}
	}
}
