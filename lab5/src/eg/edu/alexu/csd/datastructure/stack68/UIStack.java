package eg.edu.alexu.csd.datastructure.stack68;

import java.util.Scanner;

public class UIStack {
	
	static	String n=("please chosse an action\n");
	static	String n1=("-----------------------\r\n");
	static	String n2=("1-Push \n");
	static	String n3=("2-Pop\n");
	static	String n4=("3-Peek\n");
	static	String n5=("4-Get size\n");
	static	String n6=("5- Check if empty\n");
	static	String n7=("6- end \n");
	static  String  nt = n + n1 + n2 + n3 + n4 +n5+n6+n7;
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		System.out.println(nt);
		Scanner ip = new Scanner(System.in); Scanner obj = new Scanner(System.in);
		int num =ip.nextInt();
		while (num != 6 ) {
			if(num == 1 ) {
				System.out.println("enter the Object"); 
		Object o = (Object)obj.next();		s.push(o);
		}else if(num == 2 ) {
		if(!s.isEmpty())	System.out.println(" the Object = " + s.pop());
		else System.out.println("error input");
		}else if (num == 3) {
			if(!s.isEmpty())	System.out.println(" the Object = " + s.peek());
			else System.out.println("error input");
		}else if (num ==4 ) {
			System.out.println( "the stack's size = " + s.size());
		}else if(num == 5 ) {
			System.out.println(s.isEmpty());
		} System.out.println(nt);
		
		num = ip.nextInt();
		}	
	}

}
