
public class Pi_Interchange {
	public static void main(String[] args) {
		String str="2*pi + 3*pi + 10 *pi";
		System.out.println(Pi(str,0));
		
	}
	static String Pi(String s,int index) {
		if(index==s.length()) {
			return "";
		}
		if(index+1 <s.length() && s.charAt(index)=='p' && s.charAt(index+1)=='i') {
			return "3.14" + Pi(s,index+2);
		}
		return s.charAt(index) + Pi(s, index+1);
	}
}
