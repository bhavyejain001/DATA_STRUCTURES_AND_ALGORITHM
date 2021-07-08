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
	 
	void addAtEnd(Node<T> node) {
		if(start == null) {
			start = node;
		}else {
			Node<T> temp = start;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	void addByPos(Node<T> node, int pos) {
		if(pos == 1) {
			node.next = start;
			start = node;
		}
		int i =1;
		Node<T> temp = start;
		while(i < pos-1) {
			temp = temp.next;
			i++;
		}
		Node<T> curr = temp.next;
		node.next = curr;
		temp.next = node;
	}
	
	void deleteAtEnd() {
		if(start == null) {
			System.out.println("ll is Empty");
			return;
		}
		if(start.next == null) {
			start = null ;
			System.out.println("Node Deleted");
			return;
		}else {
			Node<T> curr = start;
			Node<T> prev = null ;
			while(curr.next!=null) {
				prev = curr;
				curr = curr.next;
			}
			prev.next=null;
		}
	}
	
	void deleteByPos(int pos) {
		if(pos == 1) {
			start = start.next;
		}
		int i=1;
		Node<T> prev = start;
		while( i < pos-1) {
			prev = prev.next;
			i++;
		}
		Node<T> curr = prev.next;
		prev.next = curr.next;
	}
	
	void deleteAtBegin() {
		if(start == null || start.next == null) {
			start = null;
			System.out.println("Node Deleted");
			return;
		}
		Node<T> temp = start;
		start = start.next;
		temp.next = null;
 	}
	
	void midPoint() {
		Node<T> slow = start;
		Node<T> fast = start;
		if(start!= null) {
			while(slow!=null && fast.next!=null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.println("MidPoint is: "+slow.data);
		}
	}
	
	int size() {
		Node<T> temp = start;
		int count = 0;
		while(temp!=null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
	
	Node<T> get(int index){
		int size = this.size();
		if(size == 0) {
			throw new RuntimeException("LL is empty");
		}
		if(index < 0 || index >= size) {
			throw new RuntimeException("Invalid Index");
		}
		Node<T> temp = start;
		for(int i = 0 ;i < index ;i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	void reverse() {
		int left = 0;
		int right = size() - 1;
		while(left < right) {
			Node leftNode = get(left);
			Node rightNode = get(right);
			Object temp =  leftNode.data;
			leftNode.data = rightNode.data;
			rightNode.data = temp;
			left++;
			right--;
		}
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
