package eg.edu.alexu.csd.datastructure.stack68;



public class Stack implements IStack {
	

	

	private node head=null;
	 private int size =0;
	
	public Object pop() {
		if(isEmpty())  throw new RuntimeException() ;
		Object e = head.element;
		head = head.next; size--;
		return e;
	}

	
	public Object peek() {
		if(size == 0) throw new RuntimeException();
		return head.element;
	}

	@Override
	public void push(Object element) {
		node n = new node(); n.element=element;
		n.next=head; head=n;
		size++;
		
	}

	@Override
	public boolean isEmpty() {
		if(size ==0) return true;
		return false;
	}

	
	public int size() {
		
		return size;
	}
	
	

}
