package eg.edu.alexu.csd.datastructure.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stackTest {

	@Test
	void test() {
		Stack test = new Stack();
		assertEquals(test.isEmpty() , true);
		assertEquals((int) 0, test.size());
		test.push((int) 5) ; test.push((int) 10);
		assertEquals(10, test.peek()); assertEquals(10, test.pop());
		
		// there  tests are  in the sheet with the answers 
	       ExpressionEvaluator ev =  new ExpressionEvaluator();
	       assertEquals("2 3 4 * +" , ev.infixToPostfix("2 + 3 * 4"));
	       assertEquals("a b * 5 +" , ev.infixToPostfix("a * b + 5"));
	       assertEquals("1 2 + 7 *" , ev.infixToPostfix("(1 + 2) * 7"));
	       assertEquals("a b * c /" , ev.infixToPostfix("a * b / c"));
	       assertEquals("a b c - d + / e a - * c *" , ev.infixToPostfix("(a / (b - c + d)) * (e - a) * c "));
	       assertEquals("a b / c - d e * + a c * -" , ev.infixToPostfix("a / b - c + d * e - a * c"));
	       
	       // tests for negative  & more one digit number 
	      assertEquals(17, ev.evaluate (ev.infixToPostfix( "-3 +4 * 5" ) ));				// check negative number
	      assertEquals(-60, ev.evaluate (ev.infixToPostfix( "(4 + 2) * -10" ) ));				// check negative number

	      
	    //check more  digit & floating result during evaluate 
	      assertEquals(72, ev.evaluate (ev.infixToPostfix( "(35 + 2) + 7 / 2 * 10" ) ));
	      
	      
	       
	       }
}
