import java.util.ArrayList;

public class Subsequence_Of_A_String {
	
	//using ArrayList
//	static ArrayList<String> findSubsequence(String str){
//		if(str.length()==0) {
//			ArrayList<String> s=new ArrayList<>();
//			s.add("");
//			return s;
//		}
//		char currChar=str.charAt(0);
//		String remString=str.substring(1);
//		ArrayList<String> result=new ArrayList<>();
//		ArrayList<String> temp=findSubsequence(remString);
//		for(String t:temp) {
//			result.add(t);
//			result.add(currChar+t);	
//		}
//		return result;
//	}
	
	//using void
	static void findSubsequence(String str,String result){
		if(str.length()==0) {
			System.out.println(result);
			return ;
		}
		char currChar=str.charAt(0);
		String remString=str.substring(1);
		findSubsequence(remString,result);
		findSubsequence(remString, result+currChar);	
	}
	
	public static void main(String[] args) {
		findSubsequence("bhavye","");
	}
}

