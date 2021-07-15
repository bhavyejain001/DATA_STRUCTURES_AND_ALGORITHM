import java.util.Scanner;

class BinaryTree<T>{
	T data;
	BinaryTree<T> left;
	BinaryTree<T> right;
	public BinaryTree(T data) {
		this.data = data;
	}
}
class BSTOperations{
	BinaryTree<Integer> root;
	Scanner sc = new Scanner(System.in);
	
	BinaryTree<Integer> insert(BinaryTree<Integer> node, int data){
		if(node == null) {
			node =  new BinaryTree<Integer>(data);
		}else
		if(data < node.data) {
			node.left = insert(node.left, data); 
		}else
		if(data > node.data) {
				node.right = insert(node.right, data);
		}
		return node;
	}
	
	
	int data;
	void input() {
		do {
			System.out.println("Enter the Data");
			data = sc.nextInt();
			if(data == -1){
				break;
			}
			root = insert(root,data);
		}while(data!=-1);
	}
	
	void print(BinaryTree<Integer> node)  {
		if(node!=null) {
			print(node.left);
			System.out.println(node.data+" , ");
			print(node.right);
		}
	}
	
	BinaryTree<Integer> lca(BinaryTree<Integer> node,int n1,int n2){
		BinaryTree<Integer> temp =null;
		if(node == null) {
			return null;
		}
		if(node.data == n1) {
			v1 = true;
			temp = node;
		}
		if(node.data == n2) {
			v2 = true;
			temp = node;
		}
		BinaryTree<Integer> leftLca = lca(node.left,n1,n2);
		BinaryTree<Integer> rightLca = lca(node.right,n1,n2);
		if(temp!=null) {
			return temp;
		}
		if(leftLca!=null && rightLca!=null) {
			return node;
		}
		return leftLca!=null ? leftLca : rightLca;
	}
	
	static boolean v1 = false , v2 = false;
	BinaryTree<Integer> findLCA(int n1,int n2){
		v1 = false;
		v2 = false;
		BinaryTree<Integer> LCA = lca(root,n1,n2);
		if(v1 && v2) {
			return LCA;
		}
		return null;
	}
}


public class BST {
	public static void main(String[] args) {
//		BSTOperations opr = new BSTOperations();
//		Scanner sc = new Scanner(System.in);
//		int choice  = 0;
//		while(true) {
//			System.out.println("1.Insert");
//			System.out.println("2. Print");
//			System.out.println("3.  LCA");
//			System.out.println("Enter the choice");
//			choice = sc.nextInt();
//			switch(choice) {
//			case 1:
//				opr.input();
//				break;
//			case 2:
//				opr.print(opr.root);
//				break;
//			case 3:
//				BinaryTree<Integer> ans = opr.findLCA(4,5);
//				System.out.println(ans.data);
//				break;
//			}
//		}
		BSTOperations tree = new BSTOperations();
        tree.root = new BinaryTree<Integer>(10);
        tree.root.left = new BinaryTree<Integer>(20);
        tree.root.right = new BinaryTree<Integer>(30);
        tree.root.left.left = new BinaryTree<Integer>(40);
        tree.root.left.right = new BinaryTree<Integer>(50);
        tree.root.right.left = new BinaryTree<Integer>(60);
        tree.root.right.right = new BinaryTree<Integer>(70);
        BinaryTree<Integer> ans = tree.findLCA(60, 70);
        tree.print(tree.root);
        System.out.println(ans.data);
	}
}
