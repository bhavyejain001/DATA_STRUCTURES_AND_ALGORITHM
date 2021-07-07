package stackdemos;

class MyTwoStack{
	
	int arr[];
	int capacity;
	int top1, top2;
	MyTwoStack(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		top1=-1;
		top2 = capacity;
		
	}
	void push1(int element) {
		if(top1<top2-1) {
			top1++;
			arr[top1] = element;
		}
	}
	void push2(int element) {
		if(top1<top2-1) {
			top2--;
			arr[top2] = element;
		}
	}
	int pop1() {
		if(top1>=0) {
			int element = arr[top1];
			top1--;
			return element;
		}
		else {
			throw new RuntimeException("Stack1 Empty");
			
		}
	}
	int pop2() {
		if(top2>capacity) {
			int element = arr[top2];
			top2++;
			return element;
		}
		else {
			throw new RuntimeException("Stack1 Empty");
			
		}
	}
	
}

public class TwoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
