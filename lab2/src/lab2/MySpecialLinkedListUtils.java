package lab2;


public class MySpecialLinkedListUtils {
	
	
	
	
  /*	void print (LinkedListNode Head) {
		  
		  LinkedListNode i = Head;
		  while(i != null) {
			  System.out.println(i.value);
			 i= i.next;
		  } }  */
   
	public static double[] summary(LinkedListNode Head) {
		LinkedListNode i = Head; 
		double [] d = new double[5]; 
		int   max , min , median; double avg = 0; double sum=0; int length=0;
		max = min = i.getValue();
		while (i != null){
			sum = sum + i.getValue(); 
			if(i.getValue()<min) min = i.getValue();
			if(i.getValue()>max) max = i.getValue();
         length++; i=i.getNext();
		} i = Head;
		for(int j =0; j<(length-1)/2;j++) {
			i = i.getNext();
		} int x = i.getValue();
		for(int j =0; j<(length)/2;j++) {
			i = i.getNext();
		} int y = i.getValue();
		median = (x+y)/2;
		avg=sum/length; 
		d[0]=sum; d[1]=avg; d[2]=median ;d[3]=max; d[4]= min; 
		return d;
	}
	
	public static LinkedListNode reverse(LinkedListNode Head) {
		LinkedListNode i = Head;
		LinkedListNode j; LinkedListNode p=null;
		  while(i != null) {
	    		j=i.next;              
	    		i.next=p;							//i need to set next to reverse in place 
	    		p=i; i=j;
	    		
	    	  } return p; 
	}
	
	public static LinkedListNode evenIndexedElements(LinkedListNode Head) {
		
		LinkedListNode i = Head; LinkedListNode j= Head;
		while (i!= null && j != null) {
			j= (i.getNext()); if(j!= null) {
			i.next= j.getNext();
			i=j.getNext(); }
		}
		return Head;
	}
	
	public static boolean palindrome(LinkedListNode Head) {
	LinkedListNode i = Head; LinkedListNode p ;
	LinkedListNode  l=	reverse(Head);
	Head = l;
	 while (  (i !=l )&& (i.next !=Head ) && (l.next != Head) )  {
		
		if(i.getValue() != l.getValue()) return false; 
		 l= l.next; Head = reverse(Head); i=i.next; Head = reverse(Head); 
		 if( l.next == i) {
 			 if(l.getValue() == i.getValue()) return true;
 			 else return false;
		 }
	 }
	
	return true;}
	
	public static boolean drome(LinkedListNode Head) {
		
		LinkedListNode i = Head;
		while (i.getNext() != null) {
			int t=i.getValue(); Head= reverse(Head); int k = i.value;
			if(t != k ) return false; Head= reverse(Head);
			i=i.getNext();
 		} return true;
	}

	
	public static LinkedListNode removeCentralNode(LinkedListNode Head) {
		
		int length =0; 
		LinkedListNode i = Head;
		 while(i != null) {
			 length++; i = i.next;
		 } i = Head;
		 for(int k= 0; k<((length-1)/2)-1;k++ ) {
			 i=i.next;
		 } i.next= (i.next).next;
		    return Head;
	}
	
	public static LinkedListNode insertionSort (LinkedListNode Head) {
		
		LinkedListNode curr, ins;
		curr =  Head;
		while(curr != null) {
			ins =Head;
			while(ins != curr) {
				if(curr.getValue() < ins.getValue()) {
					int temp= curr.getValue(); curr.value= ins.getValue(); ins.value=temp; }
			ins=ins.getNext();	}
	curr=curr.getNext();		}
	 return Head;					}
	
	
	public static LinkedListNode midnode(LinkedListNode Head)
	{
		if(Head == null) return null;
		LinkedListNode i = Head;  int counter=0;
		 while (i.getNext() !=null) {
			counter++; i=i.getNext(); 
		 } i = Head; 
		 for(int j = 0;j<(counter/2); j++) {
			 i=i.getNext();
		 }
			return i;		 }
	
	public static LinkedListNode merge (LinkedListNode a, LinkedListNode b) {
		
		LinkedListNode list =  new LinkedListNode();
		LinkedListNode flist=list;
		while(a != null && b!= null) {
			if(a.getValue() < b.getValue()) {
				list.next = a; a=a.getNext();
			} else {
				list.next = b; b=b.getNext();
			} list = list .getNext();
		} if(a== null) list.next = b; 
		else list.next= a;
		
		return flist.next;	}
	
	public static LinkedListNode mergeSort(LinkedListNode Head)
	{
		if(Head == null ) return Head;
		if(Head.getNext() == null ) return Head;
		
		LinkedListNode mid = midnode(Head);
   LinkedListNode seclist = mid.next;
     mid.next = null;
		
		
		
	  return  merge(mergeSort(Head), mergeSort(seclist))   ;      	}
	
		
	
}
