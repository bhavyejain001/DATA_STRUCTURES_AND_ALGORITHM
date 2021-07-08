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
			System.out.println("4. Delete the Last Node");
			System.out.println("5. Delete At Position");
			System.out.println("6. Delete At Begining");
			System.out.println("7. Find the MidPoint");
			System.out.println("8. Count the Nodes");
			System.out.println("9. Reverse the LinkedList");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the data");
				int data = scanner.nextInt();
				Node<Integer> node; node = new Node<>(data);
				opr.addAtEnd(node);
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
			case 4:
				opr.deleteAtEnd();
				break;
			case 5:
				System.out.println("Enter the Index");
				int index = scanner.nextInt();
				opr.deleteByPos(index);
				break;
			case 6:
				opr.deleteAtBegin();
				break;
			case 7:
				opr.midPoint();
				break;
			case 8:
				System.out.println("Count is: "+opr.size());
				break;
			case 9:
				opr.reverse();
				opr.print();
				break;
			}
		}
	}
}
