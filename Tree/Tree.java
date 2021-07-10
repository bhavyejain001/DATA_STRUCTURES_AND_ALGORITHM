import java.util.ArrayList;
import java.util.Scanner;

class Node{
	int data;
	ArrayList<Node> children;
	Node(int data){
		this.data = data;
		children = new ArrayList<>();
	}
	
	public String toString() {
		return String.valueOf(data);
	}
}

public class Tree {
	 Scanner scanner = new Scanner(System.in);
	
		
		public Node addSubtree() {
			System.out.println("Enter the data of tree");
			int data = scanner.nextInt();
			Node parentNode = new Node(data);
			System.out.println("Enter the number of children of data "+data);
			int children = scanner.nextInt();
			for(int i=1;i<=children;i++) {
				Node child = addSubtree();
				parentNode.children.add(child);
			}
			return parentNode;
		}
		
		public void print(Node root) {
			System.out.print(root.data+" -> ");
			for(Node child : root.children) {
				System.out.print(child+" , ");
			}
			System.out.println();
			for(Node child : root.children) {
				print(child);
			}
		}
		
		public int max(Node root) {
			if(root == null) {
				return 0;
			}
			int result = root.data;
			for(Node child : root.children) {
				int childrenvalue = max(child);
				if(childrenvalue > result) {
					result = childrenvalue ;
				}
			}
			return result;
		}
		
		public int height(Node root) {
			if(root == null) {
				return 0;
			}
			if(root.children.size() == 0) {
				return 1;
			}
			int depth = 0;
			for(Node child : root.children) {
				int childrenvalue = height(child);
				depth = Math.max(childrenvalue, depth);
			}
			return depth + 1;
		}
		
		public int countLeaf(Node root) {
			if(root == null) {
				return 0;
			}
			if(root.children.size()==0) {
				return 1;
			}
			int leafCounter = 0;
			for(Node child : root.children) {
				int leafValue = height(child);
				System.out.print(leafValue+" ");
				leafCounter = leafCounter + leafValue;
			}
			return leafCounter;
		}
	
	public static void main(String[] args) {
		Tree obj = new Tree();
		Node root = obj.addSubtree();
		obj.print(root);
		System.out.println(obj.max(root));
		System.out.println(obj.countLeaf(root));
		System.out.println(obj.height(root));
	}
}
