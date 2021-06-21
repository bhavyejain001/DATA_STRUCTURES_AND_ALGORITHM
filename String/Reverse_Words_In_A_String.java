
public class Reverse_Words_In_A_String {
	public static void main(String[] args) {
		String s =  "  hello world  ";
		char[] p=s.toCharArray();
		reverse(p);
		System.out.println(p);
		
	}
	public static void reverse(char[] s) {
		int low=0;
		int high=0;
		for(int i=0;i < s.length;i++) {
			if(s[i]==' ') {
				reverseString(s, low, high);
				low=high=i+1;
			}else {
				high=i;
			}
		}
		reverseString(s,low,high);
		reverseString(s, 0, s.length-1);
		
	}
	
	public static void reverseString(char[] s,int start,int end) {
		char temp;
		while(start < end) {
			temp=s[start];
			s[start]=s[end];
			s[end]=temp;
			start++;
			end--;
		}
	}
}
