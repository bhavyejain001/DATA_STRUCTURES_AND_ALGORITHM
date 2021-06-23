import java.util.ArrayList;

public class Permutation_Of_A_String {
	
	
	//using ArrayList
//	static ArrayList<String> findPermutation(String str) {
//		if(str.length()==0) {
//			ArrayList<String> s=new ArrayList<>();
//			s.add("");
//			return s;
//		}
//		char currChar=str.charAt(0);
//		String remString=str.substring(1);
//		ArrayList<String> res=new ArrayList<>();
//		ArrayList<String> temp=findPermutation(remString);
//		for(String t: temp) {
//			for(int i=0;i<=t.length();i++) {
//				StringBuffer sb=new StringBuffer(t);
//				sb.insert(i,currChar);
//				res.add(sb.toString());
//			}
//		}
//		return res;
//	}
	//using Void 
	static void findPermutation(String str,String result) {
		if(str.length()==0) {
			System.out.println(result);
			return ;
		}
		
		for(int i=0;i<str.length();i++) {
			char currChar=str.charAt(i);
			String remString=str.substring(0,i)+str.substring(i+1);
			findPermutation(remString, currChar+result);
		}	
	}
	
	public static void main(String[] args) {
		findPermutation("abc","");
	}
}
