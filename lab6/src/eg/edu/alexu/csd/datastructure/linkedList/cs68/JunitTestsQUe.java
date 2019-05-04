package eg.edu.alexu.csd.datastructure.linkedList.cs68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestsQUe {

	@Test
	void test() {
		// array imp tests
	ArrQueue t = new ArrQueue(10);
	
		assertEquals(t.size(), 0);
		assertEquals(t.isEmpty(),true);
		t.enqueue((int) 10); t.enqueue((int) 15 ); t.enqueue((int) 20);
		assertEquals(t.size(),3);
		assertEquals(t.isEmpty(), false);
		assertEquals( (int) t.dequeue(), 10 );
		assertEquals( (int) t.dequeue(), 15 );
		assertEquals( (int) t.dequeue(), 20 );
		
        // linked imp tests
	LinkQueue l = new LinkQueue();
	assertEquals(l.size(), 0);
	assertEquals(l.isEmpty(),true);
	l.enqueue((int) 10); l.enqueue((int) 15 ); l.enqueue((int) 20);
	assertEquals(l.size(),3);
	assertEquals(l.isEmpty(), false);
	assertEquals( (int) l.dequeue(), 10 );
	assertEquals( (int) l.dequeue(), 15 );
	assertEquals( (int) l.dequeue(), 20 );
		 
		
	}

}
