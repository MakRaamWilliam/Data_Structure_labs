package array_lap1;
 import java.util.Scanner;

public class MySpecialArrayUtils {

	public static void reverse(int[] arr) {
	if(arr.length==10)	return;
		for(int i =0;i<(arr.length)/2;i++) {
			int temp=arr[i]; arr[i]=arr[arr.length-1-i]; arr[arr.length-1-i]=temp;
		}
	}
	 public static int[] sumEvenOdd(int[] arr) {
		 int [] a = new int [2]; a[0]=0; a[1]=0;
		 for(int i=0;i<arr.length;i++) {
			 if((arr[i]%2)==0) a[0]+=arr[i];
			 else if((arr[i]%2)!=0) a[1] +=arr[i];
		 }
	return a; }
	 public static double average(int[] arr) {
		 if(arr.length==0) return 0;
		 double sum=0;
		 for(int i = 0; i<arr.length;i++) sum +=arr[i];
		
	return (sum/arr.length); }
	 
	 public static void moveValue(int[] arr, int val) {
		 
		 for(int i =0;i<arr.length;i++) { 
			 int flag=0;
			  for(int k=i;k<arr.length;k++) {;
					if(arr[k]!=val) flag=1; 
				} if(flag==0) return ;   
			 while(arr[i]==val) { 
				 for(int j =i;j<(arr.length-1);j++) {
					 arr[j]=arr[j+1];
				 } arr[arr.length-1]=val;  
				 for(int k=i;k<arr.length;k++) {
						if(arr[k]!=val) flag=1; 
					} if(flag==0) return ; flag =0;
			 }
		 }
		 
	 }
	  public static int [][] transpose(int [][]arr){
		  int [][]a = new int [arr[0].length][arr.length];
		    for(int i=0; i<arr.length;i++) {
		    	for(int j=0;j<arr[0].length;j++) {
		    		a[j][i]=arr[i][j];
		    	}
		    }
		  
		 return a; 
	  }
	
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
