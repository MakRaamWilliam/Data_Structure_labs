package eg.edu.alexu.csd.datastructure.stack;

public class ExpressionEvaluator implements IExpressionEvaluator {

	public int priority (char a) {
	
		
		if(a== '(' || a== ')') return -1;
		else if(a == '*' || a=='/' || a=='%') return 2;
		else if(a== '+' || a=='-') return 1;
		else return 0;
	}
	
	 boolean isdigit(char a) {
		 if(a== '*' || a== '/' || a=='/' || a=='%' || a=='+' || a== '-' || a== ' ') return false;
		 return true;
	 }
	
	
	public String infixToPostfix(String expression) {
		Stack s = new Stack(); String op = ""; 
		
		for(int i =0; i< expression.length();i++) {
			char a = expression.charAt(i);
		if ( (a== ' ' || a==',' || a=='$' || a=='&' ) == false) {
			if(priority(a) == 0) op = op + a ;
			else {  op = op+ " ";
			 if ( a == '-' && i < expression.length() -1 && isdigit( expression.charAt(i+1)) ) {
				op = op+ "-";
			}
			else if(  s.isEmpty()  ||( ( char)s.peek() == '(' ) || (a == '(' ) ) 
				s.push((char) a)  ;
				else if (a== ')' ) {
					while( (char)s.peek() != '(') op =  op +(char) s.pop() ;
					s.pop();
				} 
				else { 
					while( !s.isEmpty() && priority(a) <= priority( (char) s.peek() )  ) {
						op = op + (char) s.pop() + " ";
					} s.push( (char ) a);
				}
				
			}
			
		}	} 
		if( ( priority(expression.charAt(expression.length()-1)) == 0 ) && !s.isEmpty()) op = op + " "; 
		if(op.charAt(op.length()-1) != ' ' && !s.isEmpty()) op = op+ " ";
		while (!s.isEmpty() && !s.isEmpty()) op=op+ (char) s.pop() + " ";
		
		op= op.substring(0, op.length());
		while (op.charAt(0) == ' ') op= op.substring(1);
		String OP2 =""; int i=0;
		while( i< op.length()) {
			char a = op.charAt(i);
			OP2 +=a;
			if(a== ' ') {
				while ( (i+1)< op.length() &&  op.charAt(i+1)==' ' ) i++;
			} 
			
	i++;	} 
		if(OP2.charAt(OP2.length()-1) == ' ') OP2= OP2.substring(0,OP2.length()-1);
		return OP2;
	}

	
	public int evaluate(String expression) {
		Stack s = new Stack(); String dig= "";
		for(int i =0 ; i< expression.length() ;i++) {
			char a = expression.charAt(i);
			if (a != ' ' &&  isdigit(a)) {
		
			dig=dig+a;	
			} else if(a == '-' && i < expression.length() -1 && isdigit( expression.charAt(i+1) ) ) {
				dig = dig+ "-";
			}
			else {  
	if(dig.length() !=0)	s.push(  (float) Float.parseFloat(dig) ); dig = "";
			if(a != ' ') {
			 if(s.size()<2) new  RuntimeException("Erorr expression");
				float x=  (float) s.pop(); float y =  (float) s.pop();
				if(a == '*') s.push( (float) ( y*x) );
				else if(a== '/' ) s.push( (float) ( y/x )  );
				else if (a== '%') s.push( (float) ( y%x )  );
				else if(a== '+' ) s.push( (float) ( y+x)  );
				else if(a== '-') s.push( (float) ( y-x )  );
			
			} }	}
		   float sum = (float) s.pop();
		return Math.round(sum);
	}
	

}
