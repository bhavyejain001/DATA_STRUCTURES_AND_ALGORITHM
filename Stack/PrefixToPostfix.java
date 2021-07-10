import java.util.Stack;

public class PrefixToPostfix {
	
	public static boolean isOperator(char ch) {
		switch(ch) {
		case '+':
		case '-':
		case '*':
		case '/':
			return true;
		}
		return false;
	}
	
	public static String getPostfix(String prefix) {
		Stack<String> stack = new Stack<>();
		int length = prefix.length();
		for(int i = length-1 ; i >= 0 ;i--) {
			if(isOperator(prefix.charAt(i))) {
				String opr1 = stack.peek();
				stack.pop();
				String opr2 = stack.peek();
				stack.pop();
				String result = opr1 + opr2 + prefix.charAt(i);
				stack.push(result);	
			}else {
				stack.push(prefix.charAt(i)+"");
			}	
		}
		String finalResult = "";
		for(String i : stack) {
			finalResult += i;
		}
		return finalResult;
	}
	
	public static void main(String[] args) {
		String prefix = "*-A/BC-/AKL";
		System.out.println(getPostfix(prefix));
	}
}
