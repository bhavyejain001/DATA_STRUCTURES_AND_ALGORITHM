
public class Unique_Character {
	public static void main(String[] args) {
		String s="leetcode";
		int index=firstUniqueChar(s);
		System.out.println(s.charAt(index));
	}
	static int firstUniqueChar(String s) {
		int[] count=new int[256];
		for(int i=0;i<s.length();i++)
			count[s.charAt(i)]++;
		int index=-1,i;
		for( i=0;i<s.length(); i++) {
			if(count[s.charAt(i)]==1) {
				index=i;
				break;
			}
		}
		return index;
	}
}
