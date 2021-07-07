package stackdemos;

import java.util.HashMap;

public class BalanceBracket {
	
	boolean isValidBracket(){
		Stack<Character> stack = new Stack<>(10);
		String input = "{}([()])";
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		// String char by char traverse
		for(int i = 0; i<input.length(); i++) {
			// if opening bracket
			if(input.charAt(i)=='(' || input.charAt(i)=='[' || input.charAt(i)=='{') {
				stack.push(input.charAt(i));
			}
			else {
				// Not Opening Bracket
				Character currentBracket = stack.pop();
				currentBracket = map.get(currentBracket);
				if(currentBracket != input.charAt(i)) {
				
				
					System.out.println("Invalid Bracket");
					return false;
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("Valid Brackets");
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		

	}

}
