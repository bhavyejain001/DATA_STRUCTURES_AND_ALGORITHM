
/*Alphabet Pattern2:-

							A 
							B  B 
							C  C  C 
							D  D  D  D 
							E  E  E  E  E 

*/


public class Alphabet_Pattern2 {
	
	static int printDigit(int noOfDigit ,int currDigit) {
		if(noOfDigit==0) {
			return currDigit;
		}
		System.out.print(" "+(char)(currDigit+64)+" ");
		noOfDigit=noOfDigit-1;
		return printDigit(noOfDigit,currDigit);
	}
	
	static void printRow(int rows,int noOfDigit,int startDigit) {
		if(rows==0) {
			return;
		}
		printDigit( noOfDigit,startDigit);
		System.out.println();
		printRow(rows-1, noOfDigit+1,startDigit+1);
	}
	
	public static void main(String[] args) {
		printRow(5,1,1);
	}}
