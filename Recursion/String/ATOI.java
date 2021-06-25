
public class ATOI {
	
	public static void atoi(String str) {
		atoiConverter(str, 0,str.length()-1);
	}
	
	public static void atoiConverter(String str,int start,int end) {
		if(str.length()==0 || start > end) {
			return;
		}
		
		char currChar=str.charAt(start);
		int answer=currChar - '0';
		System.out.print(answer+" ");
		atoiConverter(str, start+1,end);
	}
	
	public static void main(String[] args) {
		atoi("123456789");
	}
}
