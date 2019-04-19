package lab4;



public class Linkedlist  {
		public int size=0;
	  private	listnode head = null;
	  private listnode tail = null;
	  void print () {
		  
		  listnode i = head;
		  while(i != null) {
			  System.out.println(i.value);
			 i= i.next;
		  }}
	   
	  public boolean isEmpty() {
		    return(size == 0);
			}
	 
	  public int size() {
			return size;
		} 
	  public void clear() {
			 head.next  =null;
			 head = tail = null;
			 size=0;
		 }

	  public void set(int index, Object element) {
			 if(index <0 || index >= size) return;
			 listnode i = head; 
			 for(int j =0; j<index ; j++) i=i.next;
			 i.value= element;
		 }
	  
	  public void add(int index, Object element) {
		   listnode newnode = new listnode();
		   newnode.value=element;
	   if(index<= size && index >0) {
		   if(index == 0) {
			   newnode.next= head;
			   head= newnode;
		   }
		   else if(index>0) {
				  listnode i = head;
	 
			   for(int j=1;j<index;j++) {
				   i=i.next;
			   }
			   newnode.next= i.next;
			   i.next=newnode;
		   } 
		   
	   }  size +=1; }
	   public Object get(int index) {
			 if(index <0 || index >=size) return "error" ; 
			 listnode i=head; 
			 for(int j =0; j<index ; j++) i = i.next;
			 return i.value;
		 }
	   
	   
	   
	   public void remove(int index) {
		   if(index >= size && size <0)  return ; 
		   if(index==0) {
		//	   listnode i = head;
			   head=head.next;
			   
		   } else if(index >0) {
		   listnode i = head;
		   
		   for(int k = 1; k<index;k++) {
			   i=i.next;
		   }
		//   listnode j=i.next;
		   i.next=(i.next).next;
		   
		   }
		   
	    size -=1;  }
	   public boolean contains(Object o) {
		  listnode i=head;
		  if(head==null) return false;
		  while(i !=null) {
			  if(i.value==o) return true;
			  i=i.next;
		  } return false;
	   }
	   public ILinkedList sublist(int fromIndex, int toIndex) {	
			return null;
		}
	   
	   public void add(Object element ) {
		    
			  if(isEmpty() == true) {
				  listnode n = new listnode(element); head = tail = n;
			  } else {
				donode n = new donode();
			//	tail.next=n; n.prev = tail; n.next = null; n.element=element; tail=n;
			}	size +=1;	 
				}




	   
	     /* void reverse () {
	    	//  listnode i = head; 
	    	   listnode j =null; listnode p = null;
	    	  listnode c = head;
	    	  while(c != null) {
	    		j=c.next;
	    		c.next=p;
	    		p=c; c=j;
	    		
	    	  } head = p; } */
	   
	      
	  

	

	
}
