package studens;
import java.util.*;
public class tablestudents {
	
	static String [][] students = new String [20][4];
static int counter1=0;
 static int counter2=0;
static int counter3=0;
 static int counter4=0;
 
	
	static void read_names() {
		
		Scanner input = new Scanner (System.in);
	String line =	input.nextLine();
	while(line.compareTo("END")!=0) {
	String[] commpents=	line.split(" ");
	String stnames = commpents[0];
	int stclass = Integer.parseInt(commpents[1]);
	if(stclass==1) {
		students[counter1++][0]=stnames;}
	else if(stclass==2) {
		students[counter2++][1]=stnames;}
	else if(stclass==3) {
		students[counter3++][2]=stnames;
	}
	
		 line =	input.nextLine();
	}

	}
	static   int get_number(String name) {
		int counter=0;
		for(int i =0;i<4;i++) {
			for(int j=0;j<20;j++) {
				if(students[j][i]!=null) {
				if(students[j][i].compareTo(name) == 0) {
					counter++;
				}
			}}
		}
		   return counter;
	   }

	public static void main(String[] args) {
		read_names();
		Scanner input = new Scanner (System.in);
		String name = input.nextLine() ;
	System.out.println(get_number(name));
	//	for(int i =0;i<4;i++) {
	//		for(int j=0;j<20;j++) {
	//			System.out.println(students[j][i]);
	//		}
	//	}
		
		
	}

}
