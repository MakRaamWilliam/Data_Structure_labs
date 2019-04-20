package eg.edu.alexu.csd.datastructure.linkedList.cs68_cs48;

import java.util.Vector;

public class Polynomial  {
	
	public static Double a =  new Double();
	public static Double b=  new Double();
	public static Double c =  new Double();
	public static Double r =  new Double();
  
	
	
	
	public static void setPolynomial( char poly,  int[][] terms) {
		
		sorting(terms);
		
		if (poly != 'A' && poly != 'B' && poly != 'C') {
			throw new RuntimeException();}
		if(poly == 'A') {
			a.clear();
	  for(int i =0; i<terms.length;i++) {
		  int t[]= {terms[i][0], terms[i][1]};
	if(t[0] !=0)  a.add(t);
	  }  
		}else if (poly == 'B') {
			b.clear();
			for(int i =0; i<terms.length;i++) {
				  int t[]= {terms[i][0], terms[i][1]};
				  if(t[0] !=0)  b.add(t);
			  }
		}else if(poly == 'C') {
			c.clear();
			for(int i =0; i<terms.length;i++) {
				  int t[]= {terms[i][0], terms[i][1]};
				  if(t[0] !=0)	  c.add(t);
			  }
		}
	}
	
	public static String print( char poly) {
		String s = "";
		if (poly != 'A' && poly != 'B' && poly != 'C' && poly != 'R') {
			throw new IllegalArgumentException("Operation "+ "on polynomial "+ poly + " is not permitted");}
		if(poly == 'A') { if(a.isEmpty()) return "the polynomial A is not set";
			for(int i =0; i<a.size();i++) {
				int t[] = (int[]) a.get(i);
				
				 if(t[0]>0 && t[0] !=1 ) {
				if(i!=0) s=s+"+ " + t[0] ; else  s=s+t[0];
				}else if(t[0] == 1 && t[1] != 0) {
			if(i!= 0)		s=s+ "+ ";
				}else if(t[0] == 1 && t[1] == 0) {
					s=s+"+ 1";
				}
				 else if(t[0] == -1 && t[1] != 0) {
					s=s+"- ";
				} else if(t[0] == -1 && t[1] != 0) {
					s=s+ "- 1";
				}
				 else if(t[0]<0) {
					s=s+ "- "+ t[0] *-1 ;
				} if(t[1] != 0 && t[1] !=1) {
					s=s+"x^" + t[1];
				}else if(t[1] == 1) {
					s=s+"x";
				}
	s=s+ " ";		}
		}else if(poly == 'B') { if(b.isEmpty()) return "the polynomial B is not set";
			for(int i =0; i<b.size();i++) {
				int t[] = (int[]) b.get(i);
				
				 if(t[0]>0 && t[0] !=1 ) {
						if(i!=0) s=s+"+ " + t[0] ; else  s=s+t[0];
						}else if(t[0] == 1 && t[1] != 0) {
					if(i!= 0)	s=s+ "+ ";
						}else if(t[0] == 1 && t[1] == 0) {
							s=s+"+ 1";
						}
						 else if(t[0] == -1 && t[1] != 0) {
							s=s+"- ";
						} else if(t[0] == -1 && t[1] != 0) {
							s=s+ "- 1";
						}
						 else if(t[0]<0) {
							s=s+ "- "+ t[0] *-1 ;
						} if(t[1] != 0 && t[1] !=1) {
							s=s+"x^" + t[1];
						}else if(t[1] == 1) {
							s=s+"x";
						}
	s=s+ " ";		}
		} else if(poly == 'C') { if(c.isEmpty()) return "the polynomial B is not set";
		for(int i =0; i<c.size();i++) {
			int t[] = (int[]) c.get(i);
			
			 if(t[0]>0 && t[0] !=1 ) {
					if(i!=0) s=s+"+ " + t[0] ; else  s=s+t[0];
					}else if(t[0] == 1 && t[1] != 0) {
					if(i!=0)	s=s+ "+ ";
					}else if(t[0] == 1 && t[1] == 0) {
						s=s+"+ 1";
					}
					 else if(t[0] == -1 && t[1] != 0) {
						s=s+"- ";
					} else if(t[0] == -1 && t[1] != 0) {
						s=s+ "- 1";
					}
					 else if(t[0]<0) {
						s=s+ "- "+ t[0] *-1 ;
					} if(t[1] != 0 && t[1] !=1) {
						s=s+"x^" + t[1];
					}else if(t[1] == 1) {
						s=s+"x";
					}
s=s+ " ";		}
	}
		
		
		else if(poly == 'R') {
			for(int i =0; i<r.size();i++) {
				int t[] = (int[]) r.get(i);
				
				 if(t[0]>0 && t[0] !=1 ) {
						if(i!=0) s=s+"+ " + t[0] ; else  s=s+t[0];
						}else if(t[0] == 1 && t[1] != 0) {
						if(i!=0)	s=s+ "+ ";
						}else if(t[0] == 1 && t[1] == 0) {
							s=s+"+ 1";
						}
						 else if(t[0] == -1 && t[1] != 0) {
							s=s+"- ";
						} else if(t[0] == -1 && t[1] != 0) {
							s=s+ "- 1";
						}
						 else if(t[0]<0) {
							s=s+ "- "+ t[0] *-1 ;
						} if(t[1] != 0 && t[1] !=1) {
							s=s+"x^" + t[1];
						}else if(t[1] == 1) {
							s=s+"x";
						}
	s=s+ " ";		}
		}
		
  return s;	   }
	public void  clearPolynomial(char poly) {
		if (poly != 'A' && poly != 'B' && poly != 'C') {
			throw new IllegalArgumentException("Operation "+ "on polynomial "+ poly + " is not permitted");}
		if(poly == 'A') {
			a.clear();
		}else if (poly == 'B') {
			b.clear();
		}else if(poly == 'C') {
			c.clear();
		}else if(poly == 'R') {
			r.clear();
		}
	}
	
	public static float evaluatePolynomial(char poly, float value) {
		float f=0;
		if (poly != 'A' && poly != 'B' && poly != 'C' && poly != 'R') {
			throw new RuntimeException();}
		if(poly == 'A') {
			for(int i =0 ; i<a.size();i++) {
				int t[]= (int []) a.get(i);
				f+=t[0] * Math.pow(value, t[1]);
			}
		}else if (poly == 'B') {
			for(int i =0 ; i<b.size();i++) {
				int t[]= (int []) b.get(i);
				f+=t[0] * Math.pow(value, t[1]);
			}
		}else if(poly == 'C') {
			for(int i =0 ; i<c.size();i++) {
				int t[]= (int []) c.get(i);
				f+=t[0] * Math.pow(value, t[1]);
			}
		}else if(poly == 'R') {
			for(int i =0 ; i<r.size();i++) {
				int t[]= (int []) r.get(i);
				f+=t[0] * Math.pow(value, t[1]);
			}
		}
		
		
	return f;  }
	
 public static int[][] add(char poly1, char poly2){
	 if (poly1 != 'A' && poly1 != 'B' && poly1 != 'C') {
		 throw new RuntimeException();}
	 if (poly2 != 'A' && poly2 != 'B' && poly2 != 'C') {
		 throw new RuntimeException();}
	 int p1 = 0; int p2=0; int s1=0;
	 Double x = new Double(); Double y = new Double();
	 if(poly1 == 'A') x=a;
	 if(poly1 == 'B') x=b;
	 if(poly1=='C') x=c;
	 if(poly2=='A') y=a;
	 if(poly2 == 'B') y=b; 
	 if(poly2 == 'C' ) y=c;
	 if(x.isEmpty() || y.isEmpty() ) { throw new RuntimeException();
	 } int sum [][] = new int [x.size() + y.size()][2];
	 while (p1 < x.size() && p2< y.size()) {
		int [] t1 = (int []) x.get(p1);  int [] t2= (int []) y.get(p2);
		if(t1[1] > t2[1]) {
			sum[s1][0]=t1[0]; sum[s1][1]=t1[1]; p1++; s1++;
		}else if(t2[1]>t1[1]) {
			sum[s1][0]= t2[0]; sum[s1][1]=t2[1]; p2++; s1++;
		}else if(t1[1] == t2[1]) {
			sum[s1][0] = t1[0]+t2[0]; sum[s1][1]=t1[1]; p1++; p2++; s1++;
		}
	 } if(p1 == x.size()) {
		 for(int i =p2; i<y.size();i++) {
			 int t [] = (int []) y.get(i);
			 sum[s1][0]=t[0]; sum[s1][1]=t[1]; s1++;
		 }
	 }else if(p2 == y.size()) {
		 for(int i =p1; i<x.size(); i++) {
			 int [] t = (int []) x.get(i);
			 sum[s1][0]=t[0]; sum[s1][1]=t[1];s1++;
		 }
	 } r.clear();
	  for(int i =0; i<sum.length;i++) {
		  int t[]= {sum[i][0], sum[i][1]};
	if(t[0] !=0)  r.add(t); }
		 
	 
 return sum;  }
 
   public static int[][] subtract(char poly1, char poly2){
	   
			 if (poly1 != 'A' && poly1 != 'B' && poly1 != 'C') {
				 throw new RuntimeException();}
			 if (poly2 != 'A' && poly2 != 'B' && poly2 != 'C') {
				 throw new RuntimeException();}
			 int p1 = 0; int p2=0; int s1=0;
			 Double x = new Double(); Double y = new Double();
			 if(poly1 == 'A') x=a;
			 if(poly1 == 'B') x=b;
			 if(poly1=='C') x=c;
			 if(poly2=='A') y=a;
			 if(poly2 == 'B') y=b; 
			 if(poly2 == 'C' ) y=c;
			 if(x.isEmpty() || y.isEmpty() ) {throw new RuntimeException();
			 } int sum [][] = new int [x.size() + y.size()][2];
			 while (p1 < x.size() && p2< y.size()) {
				int [] t1 = (int []) x.get(p1);  int [] t2= (int []) y.get(p2);
				if(t1[1] > t2[1]) {
					sum[s1][0]=t1[0]; sum[s1][1]=t1[1]; p1++; s1++;
				}else if(t2[1]>t1[1]) {
					sum[s1][0]= t2[0] * -1; sum[s1][1]=t2[1]; p2++; s1++;
				}else if(t1[1] == t2[1]) {
					sum[s1][0] = t1[0]-t2[0]; sum[s1][1]=t1[1]; p1++; p2++; s1++;
				}
			 } if(p1 == x.size()) {
				 for(int i =p2; i<y.size();i++) {
					 int t [] = (int []) y.get(i);
					 sum[s1][0]=t[0] * -1; sum[s1][1]=t[1]; s1++;
				 }
			 }else if(p2 == y.size()) {
				 for(int i =p1; i<x.size(); i++) {
					 int [] t = (int []) x.get(i);
					 sum[s1][0]=t[0]; sum[s1][1]=t[1];s1++;
				 }
			 }  r.clear();
			  for(int i =0; i<sum.length;i++) {
				  int t[]= {sum[i][0], sum[i][1]};
			if(t[0] !=0)  r.add(t); }
				 
			 
		 return sum;  }
      
    public static int [][] multiply(char poly1, char poly2){
    	 if (poly1 != 'A' && poly1 != 'B' && poly1 != 'C') {
    		 throw new RuntimeException();}
		 if (poly2 != 'A' && poly2 != 'B' && poly2 != 'C') {
			 throw new RuntimeException();}
		 int p1 = 0; int p2=0; int m=0;
		 Double x = new Double(); Double y = new Double();
		 if(poly1 == 'A') x=a;
		 if(poly1 == 'B') x=b;
		 if(poly1=='C') x=c;
		 if(poly2=='A') y=a;
		 if(poly2 == 'B') y=b; 
		 if(poly2 == 'C' ) y=c;
		 if(x.isEmpty() || y.isEmpty() ) { throw new RuntimeException();}
		 int multi [][] = new int [x.size() * y.size()][2];
		 for(int i =0; i<x.size() ; i++) { int [] t1 = (int []) x.get(i); 
			 for(int j =0; j< y.size() ; j++) { int [] t2 = (int []) y.get(j);
				multi [m][0]= t1[0] * t2[0]; multi [m][1] = t1[1] + t2[1]; m++; 
			 }
		 } sorting(multi);
		 r.clear(); 
		 for(int i =0; i<multi.length;i++) {
			  int t[]= {multi[i][0], multi[i][1]};
		if(t[0] !=0)  r.add(t); }
		 
		 
  return multi;  }
   
     

	
	 public static void sorting (int a [][]) {
		 for(int i =0; i<a.length ; i++) {
			 for(int j=i+1; j < a.length ; j++) {
				 if(a[j][1]> a[i][1]) {
					 int temp = a[i][1]; a[i][1]= a[j][1]; a[j][1]= temp;
					 int temp2=a[i][0]; a[i][0]=a[j][0]; a[j][0]=temp2;
				 }
			 }
		 } Double s = new Double();
		 
		 for(int i =0; i<a.length;i++ ) {
			 for(int j = i+1 ; j<a.length; j++) {
				 if(a[i][1] == a[j][1]) { a[i][0]+=a[j][0]; s.add(j);  a[j][0]=0; a[j][1]=0;   }
			 }
		 } 
	 }
	 
	 
	 public static void main(String[] args) {
		 
		 int a[][] = new int [5][2]; 
		 a[0][0]=1; a[0][1]=0; 
		 a[1][0]=1; a[1][1]=1;
		 a[2][0]=2; a[2][1]=0;
		 a[3][0]=3; a[3][1]=2; 
		 int c [][] = new int [6][2];  int R [][] = new int [6][2];
		 c[0][0]=-1; c[0][1]=0; 
		 c[1][0]=1; c[1][1]=1;
		 c[2][0]=-4; c[2][1]=-3;
		 c[3][0]=2; c[3][1]=2; 
	 
	 setPolynomial('A',a); System.out.println(print('A')); System.out.println(evaluatePolynomial('A',(float)2.6));
	 setPolynomial('C',c); System.out.println(print('C')); System.out.println(evaluatePolynomial('C',(float)2.6));
	 R= add('A', 'C'); System.out.println(print('R'));  System.out.println(evaluatePolynomial('R', (float) 2.6));
	 R = subtract('A', 'C'); System.out.println(print('R')); System.out.println(evaluatePolynomial('R', (float) 2.6 ));
    R = multiply('A', 'C'); System.out.println(print('R')); System.out.println(evaluatePolynomial('R',(float) 2.6));
	 }


}
