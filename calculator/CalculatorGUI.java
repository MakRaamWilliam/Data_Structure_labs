package eg.edu.alexu.csd.oop.calculator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;

public class logicCalculator implements Calculator {
    
 private double op,n1,n2;   int flag=1;
 static private ArrayList<String> dataresult,nextdata;
  public logicCalculator() {
	 dataresult = new ArrayList<String>(); nextdata = new ArrayList<String>();
}
	@Override  
	public  void input(String fn) {
		try {
			double flag1=1.0;
		fn=	fn.replaceAll(" ", "");
  	    String [] exp1=fn.split("\\+");	String [] exp3=fn.split("\\*"); String [] exp4=fn.split("\\/");
  	  if(fn.charAt(0)=='-') {flag1=-1.0; fn= fn.replaceFirst("-", "");  }
  	    String [] exp2=fn.split("\\-");
		if(exp1.length !=1) {   
	          n1=Double.parseDouble(exp1[0]);   n2=Double.parseDouble(exp1[1]); 
	    op = n1+n2;    flag=1;
	    	}else if(exp3.length !=1) {
	    		 n1=Double.parseDouble(exp3[0]);   n2=Double.parseDouble(exp3[1]); 
	    	       op = n1*n2;   flag=1;
	    	}else if(exp4.length != 1){
	    		 n1=Double.parseDouble(exp4[0]);   n2=Double.parseDouble(exp4[1]); 
	    		 try {
	    	 op = n1/n2;  flag=1;
	    		} catch (Exception ep) {
	    		JOptionPane.showMessageDialog(null, "you divide by 0"); flag=0;
	    		}  
	    	}  
	    	else if(exp2.length ==2) {
	    		 n1=Double.parseDouble(exp2[0])*flag1;   n2=Double.parseDouble(exp2[1]); 
	     op = n1-n2;   flag=1; System.out.println(n1 +" " + n2);
	    	} else if(exp2.length==3) {
	    		 n1=Double.parseDouble(exp2[0])*flag1;   n2=Double.parseDouble(exp2[2]); 
	    	     op = n1+n2;   flag=1; System.out.println(n1 +" " + n2);
	    	}
	    	else  {
	    		JOptionPane.showMessageDialog(null, "invalid expression "); flag=0;
	    	} if(flag==1) {  
	    		if(dataresult.size()==5) dataresult.remove(0);  dataresult.add(fn);
	    	}  else {
	    		JOptionPane.showMessageDialog(null, "invalid expression ");
	    	}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "invalid expression ");
		}
	}

	@Override
	public String getResult() {
		if(dataresult.isEmpty()) return null;
		return  Double.toString(op);
	}
 
	@Override
	public String current() {
		if(dataresult.isEmpty()) return null;
		return dataresult.get(dataresult.size()-1) ;
	}

	@Override
	public String prev() {
		if(dataresult.size()<2) return null;
		String temp= dataresult.get((dataresult.size()-1)); dataresult.remove((dataresult.size()-1));
	 if(nextdata.size()==5) nextdata.remove(0);    nextdata.add(temp);
		return current();
	}

	@Override
	public String next() {
		if(nextdata.isEmpty()) return null;
		String temp=nextdata.get((nextdata.size()-1)); nextdata.remove(nextdata.size()-1);
		if(dataresult.size()==6) dataresult.remove(0); dataresult.add(temp);
		return temp;
	}

	@Override
	public void save() {
		try
		{

			FileOutputStream f=new FileOutputStream(new File("save.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(dataresult);
		}catch (Exception e) {
			System.out.println("error");
		}
	
		
	}

	@Override
	public void load() {
		try
		{
         dataresult.clear();
			FileInputStream f=new FileInputStream(new File("save.txt"));
			ObjectInputStream o = new ObjectInputStream(f);
		dataresult =  (ArrayList<String>) o.readObject();
		}catch (Exception e) {
			System.out.println("error");
		}
	

		
		
	}

}
