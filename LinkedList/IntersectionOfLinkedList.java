package MyLinkedList;

import java.util.HashSet;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
	public Node() {
		
	}
}

public class IntersectionOfLinkedList {

	public static Node intersection1(Node node1,Node node2) {
		Node a =node1;
		Node b = node2;
		
		while(a!=null) {
			a.data = a.data * -1;
			a = a.next;
		}
		
		while(b!=null) {
			if(b.data < 0) {
				break;
			}
			b = b.next;
		}
		return b;
	}
	
	public static Node intersection2(Node node1,  Node node2) {
		Node a = node1;
		Node b = node2;
		HashSet<Node> hash = new HashSet<>();
		while(a!=null) {
			hash.add(a);
			a = a.next;
		}
		
		while(b!=null) {
			if(hash.contains(b)) {
				return b;
			}
			b = b.next;
		}
		return null;
	}
	
	public static void Print(Node n)
    {
        Node cur = n;
        while (cur != null) {
            System.out.print(cur.data + "  ");
            cur = cur.next;
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(4);
        n1.next.next.next.next = new Node(5);
        n1.next.next.next.next.next = new Node(6);
        n1.next.next.next.next.next.next = new Node(7);
        // list 2
        Node n2 = new Node(10);
        n2.next = new Node(9);
        n2.next.next = new Node(8);
        n2.next.next.next = n1.next.next.next;
        Print(n1);
        Print(n2);
        System.out.println(Math.abs(intersection1(n1, n2).data));
//        System.out.println(intersection2(n1, n2).data); 
	}
}
