import java.util.Stack;

public class ReverseStack {
	static Stack<Integer> stack =new Stack<>();
	
	public  static void reverse() {
		if(stack.size() > 0) {
			int currELement = stack.peek();
			stack.pop();
			reverse();
			insertAtBottom(currELement);
		}
	}
	
	public static void insertAtBottom(int currELement) {
		if(stack.isEmpty()) {
			stack.push(currELement);
		}else {
			int ce = stack.peek();
			stack.pop();
			insertAtBottom(currELement);
			stack.push(ce);
		}
	}
	
	public static void main(String[] args) {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("Original Stack is: "+stack);
		reverse();
		System.out.println("Reverse Stack is: "+stack);	
	}
}
