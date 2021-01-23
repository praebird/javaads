package BSTree;

class BinarySearchTree { 


		class Node 
		{ 
			int data; 
			Node lchild, rchild; 

			public Node(int item) 
			{ 
				data = item; 
				lchild = rchild = null; 
			} 
		} 

		
		Node root; 

		
		BinarySearchTree() 
		{ 
			root = null; 
		} 

		void insert(int data) 
		{ 
			root = insertRec(root, data); 
		} 

		Node insertRec(Node root, int data) 
		{ 

			if (root == null) 
			{ 
				root = new Node(data); 
				return root; 
			} 

			if (data < root.data) 
				root.lchild = insertRec(root.lchild, data); 
			else if (data > root.data) 
				root.rchild = insertRec(root.rchild, data); 

			
			return root; 
		} 

		
		void inorder() 
		{ 
			inorderRec(root); 
		} 


		void inorderRec(Node root) 
		{ 
			if (root != null) { 
				inorderRec(root.lchild); 
				System.out.print(root.data+"- -"); 
				inorderRec(root.rchild); 
			} 
		}
		
		 
		public static void main(String[] args) 
		{ 
			BinarySearchTree bst = new BinarySearchTree(); 

			bst.insert(45); 
			bst.insert(19); 
			bst.insert(27); 
			bst.insert(37); 
			bst.insert(80); 
			bst.insert(104); 
			bst.insert(67); 

			
			bst.inorder(); 
			
			
			System.out.println("--------------------");
			
			
		} 
	} 
	
