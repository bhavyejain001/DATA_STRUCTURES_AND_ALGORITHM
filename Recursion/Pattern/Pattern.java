

/*Pattern Using recursion:-
						*
						**
					    ***
						****
						*****
							*/

public class Pattern {
	
	static void printStar(int star) {
		if(star==0) {
			return;
		}
		System.out.print("*");
		printStar(star-1);
	}
	static void printRow(int rows,int star) {
		if(rows==0) {
			return;
		}
		star=star+1;
		printStar(star);
		System.out.println();
		printRow(rows-1 ,star);
	}
	public static void main(String[] args) {
		printRow(5, 0);
	}
}
