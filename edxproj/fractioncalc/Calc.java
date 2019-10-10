
public class FracCalc {

  private 	int numerator,denominator;
	public FracCalc(int n,int d) {
		numerator=n;  denominator =d;
	}
	public int getDenominator() {
		return denominator;
	}
	public int getNumerator() {
		return numerator;
	}
   public double todouble() {
	   return  ( (numerator *1.0 )/ (denominator * 1.0 ));
   }
    public int gcd(int a , int b) {
    	if(b==0) return a;
    	return gcd(b,a %b);
    }
   
	public FracCalc sum(FracCalc f) {
		int opnum= this.numerator * f.getDenominator() + this.denominator *f.getNumerator();
		int opden= this.denominator * f.getDenominator();
		FracCalc op= new FracCalc(opnum, opden);
		return op;
	}
	public FracCalc negative(FracCalc f) {
		int opnum= this.numerator * f.getDenominator() - this.denominator *f.getNumerator();
		int opden= this.denominator * f.getDenominator();
		FracCalc op= new FracCalc(opnum, opden);
		return op;
	} 
	public FracCalc multiply(FracCalc f) {
		int opnum= this.numerator * f.getNumerator();
		int opden= this.denominator * f.getDenominator();
		FracCalc op= new FracCalc(opnum, opden);
		return op;
	} 
	public FracCalc division(FracCalc f) {
		int opnum= this.numerator * f.getDenominator();
		int opden= this.denominator * f.getNumerator();
		FracCalc op= new FracCalc(opnum, opden);
		return op;
	} 
	public void tolowcase() {  int g=gcd(this.numerator,this.denominator);
		this.numerator= this.numerator/g;
		this.denominator= this.denominator/g;
	}
	public boolean isequals(FracCalc f) {
		this.tolowcase(); 
		f.tolowcase();
		return (this.numerator == f.getNumerator() && this.denominator == f.getDenominator());
	} 
}
