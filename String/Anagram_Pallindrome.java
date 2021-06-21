

public class Anagram_Pallindrome {
	public static void main(String[] args) {
		String s="tactac";
		System.out.println(isAnagramPallindrome(s));
				
	}
	static boolean isAnagramPallindrome(String s) {
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
			count[s.charAt(i)]++;
		int odd=0;
		for(int i=0;i<256;i++) {
			if((count[i] & 1) !=0)
				odd++;
			if(odd > 1)
				return false;
		}
		return true;
	}
}
