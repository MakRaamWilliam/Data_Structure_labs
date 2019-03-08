package studens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class sparse_array {
	public static String getString() throws IOException
	{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String s = br.readLine();
	return s;
	}
	public static void main(String[] args) throws IOException {
		
		double [][] a = new double[5][5]; int k=0; int sum =0;
		for(int i =0;i<5;i++) {
			for(int j=0;j<5;j++) {
				a[i][j]=0.0;
			}
		} int [][] b = new int [5][5]; double v [] = new double [15];
		a[0][4]=4.4; a[1][0]=2.2; a[1][2]=3.3; a[3][4]=5.5;a[3][1]=7.1; a[4][2]=6.6;
		for(int i =0;i<5;i++) {
			for(int j=0;j<5;j++) {
		   if(a[i][j] ==0.0 ) b[i][j]=0;
		   else { b[i][j] = 1; v[k++]= a[i][j]; }
				
			}}
	   String s = getString(); String t = getString(); String l=getString()	;
	int row = Integer.parseInt(s); int colum = Integer.parseInt(t); int value= Integer.parseInt(l);
	
	
	/*  if((value!=0)&& (b[row][colum] !=0) ) {
		   int m=0; int n = 0;
			while ((m!=row || n!=colum)) {
			    sum+=b[m][n];
			    n++; if(n==5) {n=0; m++;	} }
	v[sum]=value;	sum=0;
	   }									//update
	*/
	
	if((value!=0)&& (b[row][colum] ==0) ) {
		 int m=0; int n = 0;
			while ((m!=row || n!=colum)) {
			    sum+=b[m][n];
			    n++; if(n==5) {n=0; m++;	} }
		for(int i=sum;i<10;i++) {
			double temp =v[i+1];  v[i+1]=v[i]; v[i+2]=temp;
		} v[sum]=value; b[row][colum]=1; sum=0;
	}
	
	
	   if(b[row][colum]==0) System.out.println(0.0);
	   else {   
		   int m=0; int n = 0;
		while ((m!=row || n!=colum)) {
		    sum+=b[m][n];
		    n++; if(n==5) {n=0; m++;	} }
	   System.out.println(v[sum]);      		//get elment
	   }
	   
	  
	   
	   
}}
