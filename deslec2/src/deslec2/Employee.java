package deslec2;

public class Employee extends Person {
   double salary;private String dep;private double bounes;
  private static int no=0;
 public Employee() {
	no++;
} 
  public Employee (int i,String n,String d, double s,double b ) {
	  super(n,i);
	  dep=d; salary =s; bounes=b;  no++;
  }
     public static int num() {
    	return no; 
     }
   public  double get_salary() {
	return salary;
}
   @Override  
 public void printall() {
  super.printall();
	 System.out.println("salary:"+salary);
	 System.out.println("bounes:"+bounes); 
 }
 
 
public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public double getBounes() {
	return bounes;
}

public void setBounes(double bounes) {
	this.bounes = bounes;
}

public String getDep() {
	return dep;
}

public void setDep(String dep) {
	this.dep = dep;
}


  
}
