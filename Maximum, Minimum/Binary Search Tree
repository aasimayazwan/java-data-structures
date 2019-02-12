//This code is for finding the maximum of a binary search tree elements 
/* Is the name of the class relevant */
class Node {
	Node left, right ;
	int data;
	
    public Node(int data) {
    	this.data = data;
    	left = right = null;
    	 }
    
    class BinaryTree {
    	Node root;
    }

//Returns the maximum value of a Node 
//Why is the input a Node
   static int findMax(Node node) {
	   if(node ==null) {
		   return Integer.MIN_VALUE;
	   }
	   int res = node.data;
	   int lres = node.findMax(node);
	   int rres = node.findMax(node);
   
	   if(lres>res) {
		   res = lres;
	   }
	   if(rres>res) {
		   res = rres;
	   }
	   return res;
   }

 //Returns the minimum of a Node
   
   static int findMin(Node node) {
	   if (node ==null) {
		   return Integer.MIN_VALUE;
	   }
	   int res;
	   int lres = node.findMin(node);
	   int rres = node.findMin(node);
	   
	   if (lres < res) {
		   res = lres;
	   }
	   if (rres <res) {
		   res = rres;
	   }
	   return res;
}
