package lab4;



public  class Double    {
		
		private int size =0;
		private donode head ; private donode tail;
		 public Double() {
			head = null; tail = null; 
		}
		 void print () {
			  
			  donode i = head;
			  while(i != null) {
				  System.out.println(i.element);
				 i= i.next;
			  }}
		 public boolean isEmpty() {
	    return(size == 0);
		}
		 public int size() {
			return size;
		} 
		 public void clear() {
			 if(size ==0) { head = tail = null;  return ;  }
			 head.next = tail.prev =null;
			 head = tail = null;
			 size=0;
		 }
		 
		 public void set(int index, Object element) {
			 if(index <0 || index >= size) return;
			 donode i = head; 
			 for(int j =0; j<index ; j++) i=i.next;
			 i.element= element;
		 }
		 
		 
		 public void add(Object element ) {
			    
			  if(isEmpty() == true) {
				  donode n = new donode(element,null, null); head = tail = n;
			  } else {
				donode n = new donode();
				tail.next=n; n.prev = tail; n.next = null; n.element=element; tail=n;
			}	size +=1;	 
				}
		  public void add(int index, Object element) {
			  if(index <0 || index >size) return ;
			  else if (index == size) {  add(element); size= size -1; }
			  else if (index ==0) {
				  donode n  = new donode(); n.next=head; n.prev=null; n.element = element;
				  head.prev = n; head=n;}
			  else {
				donode i = head; donode n  = new donode();
				for(int j=0;j<index; j++) i = i.next;
				donode p = i.prev; 
				p.next = n; i.prev=n; n.prev= p; n.next=i; n.element=element;
			} 
				size = size +1; }
			
		  
		 
		 public Object get(int index) {
			 if(index <0 || index >=size) return "error" ; 
			 donode i=head; 
			 for(int j =0; j<index ; j++) i = i.next;
			 return i.element;
		 }
		 
		 public void remove(int index) {
			 if(isEmpty() || index >= size || index<0) return;
			 if(size ==1) head = null ; 
			 else if(index == 0) {
				 donode i = head.next; i.prev = null ; head= i;  
			 } else if(index == size-1) {
			 donode i = tail.prev; i.next=null; tail=null; tail=i;	 
			 }
			 else {
			 donode i = head; 
			for(int j=0; j<index ; j++) i=i.next;
			donode v= i.next; donode u = i.prev;
			u.next = v;   v.prev = u; i.next= null; i.prev=null; }
		 size = size-1; }
		 
		 public boolean contains(Object o) {
			 if(head == null) return false;
			 donode i = head; 
			 while(i != null) {
				 if(i.element == o  ) return true;
				 i=i.next;
			 }
			 return false ;
		 }
		
		public ILinkedList sublist(int fromIndex, int toIndex) {
			
			return null;
		}
		
		
		 

	


}
