//Implementation of Double Linked List
class Double_Linked_List {
//head of the list	
	Node head;
//Double linked list Node 
	class Node{
		Node prev;
		Node next;
		int data;
//Constructor		
		Node(int d){
			data = d;
		}
	}
	
//-----------------------------------------------------
//Constructor to create a node
//previous and Next are by default initialized as null
	public void push(int new_data) {
//Allocate Node and put in data
		Node new_Node = new Node(new_data);
//Make the next of new node as head and the previous as null 
		new_Node.next = head;
		new_Node.prev = null;
//Move the previous of head Node into new_Node 	
		if (head !=null) {
			head.prev = new_Node;
		}
//if there is no head Node, make the new_Node as the head node 
		else {
			head = new_Node;
		}
	}
//------------------------------------------------------
	public void InsertAfter(Node prev_Node, int new_data) {
//Check that the previous Node is not equal to null 
		if(prev_Node ==null) {
			System.out.println("The previous node cannot be equal to null");
			return ;
		}
//Allocate memory and provide data to the Node 
		Node new_Node = new Node(new_data);
//Make the next of the previous Node as the the new node 
		prev_Node.next = new_Node;
//Make previous of the new_Node as the prev_Node 
		new_Node.prev = prev_Node;
//Change the previous of the new_Node's next node 
		if (new_Node.next!=null) {
			new_Node.next.prev = new_Node;
		}
		
	}
//------------------------------------------------------
//We are adding a Node at the end of the list 
	public void append(int new_data) {
//We are not checking if the first element is null or not since we are appending 		
//Allocating memory and adding data to the Node new_Node 
		Node new_Node = new Node(new_data);
		Node last= head ;
//This new_Node is going to be null so make sure it's next element is null
		new_Node.next = null;
		if (head == null) {
			new_Node.prev = null;
			head = new_Node;
			return ;
		}
		while(last.next!=null){
			last = last.next;
		}
//Change the next of the last node 
		last.next = new_Node;
//We have to make the previous of the new_Node as the head 
		new_Node.prev = last;
		}
	
}
