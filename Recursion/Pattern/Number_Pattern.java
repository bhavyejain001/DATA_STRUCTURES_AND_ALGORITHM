
/*Number Pattern Printing:-
					
							1 
							2  3 
							4  5  6 
							7  8  9  10 

*/

public class Number_Pattern {
	
	static int printDigit(int noOfDigit ,int currDigit) {
		if(noOfDigit==0) {
			return currDigit;
		}
		System.out.print(" "+currDigit+" ");
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
		printRow(4,1,1);
	}
}
