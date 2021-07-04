package MyLinkedList;

class Node<T>{
	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
	}
}

public class LinkedListFunctions<T> {
	Node<T> start;
	void addAtBeg(Node<T> node) {
		if(start == null) {
			start = node;
		}else {
			node.next = start;
			start = node;
		}
	}
	
	void addByPos(Node<T> node, int pos) {
		if(pos == 0) {
			node.next = start;
			start = node;
		}
		int i =1;
		Node<T> temp = start;
		while(i <= pos) {
			temp = temp.next;
			i++;
		}
		node.next = temp.next;
		temp.next = node;
	}
	void print() {
		Node<T> temp = start;
		while(temp!=null) {
			System.out.print(temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
}
