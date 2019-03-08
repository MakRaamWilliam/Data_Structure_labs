package array_lap1;

import java.util.Scanner;

public class Fibb {

	public static void  Fibonacci (){
	  Scanner ip = new Scanner(System.in);
	  int num = ip.nextInt();
	 long n1= 1; long n2 = 0; long sum = 1;
	 if(num == 1) System.out.println(0);
	 else if(num>1) {
		 for(int i = 2; i<=num;i++) {
			 sum = n1+n2; 
			 n1=n2; n2= sum;
		 } System.out.println(sum);
	 }
		
		
	}
	
	

}
