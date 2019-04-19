package lab4;


public class donode {
	
	Object element ; Object ex;
	donode next; 
	donode prev;
	public donode(Object e , donode n , donode p ) {
		this.element=e; 
		this.next= n; this.prev=p;
	}
	public donode() {
		this.next=null; this.prev=null;
	}

}
