
public class Convert_String {
	public static void main(String[] args) {
		String str="xxyy";
		System.out.println(pairStar(str));
	}
//	static StringBuffer convert(String s,int index) {
//		StringBuffer sb = new StringBuffer(s);
//		if(index==s.length()) {
//			return sb.isEmpty();
//		}
//		
//		if(index+1 < s.length() &&  s.charAt(index)==s.charAt(index+1) ) {
//			return sb.append("*");
//		}
//		return sb.toString() + convert(s, index+1);
//	}
	public static String pairStar(String s) {
	    StringBuilder answer = new StringBuilder();
	    char lastChar = s.charAt(0);
	    answer.append(lastChar);

	    for (int i = 1; i < s.length(); i++) {
	        char currentChar = s.charAt(i);

	        if (currentChar == lastChar) {
	             answer.append("*");
	        }
	        answer.append(currentChar);
	        lastChar = currentChar;
	    }
	    return answer.toString();
	}
}
