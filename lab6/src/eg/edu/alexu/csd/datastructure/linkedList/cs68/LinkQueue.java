package eg.edu.alexu.csd.datastructure.linkedList.cs68;

public class LinkQueue implements IQueue , ILinkedBased {
	
	public class node {
		Object item ;
		node next;
	}
 private 	node head ; private node tail; private int counter=0;


	@Override
	public void enqueue(Object item) {
		node n = new node(); 
		n.item=item; 
    if(isEmpty()) {
    	head = tail = n;
    } else {
    	tail.next = n;
    	tail = n;
    }
	counter++;			
		
	}


	
	public Object dequeue() {
		if(isEmpty())  throw new RuntimeException();
		Object o = head.item;
		head = head.next;
		counter--;
		return o;
	}


	@Override
	public boolean isEmpty() {
		
		return (counter==0);
	}


	@Override
	public int size() {
		return counter;
	}
	
	// start 
	
	 // end
	

}
