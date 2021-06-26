
public class Pallindrome_String {
	
	static boolean isPalin(String str) {
		if(str.length() ==0 || str.length()==1) {
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			return isPalin(str.substring(1, str.length()-1));
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str="nitin";
		System.out.println(isPalin(str)?"YES":"NO");
	}
}
