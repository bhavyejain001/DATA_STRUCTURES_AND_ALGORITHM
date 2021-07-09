import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {
	static Queue<Integer> queue;
	
	public static Queue<Integer> reverse(Queue<Integer> queue) {
		if(queue.isEmpty()) {
			return queue;
		}
		int data = queue.peek();
		queue.remove();
		queue = reverse(queue);
		queue.add(data);
		return queue;
	}
	
	public static void print() {
		while(!queue.isEmpty()){
			System.out.println(queue.peek()+" ");
			queue.remove();
		}
	}
	public static void main(String[] args) {
		 queue = new LinkedList<>();
		 queue.add(1);
		 queue.add(2);
		 queue.add(3);
		 queue.add(4);
		 queue.add(5);
		 System.out.println(queue);
		 queue = reverse(queue);
		 System.out.println(queue);
		
	}
}
