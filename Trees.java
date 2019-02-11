class Node{
	int data;
	Node left, right;
//Constructor 	
	public Node(int data){
		this.data=data;
	}

//Adding elements in a Tree
	public void insert(int value) {
		if (value<=data) {
			if(left==null) {
				left = new Node(value);
			}
			else {
				left.insert(value);
			}
		}
		else {
			if(right ==null) {
				right = new Node(value);
			}
			else {
				right.insert(value);
			}
		}
	}
	
//Searching for elements in a Tree 
	public boolean contains(int value) {
		if(value ==data) {
			return true;
		}
		else if (value < data) {
			if (left ==null) {
				left = new Node(value);
				return false;
			}
			else {
				return left.contains(value);
			}
		
		}
		else {
			if(right == null) {
				right = new Node(value);
				return false;
			}
			else {
				return right.contains(value);
			}
	}
	}
//In order traversal 
	public void printInOrder() {
		if(left !=null) {
			left.printInOrder();
		}
		System.out.println(data);
		if (right != null) {
			right.printInOrder();
		}
	}
		
}