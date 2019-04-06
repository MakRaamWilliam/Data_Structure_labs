package lab2;

public class LinkedListNode {
	int value;
	LinkedListNode next;
	public LinkedListNode(int value) {
     this.value=value;
     next = null;
	}
	 public LinkedListNode() {
		next=null;
	}
	  public int getValue() {
		 return value;
	 }
	  public LinkedListNode getNext() {
		  return next;
	  }

}
