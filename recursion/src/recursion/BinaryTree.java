package recursion;

class Node 
{ 
	int data; 
	Node left, right; 

	public Node(int item) 
	{ 
		data = item; 
		left = right = null; 
	} 
} 

// A Java program to introduce Binary Tree 
public class BinaryTree 
{ 
	// Root of Binary Tree 
	Node root; 

	// Constructors 
	BinaryTree(int key) 
	{ 
		root = new Node(key); 
	} 

	BinaryTree() 
	{ 
		root = null; 
	} 

	public void traverseInOrder(Node node) {
	    if (node == null) {
	    	return ;
	    }
	    	else {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.data);
	        traverseInOrder(node.right);
	    }
	}
	
	public void traversePreOrder(Node node) {
		if (node == null) {
	    	return ;
	    }
		else {
	    	System.out.print(" " + node.data);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
	
	public void traversePostOrder(Node node) {
		if (node == null) {
	    	return ;
	    }
		else {
	    	
	        traversePostOrder(node.left);
	        traversePostOrder(node.right);
	        System.out.print(" " + node.data);
	    }
	}
	
	public static void main(String[] args) 
	{ 
		BinaryTree tree = new BinaryTree(); 


		tree.root = new Node(5); 
		tree.root.left = new Node(3); 
		
		tree.root.right = new Node(1); 
		tree.root.right.left = new Node(9); 
		
		System.out.println("In Order");
		tree.traverseInOrder(tree.root);
		
		System.out.println( );
		System.out.println("Pre Order");
		tree.traversePreOrder(tree.root);
		
		
		System.out.println( );
		System.out.println("Post Order");
		tree.traversePostOrder(tree.root);
	} 
} 
