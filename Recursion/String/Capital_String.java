
public class Capital_String {
	
	public static void toUpperCase(String str,int start,int end) {
		if(str.length()==0 || start>end) {
			return;
		}
		char currChar=str.charAt(start);
		int ascii=(int)currChar;
		if(ascii>=97 && ascii<=122) {
			currChar=(char) (ascii-32);
		}
		System.out.print(currChar);
		toUpperCase(str, start+1, end);
	}
	
	public static void 	convertStringUpperCase(String str) {
		toUpperCase(str,0,str.length()-1);
	}
	
	public static void main(String[] args) {
		convertStringUpperCase("My name is bhavye jain");
	}
}
