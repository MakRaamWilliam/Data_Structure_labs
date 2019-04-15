package lab3;

import java.awt.Point;
import java.util.LinkedList;

public class player  {
	static int   maxrow =0;  static int mincol =100;
	static int   maxcol =0;  static int minrow =100;
	public static int numofones  (int [][]a , int row , int col) {
		
		if(row <0 || col <0 || row >= a.length || col >= a[0].length)  return 0;
		 if(a[row][col] == 0 ) return 0;
		 a[row][col]=0;
		 int n=1;
		 for (int i =row - 1; i<= row+1 ; i++) {
			 for(int j =col ;j<= col ; j++) {
				 if(i != row || j != col) {n += numofones(a, i, j);   maxrow= Math.max(i, maxrow);   mincol =Math.min(j, mincol); 
		maxcol=Math.max(j, maxcol);	minrow= Math.min(i, minrow);	 		}
			 }}
		 for (int i =row ; i<= row ; i++) {
			 for(int j =col -1 ;j<= col +1 ; j++) {
				 if(i != row || j != col) {    n += numofones(a, i, j);    maxrow= Math.max(i, maxrow);   mincol =Math.min(j, mincol); 
					maxcol=Math.max(j, maxcol);	minrow= Math.min(i, minrow);
				 }
			 }} 
		 
		return n;
	}
	
	
	
	public static Point[] findPlayers(String[] photo, int team, int threshold) {
	int size=photo.length;  int len= (photo[0].length()); int conp =0;
	int  [][] a = new int [size][len];  LinkedList<Integer> cou = new LinkedList<Integer>();
	Point p[] = new Point[100];
	for(int i = 0 ; i<size; i++) {
	for(int j=0; j<len; j++) {
	if(	 photo[i].charAt(j) == (char) (team +48 )) a[i][j]=1;
	else a[i][j] =0; }}
	/*
	for(int i = 0 ; i<size; i++) {
		for(int j=0; j<len; j++) { System.out.print(a[i][j] + " ");
		} System.out.println(); } */  
	
	for(int i = 0 ; i<size; i++) {
		for(int j=0; j<len; j++) {
if(a[i][j] == 1) {  int n=numofones(a, i, j); if(n *4 >=threshold ) { p[conp] = new Point(); p[conp].x= mincol + maxcol +1; 
    p[conp].y= minrow +maxrow +1;conp++;       } 
   minrow = mincol = 100; maxrow = maxcol =0;  }
		}}
	
	 for(int i =0 ; p[i] != null ; i++) {
		 for(int j=0; p[j+1] != null ;j++) {
		if(p[j].x > p[j+1].x ) 	 { 
			Point temp = new Point(); temp = p[j]; p[j]=p[j+1]; p[j+1] = temp;
		}}}
	 for(int i =0; p[i+1] != null; i++) {
		 if(p[i].x == p[i+1].x) { int x= p[i].x;
			 for(int k =i; p[k].x != x;k++) {
			for(int j = i ; p[j+1].x != x; j++) {
	if(p[j].y >p[j+1].y ) {			Point temp = new Point(); temp = p[j]; p[j]=p[j+1]; p[j+1] = temp; }
			        }
			 }
		 }
	 } 
 	
	
	
	
		return p; }
		
	
	   public static void main(String[] args) {
		 				
	    /* 	String[] s = new String [] {
	     			"44444H44S4",
	     			"K444K4L444",
	     			"4LJ44T44XH",
	     			"444O4VIF44",
	     			"44C4D4U444",
	     			"4V4Y4KB4M4",
	     			"G4W4HP4O4W",
	     			"4444ZDQ4S4",
	     			"4BR4Y4A444",
	     			"4G4V4T4444"}; */
 	 String[] s = new String [] {
			"8D88888J8L8E888",
			"88NKMG8N8E8JI88",
			"888NS8EU88HN8EO",
			"LUQ888A8TH8OIH8",
			"888QJ88R8SG88TY",
			"88ZQV88B88OUZ8O",
			"FQ88WF8Q8GG88B8",
			"8S888HGSB8FT8S8",
			"8MX88D88888T8K8",
			"8S8A88MGVDG8XK8",
			"M88S8B8I8M88J8N",
			"8W88X88ZT8KA8I8",
			"88SQGB8I8J88W88",
			"U88H8NI8CZB88B8",
			"8PK8H8T8888TQR8"}; 
	Point p[] = new Point[100];
	
	p= findPlayers(s, 8, 9);    
	
	
	  for(int i=0; p[i] != null ; i++) {   System.out.println(p[i].x + " " + p[i].y); }
		
	} 

}
