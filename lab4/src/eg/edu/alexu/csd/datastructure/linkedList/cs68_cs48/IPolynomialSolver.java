package eg.edu.alexu.csd.datastructure.linkedList.cs68_cs48;

public interface IPolynomialSolver {

	void setPolynomial(char poly, int[][] terms);
	/**
	* Print the polynomial in ordered human readable representation
	* @param poly
	* name of the polynomial
	* @return polynomial in the form like 27x^2+x-1
	*/
	String print(char poly);
	/**
	* Clear the polynomial
	* @param poly
	* name of the polynomial
	*/
	void clearPolynomial(char poly);
	float evaluatePolynomial(char poly, float value);
	/**
	* Add two polynomials
	* @param poly1
	* first polynomial
	* @param poly2
	* second polynomial
	* @return the result polynomial
	*/
	int[][] add(char poly1, char poly2);
	/**
	* Subtract two polynomials
	* @param poly1
	* first polynomial
	* @param poly2
	* second polynomial
	* @return the result polynomial
	*/
	int[][] subtract(char poly1, char poly2);
	/**
	* Multiply two polynomials
	* @param poly1
	* first polynomial
	* @param poly2
	* second polynomial
	* @return the result polynomial
	*/
	int[][] multiply(char poly1, char poly2);
}
