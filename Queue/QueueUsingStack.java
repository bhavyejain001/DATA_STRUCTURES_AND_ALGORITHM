import java.util.Stack;

public class QueueUsingStack<T> {
	private Stack<T> stack;
	public QueueUsingStack() {
		stack = new Stack<T>();
	}
	void enqueue(T element) {
		stack.push(element);
	}
	public T dequeue() {
		if(stack.isEmpty()) {
			throw new RuntimeException("Stack Underflow");
		}
		T top = stack.pop();
		if(stack.isEmpty()) {
			return top;
		}
		T item = dequeue();
		stack.push(top);
		return item;
	}
	
	public static void main(String[] args) {
		QueueUsingStack<Integer> q = new QueueUsingStack<>();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
//		int[] keys = {1,2,3,4,5};
//		for(int key : keys) {
//			q.enqueue(key);
//		}
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}
