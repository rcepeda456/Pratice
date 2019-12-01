package pratice;

public class lastN {
//created a Node class and passed in a int val and Node
	public static void main(String [] args) {
		
	}
	private class Node{
		private int value;
		private Node next;
		
	//created a class and passed a node and variable
		// created two nodes 
		 public Node kthToLast(Node node , int n) {
		     Node curr = node;
		     Node temp = node;
// for loop that returns null curr equal null and if it doesnt move to next node
		     for(int i=0; i<n; i++) {
		         if(curr==null) return null;
		         curr=curr.next;
// while loop to check if the next node from curr equals null if 
	// if it doesnt go to the next one and then move temp 
// which is the next 
		     }
		     while (curr.next !=null) {
		         curr=curr.next;
		         temp = temp.next;
// when the curr.next equls node u return temp
		     }
		     return temp;
		 } 
		 }
	}


///


















