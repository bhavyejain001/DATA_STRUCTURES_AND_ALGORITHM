package MyLinkedList;

import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedListFunctions<Integer> opr = new LinkedListFunctions<>();
		while(true) {
			System.out.println("1. Add the Node");
			System.out.println("2. Print the Node");
			System.out.println("3. Add At Position");
			int choice = scanner.nextInt();
			Node<Integer> node;
			switch(choice) {
			case 1:
				System.out.println("Enter the data");
				int data = scanner.nextInt();
				 node = new Node<>(data);
				opr.addAtBeg(node);
				break;
			case 2:
				opr.print();
				break;
			case 3:
				System.out.println("Enter the data");
				int data1 = scanner.nextInt();
				System.out.println("Enter the Position");
				int pos = scanner.nextInt();
				node = new Node<>(data1);
				opr.addByPos(node, pos);
			}
		}
	}
}
