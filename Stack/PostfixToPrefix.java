import java.util.Stack;

public class PostfixToPrefix {
	
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
	
	public static String getPrefix(String postfix) {
		Stack<String> stack = new Stack<>();
		int length = postfix.length();
		for(int i = 0 ; i < length ;i++) {
			if(isOperator(postfix.charAt(i))) {
				String opr1 = stack.peek();
				stack.pop();
				String opr2 = stack.peek();
				stack.pop();
				String result = postfix.charAt(i) + opr2 + opr1;
				stack.push(result);	
			}else {
				stack.push(postfix.charAt(i)+"");
			}	
		}
		String finalResult = "";
		for(String i : stack) {
			finalResult += i;
		}
		return finalResult;
	}
	
	public static void main(String[] args) {
		String postfix = "ABC/-AK/L-*";
		System.out.println(getPrefix(postfix));
	}
}
