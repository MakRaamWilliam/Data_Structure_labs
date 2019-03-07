package array_lap1;

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
}
