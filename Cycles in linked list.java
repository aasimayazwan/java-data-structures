class Node {
	int data;
	Node next;
	
	Node(int d){
		data = d;
	}
	
	boolean has_cycle(Node head) {
		Node fast = head.next;
		Node slow = head;
		
		while(fast != null && fast.next !=null && slow !=null) {
			if (fast == slow) {
				return true;
			}
			else {
				fast = fast.next.next;
				slow = slow.next;
			}	
			return false;
		}
		return false;
}
	}
