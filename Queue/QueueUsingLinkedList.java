
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
public class QueueUsingLinkedList {
	static Node rear = null , front = null;
	
	static int dequeue() {
		if(front == null) {
			System.out.println("Queue Underflow");
			return -1;
		}
		Node temp = front;
		 System.out.printf("Removing %d\n", temp.data);
		front = front.next;
		if(front == null) {
			rear = null;
		}
		int item = temp.data;
		return item;
	}
	
	public static void enqueue(int item) {
		Node node = new Node(item);
		 System.out.printf("Inserting %d\n", item);
		if(front == null) {
			front = node;
			rear = node;
		}else {
			rear.next = node;
			rear = node;
		}
	}
	
	public static int peek() {
		return front.data;
	}
	public static void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.peek());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}
