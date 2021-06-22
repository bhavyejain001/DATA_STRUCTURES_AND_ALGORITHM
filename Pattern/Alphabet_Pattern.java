
/*Alphabet Pattern:-

							A 
							B  C 
							D  E  F 
							G  H  I  J 
							K  L  M  N  O

*/

public class Alphabet_Pattern {
	
	static int printDigit(int noOfDigit ,int currDigit) {
		if(noOfDigit==0) {
			return currDigit;
		}
		System.out.print(" "+(char)(currDigit+64)+" ");
		noOfDigit=noOfDigit-1;
		return printDigit(noOfDigit,currDigit+1);
	}
	
	static void printRow(int rows,int noOfDigit,int startDigit) {
		if(rows==0) {
			return;
		}
		startDigit=printDigit( noOfDigit,startDigit);
		System.out.println();
		printRow(rows-1, noOfDigit+1,startDigit);
	}
	
	public static void main(String[] args) {
		printRow(5,1,1);
	}
}
