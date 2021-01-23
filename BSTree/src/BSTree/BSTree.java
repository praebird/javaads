package BSTree;

public class BSTree {
	public class BTNode {
		int data;
		BTNode lChild;
		BTNode rChild;
	}
	private BTNode root;
	public BSTree() {
		root = null;
	}
	public void insert(int elem) {
		// 1. Set curr to root and prev to null.
		BTNode curr = root;
		BTNode prev = null;
		// 2. while curr is still node of a tree.
		while (curr != null) {
			prev = curr;
			// Move curr to its child.
			if (elem < curr.data) {
				curr = curr.lChild;
			} else {
				curr = curr.rChild;
			}
		}
		// Create new node.
		BTNode newNode = new BTNode();
		newNode.data = elem;
		newNode.lChild = null;
		newNode.rChild = null;
		// Tree is initially empty.
		
		
		if (prev == null) {
			// Make new node as root node and stop.
			root = newNode;
			return;
		}
		// Add new node as child of prev.
		if (newNode.data < prev.data) {
			prev.lChild = newNode;
		} else {
			prev.rChild = newNode;
		}
	}
	
	
	public boolean find(int elem) {
		BTNode curr = root;
		while ((curr != null) && (curr.data != elem)) {
			if (elem < curr.data) {
				curr = curr.lChild;
			} else {
				curr = curr.rChild;
			}
		}
		if (curr == null) {
			return false;
		}
		return true;
	}
	private void inorder(BTNode node) {
		if (node == null) {
			return;
		}
		if (node.lChild != null) {
			inorder(node.lChild);
		}
		System.out.println(node.data);
		if (node.rChild != null) {
			inorder(node.rChild);
		}
	}
	public void print() {
		inorder(root);
	}
	

	public void delete(int elem) {
		
		root = deleteNode(root, elem);
		
	}
		 
    // A recursive function to delete an existing key in BST
    
	public BTNode deleteNode(BTNode root, int elem)
    {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root ;
 
        /* Otherwise, recur down the tree */
        if (elem < root.data)
        	root.lChild = deleteNode(root.lChild, elem);
        
        else if (elem > root.data)
        	root.rChild = deleteNode(root.rChild, elem);
 
        // if key is same as root's  key, then This is the node to be deleted
        else {
            // node with only one child or no child
           if (root.lChild == null)
        		return root.rChild;
           
           else if (root.rChild == null)
        	    return root.lChild;
            
            // node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = inOrderSuccesor(root.rChild);
 
            // Delete the inorder successor
            deleteNode(root.rChild, root.data);
        }
 
        return root;
    }
	
	int inOrderSuccesor(BTNode root)
    {
        int n = root.data;
        while (root.lChild != null) 
        {
            n = root.lChild.data;
            root = root.lChild;
        }
        return n;
    }
	

}
