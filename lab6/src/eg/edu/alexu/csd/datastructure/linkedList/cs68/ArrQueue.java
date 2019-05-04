package  eg.edu.alexu.csd.datastructure.linkedList.cs68;

public class ArrQueue implements IQueue , IArrayBased {

	 Object [] arr ; private int N;
  private 	int f = 0;
  private int l = 0;  private int counter = 0;
	 public ArrQueue(int size) {
		 arr = new Object [size]; this.N = size;
		 
	 }
	
	public void enqueue(Object item) {
		if(size() >=N)   throw new RuntimeException();  
		arr[l]= item;  
		 l=(l+1)%N;
		 counter++;
	}
	
	public Object dequeue() {
		if(isEmpty()) throw new  RuntimeException();
		Object o = arr[f];
		arr[f]=null;
		f=(f+1)%N; counter--;
		return o;
	}
	
	public boolean isEmpty() {
		return (counter == 0);
	}
	
	public int size() {
		
		return counter;
	}
	  
	// start
  //end 
	 
	 
}
