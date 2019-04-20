package eg.edu.alexu.csd.datastructure.linkedList.cs68_cs48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUintTest {

	@Test
	void test() {
		Polynomial test = new Polynomial();
		 int a[][] = new int [5][2]; 
		 a[0][0]=1; a[0][1]=0; 
		 a[1][0]=1; a[1][1]=1;
		 
		 int c [][] = new int [6][2];  int R [][] = new int [6][2];
		 c[0][0]=-1; c[0][1]=0; 
		 c[1][0]=1; c[1][1]=1;
		
      test.setPolynomial('A', a); test.setPolynomial('C', c);
       float t = test.evaluatePolynomial('A',(float) 2);
       assertEquals((float) 3.0, t);
	}

}
