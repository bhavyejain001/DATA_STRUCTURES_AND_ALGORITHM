import java.util.Scanner;

public class Anagram {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			String s=scanner.next();
			String t=scanner.next();
			boolean result=validAnagram(s,t);
			if(result) {
			System.out.println("Strings are Anagram");
			}else {
				System.out.println("Strings are not Anagram");
			}
			scanner.close();
		}
		public static  boolean validAnagram(String s,String t) {
			 boolean isAnagram=true;
		        int[] a=new int[256];
		        for(char c : s.toCharArray()){
		            int index=(int)c;
		            a[index]++;
		        }
		        for(char c : t.toCharArray()){
		            int index=(int)c;
		            a[index]--;
		        }
		        for(int i=0;i < 256;i++){
		            if(a[i]!=0){
		                isAnagram=false;
		                break;
		            }
		        }
		        return isAnagram;
		}
	}
