package eg.edu.alexu.csd.datastructure.stack;

public interface IExpressionEvaluator {
	
	public String infixToPostfix(String expression);
	/**
	* Evaluate a postfix numeric expression, with a single space separator
	*
	* @param expression
	* postfix expression
	* @return the expression evaluated value
	*/
	public int evaluate(String expression);

}
