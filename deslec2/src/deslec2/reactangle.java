package deslec2;

public class reactangle extends Shape {
 
 public reactangle() {
	
}
 public reactangle(double len,double wid) {
	length=len; width=wid;
} 
 public reactangle (reactangle r) {
	 this.length=r.length; this.width=r.width;
 }
 public double getarea() {
		return (width*length);
	} 
 
  public static  double multi (double a,double b) {
	 return(a*b);
 }
  public boolean iseql(reactangle re) {
	if( Math.abs(this.length-re.length )<0.001 &&
			Math.abs( this.width-re.width )<0.001 ) return true;
	else return false;
}
 
public double getLength() {
	return length;
}
public void setLength(double length) 
{
	this.length = length;
}
public double getWidth() {
	return width;
}

}
