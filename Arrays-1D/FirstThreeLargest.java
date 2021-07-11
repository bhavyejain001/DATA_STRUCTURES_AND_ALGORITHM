
public class FirstThreeLargest {
	public static void main(String[] args) {
		int arr[]= { 6, 8, 1, 9, 2, 10, 10};
		int firstNumber=Integer.MIN_VALUE;
		int secondNumber=Integer.MIN_VALUE;
		int thirdNumber=Integer.MIN_VALUE;
		int currentNumber=0;
		for(int i=0;i < arr.length;i++) {
			currentNumber=arr[i];
			if(firstNumber < currentNumber) {
				thirdNumber=secondNumber;
				secondNumber=firstNumber;
				firstNumber=currentNumber;
			}else if(secondNumber < currentNumber ) {
				thirdNumber=secondNumber;
				secondNumber=currentNumber;
			}else if(thirdNumber < currentNumber) {
				thirdNumber=currentNumber;
			}
		}
		System.out.println("First Largest Number is:- "+firstNumber);
		System.out.println("Second Largest Number is :- "+secondNumber);
		System.out.println("Third Largest Number is:- "+thirdNumber);
	}
}

