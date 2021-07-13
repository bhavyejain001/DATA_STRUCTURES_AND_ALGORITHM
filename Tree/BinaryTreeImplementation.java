import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class BinaryTree<T>{
	T data;
	BinaryTree<T> left;
	BinaryTree<T> right;
	BinaryTree(T data){
		this.data = data;
	}
}

class BinaryTreeOperations{
	String message = "root";
	Scanner scanner = new Scanner(System.in);
	BinaryTree<Integer> insert(){
		System.out.println("Enter the data of "+message+" or enter -1 to exit");
		var data = scanner.nextInt();
		if(data == -1) {
			return null;
		}
		BinaryTree<Integer> node = new BinaryTree<>(data);
		message = "left";
		node.left = insert();
		message = "right";
		node.right = insert();
		return node;
	}
	
	void print(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" => ");
		if(root.left!=null) {
			System.out.print(root.left.data+" , ");
		}
		if(root.right!=null) {
			System.out.print(root.right.data);
		}
		System.out.println();
		print(root.left);
		print(root.right);
	}
	
	void inorderRec(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		inorderRec(root.left);
		System.out.println(root.data+" ");
		inorderRec(root.right);
	}
	
	void inorderItr(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		Stack<BinaryTree> stack  =new Stack<>();
		BinaryTree<Integer> currentNode = root;
		while(currentNode!=null || !stack.isEmpty()) {
			while(currentNode!=null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			System.out.println(currentNode.data+" ");
			currentNode = currentNode.right;
		}
	}
	
	
	
	void levelOrder(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTree<Integer> currentNode = queue.removeFirst();
			System.out.println(currentNode.data+" ");
			if(currentNode.left!=null) {
				queue.addLast(currentNode.left);
			}
			if(currentNode.right!=null) {
				queue.addLast(currentNode.right);
			}
		}
	}
	
	void levelOrderPrintBetter(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i=0;i<size;i++) {
				BinaryTree<Integer> currentNode = queue.removeFirst();
				System.out.print(currentNode.data+" ");
				if(currentNode.left!=null) {
					queue.addLast(currentNode.left);
				}
				if(currentNode.right!=null) {
					queue.addLast(currentNode.right);
				}
			}
			System.out.println();
		}
	}
	
	void Preorder(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data+" ");
		Preorder(root.left);
		Preorder(root.right);
	}
	
	void preorderItr(BinaryTree<Integer> root) {
		Stack<BinaryTree> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			BinaryTree<Integer> currentNode = stack.pop();
			System.out.println(currentNode.data+" ");
			if(currentNode.right!=null) {
				stack.push(currentNode.right);
			}
			if(currentNode.left!=null){
				stack.push(currentNode.left);
			}
 		}
	}
	
	void preorderItr2(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		Stack<BinaryTree> stack = new Stack<>();
		BinaryTree<Integer> currentNode = root;
		stack.push(root);
		while(currentNode!=null || !stack.isEmpty()) {
			while(currentNode!=null) {
				System.out.println(currentNode.data+" ");
				if(currentNode.right!=null) {
					stack.push(currentNode.right);
				}
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
 		}
	}
	
	void postorderRec(BinaryTree<Integer> root) {
		if(root == null) {
			return;
		}
		postorderRec(root.left);
		postorderRec(root.right);
		System.out.println(root.data+" ");
	}
	
	void postOrderItr(BinaryTree<Integer> root) {
		Stack<BinaryTree> stack = new Stack<>();
		stack.push(root);
		Stack<Integer> out = new Stack<>();
		while(!stack.isEmpty()) {
			BinaryTree<Integer> currentNode = stack.pop();
			out.push(currentNode.data);
			if(currentNode.left!=null) {
				stack.push(currentNode.left);
			}
			if(currentNode.right!=null) {
				stack.push(currentNode.right);
			}
			while(!out.isEmpty()) {
				System.out.println(out.pop()+" ");
			}
 		}
	}
	
	void maxWidthOfTheTree(BinaryTree<Integer> root) {
		LinkedList<BinaryTree> queue = new LinkedList<>();
		queue.add(root);
		int max = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			max = Math.max(max, size);
			for(int i=0;i<size;i++) {
				BinaryTree<Integer> currentNode = queue.removeFirst();
//				System.out.print(currentNode.data+" ");
				if(currentNode.left!=null) {
					queue.addLast(currentNode.left);
				}
				if(currentNode.right!=null) {
					queue.addLast(currentNode.right);
				}
			}
//			System.out.println();
		}
		System.out.println("Max Width: "+max);
	}
	
	int heightOfTree(BinaryTree<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}
	void kthDistance(BinaryTree<Integer> root,int kth) {
		if(root == null) {
			return;
		}
		if(kth==0){
			System.out.println(root.data+" ");
		}
		kthDistance(root.left, kth-1);
		kthDistance(root.right, kth-1);
	}
}
public class BinaryTreeImplementation {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BinaryTreeOperations opr = new BinaryTreeOperations();
		BinaryTree<Integer> root = null;
		while(true) {
			System.out.println("1. Insertion in BinaryTree");
			System.out.println("2. Print Binary Tree");
			System.out.println("3. Print Inorder");
			System.out.println("4. print LevelOrder");
			System.out.println("5. LevelOrder Better");
			System.out.println("6. Print Preorder");
			System.out.println("7. Print Postorder");
			System.out.println("8. Print max Width");
			System.out.println("9. Print max Height");
			System.out.println("10. Kth distance");
			System.out.println("Enter the choice");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				root = opr.insert();
				break;
			case 2:
				opr.print(root);
				break;
			case 3:
				opr.inorderItr(root);
				break;
			case 4:
				opr.levelOrder(root);
				break;
			case 5:
				opr.levelOrderPrintBetter(root);
				break;
			case 6:
				opr.preorderItr(root);
				break;
			case 7:
				opr.postOrderItr(root);
				break;
			case 8:
				opr.maxWidthOfTheTree(root);
				break;
			case 9:
				opr.heightOfTree(root);
				break;
			case 10:
				opr.kthDistance(root,1);
				break;
			default : 
				break;
			}
		}
	}
}
