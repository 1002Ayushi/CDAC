/*Evaluate a postfix expression using a stack.
•	Test Case 1:
Input: "5 3 + 2 *"
Output: 16
•	Test Case 2:
Input: "4 5 * 6 /"
Output: 3
________________________________________
*/
import java.util.Stack;
import java.lang.Math;

class PostfixStack{
	
static int postfixEvaluation(String s){
	Stack<Integer> stack = new Stack<>();
	String[] tokens = s.split(" ");
	
	for(String c : tokens){
		if(Character.isDigit(c.charAt(0)))
			stack.push(Integer.parseInt(c));
	
	else{
		int op2 = stack.pop();
		int op1=stack.pop();
		
		switch(c.charAt(0))
		{
			case '+' :
			stack.push(op1+op2);
			break;
			case '-':
			stack.push(op1-op2);
			break;
			case '*':
			stack.push(op1*op2);
			break;
			case '/':
			stack.push(op1/op2);
			break;
			case '^':
			stack.push((int)Math.pow(op1,op2));
			break;
			default:
			throw new IllegalArgumentException("invalied operator");
		}
	}
	}
	return stack.pop();
}
	public static void main(String []args){
	String exp = "5 3 + 2 *";
	System.out.println(postfixEvaluation(exp));
	
	String exp1 = "4 5 * 6 /";
	System.out.println(postfixEvaluation(exp1));
	}
}
		
