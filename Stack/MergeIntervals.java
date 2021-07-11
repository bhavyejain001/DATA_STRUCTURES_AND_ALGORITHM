import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

class Pair{
	int start , end;
	Pair(int start , int end){
		this.start = start;
		this.end = end;
	}
}

public class MergeIntervals {
	
	public static void mergeIntervals(Pair arr[]) {
		Stack<Pair> stack = new Stack<>();
		Arrays.sort(arr, new Comparator<Pair>() {
			public int compare(Pair obj1 , Pair obj2) {
				return obj1.start - obj2.start;
			}
		});
		stack.push(arr[0]);
		
		for(int i = 1 ;i < arr.length ;i++) {
			Pair top = stack.peek();
			if(top.end < arr[i].start) {
				stack.push(arr[i]);
			}else if(top.end < arr[i].start) {
				top.end = arr[i].end;
				stack.pop();
				stack.push(top);
			}
		}
		while(!stack.isEmpty()) {
			Pair result = stack.pop();
			System.out.println("("+result.start+","+result.end+")");
		}
	}
	
	public static void main(String[] args) {
		Pair arr[] = new Pair[4];
		arr[0] = new Pair(1,3);
		arr[1] = new Pair(2,4);
		arr[2] = new Pair(5,7);
		arr[3] = new Pair(6,8);
		mergeIntervals(arr);
	}
}
