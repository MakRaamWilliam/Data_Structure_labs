package eg.edu.alexu.csd.datastructure.linkedList.cs68_cs48;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserInterface extends Polynomial {
	static	String n=("please chosse an action\n");
	static	String n1=("-----------------------\r\n");
	static	String n2=("1-set a polynomial variable\n");
	static	String n3=("2-print the value of the polynomial variable\n");
	static	String n4=("3-add two polynomials\n");
	static	String n5=("4-subtract two polynomials\n");
	static	String n6=("5-multiply two polynomials\n");
	static	String n7=("6-evaluate a polynomial at some point\n");
	static	String n8=("7- clear apolynomial variable\r\n");
	static  String n9=("8- to end the program");
 static	String nt = n+ n1+n2+n3+n4+n5+n6+n7+n8+n9;
 static String o = ( "Insert first operand variable name: A, B or C/r/n"  );
  static String o2 = ("Insert second operand variable name: A, B or C/r/n");
    public static   int[][]  terms(){
    	   Scanner text = new Scanner(System.in);
    		  String s =text.nextLine();
    		  String comp []= s.split(" ");  int [][] a = new int [comp.length][2];
    		  for(int i=0 ;i<comp.length;i++) {
    			int a1= ( Integer.parseInt( (comp[i].split(",")[0]).substring(1,comp[i].split(",")[0].length()  )));
    			 int a2=( Integer.parseInt( comp[i].split(",")[1].substring(0,comp[i].split(",")[1].length()-1) )  );
    a[i][0]=a1; a[i][1]=a2;		      }		  
  return a;   }
 
	public static void main(String[] args) {
		System.out.println( nt);
		Scanner text = new Scanner(System.in); Scanner poly1 = new Scanner(System.in);  Scanner poly2 = new Scanner(System.in);
		Scanner terms = new Scanner(System.in);
		int num = text.nextInt();
		while(num != 8) {
			if(num == 1) {
				System.out.println("Insert the variable name: A, B or C");
				char p1=poly1.nextLine().charAt(0); System.out.println("Insert the polynomial terms in the form:\r\n");
				setPolynomial( p1 , terms());
			}else if(num ==2 ) { 
				System.out.println("Insert the variable name: A, B or C or R");
				char p1=poly1.nextLine().charAt(0); 
				System.out.println(print(p1));
			}else if(num == 3 ) {
				System.out.println(o);
			char p1=poly1.nextLine().charAt(0);  System.out.println(o2);
			char p2 = poly2.nextLine().charAt(0); 
		int result [][] = add(p1, p2);
			}else if(num == 4) {
				System.out.println(o);
				char p1=poly1.nextLine().charAt(0);  System.out.println(o2);
				char p2 = poly2.nextLine().charAt(0); 
		int result[][]=	subtract(p1, p2);
			}else if(num == 5) {
				System.out.println(o);
				char p1=poly1.nextLine().charAt(0);  System.out.println(o2);
				char p2 = poly2.nextLine().charAt(0); 
		int result[][]	=	multiply(p1, p2);
			} else if(num == 6 ) {
				System.out.println("Insert the variable name: A, B or C or R");
            char p1=poly1.nextLine().charAt(0); 
            System.out.println("Insert the value of the varible");
            float val = poly2.nextFloat(); 
            float f = (float) evaluatePolynomial(p1, val); System.out.println(f);
			}else if(num == 7) {
				System.out.println("Insert the variable name: A, B or C or R");
             char  p1=poly1.nextLine().charAt(0);
             clearPolynomial(p1);
			} System.out.println(nt);
			num = text.nextInt();
			
		}
		

	}

}
