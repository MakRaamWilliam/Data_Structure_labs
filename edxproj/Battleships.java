import java.util.Scanner;

public class Game {

	static char  [][] a,b;
	
	  
	static boolean valid(int x,int y) {
		return ( (x<10 && x>=0) && (y<10 &&y>=0) ); }
		
	public static int [] readIP() {
		int a[] = new int [2];
		
		return a;
	}
	public static void cpShips() { int c=0;
	while (c<5) {
		int x,y;
		x=(int) (Math.random()*100 %10); y=(int) (Math.random()*100 %10);
		while(!valid(x, y) || a[x][y]!=' ' ) {
			x=(int) (Math.random() *100 %10); y=(int) (Math.random()*100 %10);	
		} a[x][y]='c';
c++;	}
}
	static void printa() {
		System.out.println("----------"); System.out.println("----------");
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(a[i][j]);
			} System.out.println();
		} System.out.println("----------"); System.out.println("----------");
	}
	public static void putShips() { int c=0;
		while (c<5) {
			int x,y; System.out.println("enter x, y"); String checkX,checkY; int flag=0;
		Scanner	ipk = new Scanner(System.in);
	do {  checkX=ipk.next(); checkY=ipk.next(); flag=0;
	  try {
		   x=Integer.parseInt(checkX); y=Integer.parseInt(checkY);
	  }catch (Exception e) {
		flag=1;
	} } while(flag==1);  x=Integer.parseInt(checkX); y=Integer.parseInt(checkY);
			while(!valid(x, y) || a[x][y]!=' ' ) {
				System.out.println("invalid input");
				do {  checkX=ipk.next(); checkY=ipk.next(); flag=0;
				  try {
					   x=Integer.parseInt(checkX); y=Integer.parseInt(checkY);
				  }catch (Exception e) {
					flag=1;
				} } while(flag==1);  x=Integer.parseInt(checkX); y=Integer.parseInt(checkY);
			} a[x][y]='p';
	c++;	}
	}
	public static void main(String[] args) {
		a=new char [10][10]; b=new char [10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				a[i][j]=b[i][j]=' ';
			}
		}
         putShips();   cpShips();  int pShips=5,cShips =5,turn=0;
      while(pShips >0 && cShips >0 ) { printa();
    	  Scanner	ipk = new Scanner(System.in); int x,y; String checkX,checkY; int flag=0;
      if(turn %2 ==0) {
    	do {  System.out.println("attack x,y");
    	 checkX=ipk.next(); checkY=ipk.next(); flag=0;
   	  try {
   		   x=Integer.parseInt(checkX); y=Integer.parseInt(checkY);
   	  }catch (Exception e) {
   		flag=1;
   	} } while(flag==1);  x=Integer.parseInt(checkX); y=Integer.parseInt(checkY);
    	  while( !valid(x, y) || a[x][y]=='m' || a[x][y]=='!' || a[x][y]=='@' ) {
  		System.out.println("error");	
  		do {  System.out.println("attack x,y");
   	 checkX=ipk.next(); checkY=ipk.next(); flag=0;
  	  try {
  		   x=Integer.parseInt(checkX); y=Integer.parseInt(checkY);
  	  }catch (Exception e) {
  		flag=1;
  	} } while(flag==1);  x=Integer.parseInt(checkX); y=Integer.parseInt(checkY);
    	  }if(a[x][y]=='c') { System.out.println("yeaah");  a[x][y]='@'; cShips--;  }
    	  else if(a[x][y] =='p' ) { System.out.println("noo"); a[x][y]='!'; pShips--; }
    	  else a[x][y]='m'; }
      
      else {
    	 x=(int) (Math.random()*100 %10); y=(int) (Math.random() *100 %10);
    	 while( !valid(x, y) || a[x][y]=='m' || a[x][y]=='!' || a[x][y]=='@' ) 
    		 x=(int) (Math.random()*100 %10); y=(int) (Math.random() *100 %10);
    		 if(a[x][y]=='c') { System.out.println("yeaah"); a[x][y]='@'; cShips--;  }
       	  else if(a[x][y] =='p' ) { System.out.println("noo"); a[x][y]='!'; pShips--; }
       	  else {  a[x][y]='m'; System.out.println("Missed");}
    		 }  turn++;
      }
      
      
    }
}
