import java.util.ArrayList;

public class Letter_Combinations_Of_A_Mobile {
	
	static String KeypadArray[]= {"","abc","def","ghi"}; 
	
	static ArrayList<String> getCombinations(String str){
		
		if(str.length()==0) {
			ArrayList<String> s=new ArrayList<>();
			s.add("");
			return s;
		}
		char first=str.charAt(0);
		String remPhoneNumber = str.substring(1);
		int index=first - '0';
		String Keypadkey=KeypadArray[index];
		ArrayList<String> result=new ArrayList<>();
		for(int i=0 ;i < Keypadkey.length(); i++) {
			char currChar=Keypadkey.charAt(i);
			ArrayList<String> temp=getCombinations(remPhoneNumber);
			for(String t: temp) {
				result.add(currChar+t);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		 System.out.println(getCombinations("23"));
	}
}
