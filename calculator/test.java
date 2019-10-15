package eg.edu.alexu.csd.oop.calculator;
import javax.swing.JFrame;

import eg.edu.alexu.csd.oop.test.calculator.SanityTest;

public class Testcalc {

	public static void main(String[] args) {
		SanityTest s = new SanityTest();
		s.testSaveAndLoadWithHistory();
//		logicCalculator t = new logicCalculator();
 //	t.input("3+5.5"); t.input("4-5"); t.input("3*5.5"); t.save(); t.input("5/3"); t.input("6+4.5");  
 //	t.load();
//	System.out.println(t.prev()); System.out.println(t.prev());
	CalcGUi c= new CalcGUi();
	c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	c.setSize(400, 400);
	c.setVisible(true);    
	
 //   System.out.println(t.current()); System.out.println(t.prev() ); System.out.println(t.prev() ); 
  //  System.out.println(t.prev() ); System.out.println(t.prev() ); System.out.println(t.prev() ); 
   // System.out.println(t.next()); System.out.println(t.next()); System.out.println(t.next());
  //  System.out.println(t.next()); System.out.println(t.next());
	}

}
