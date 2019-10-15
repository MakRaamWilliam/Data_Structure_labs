package eg.edu.alexu.csd.oop.calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

import javax.swing.*;
import javax.swing.border.LineBorder;


public class CalcGUi extends JFrame {
   
	private JLabel l;
	private JTextField ite1;
	private JButton prev,next,equal,clear,current,save,load;
	ArrayList<String> dataresult,nextdata;
   
	 public CalcGUi() {
			super("Calculator assigment");  //in taskbar and title window
			setLayout(new FlowLayout());
		  
		  	ite1 = new JTextField(10);
				thehandler hnd = new thehandler();
				ite1.addActionListener(hnd); add(ite1);
				l =new JLabel();
		     	clear=new JButton("C");   clear.addActionListener(hnd); add(clear);
				current=new JButton("current");  current.addActionListener(hnd); add(current);
				prev = new JButton("prev"); prev.addActionListener(hnd); add(prev);
				next = new JButton("next"); next.addActionListener(hnd);add(next);
				save = new JButton("save"); save.addActionListener(hnd); add(save);
				load = new JButton("load"); load.addActionListener(hnd); add(load);
			  dataresult =new ArrayList<String>(); nextdata = new ArrayList<String>();  
				l.setFont(new Font(l.getFont().getName(), l.getFont().getStyle(), 50));
		        // draw label border to verify the new label size
				l.setPreferredSize(new Dimension(350, 225)); 

		        l.setBorder(new LineBorder(Color.WHITE)); 
		        l.setText("");add(l);
	}
	    
	 class thehandler implements ActionListener  {
		 String fn=""; String temp;   double n1,n2,op; logicCalculator c = new logicCalculator();
		 public void actionPerformed(ActionEvent e) { 
	if(e.getSource()==clear ) {
		ite1.setText(""); l.setText("");
	}
			 
	if(e.getSource()==prev) {
		ite1.setText(c.prev());	
    	}
	if(e.getSource()==current) {
    	 ite1.setText(c.current());
					}
	if(e.getSource()== next) {
		ite1.setText(c.next());
	}
	 if(e.getSource()==save) {
		 c.save();
	 }
	 if(e.getSource()==load) {
		 c.load();
	 }
	if(e.getSource()==ite1) {
		fn=String.format("%s", e.getActionCommand());
	         c.input(fn); if(c.flag==1) l.setText(c.getResult()); 	 		    	       
	}
	 } 	
		 
 }
}
