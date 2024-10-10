//Array implementaion
/*Check for balanced parentheses using a stack.
•	Test Case 1:
Input: "({[()]})"
Output: Balanced
•	Test Case 2:
Input: "([)]"
Output: Not Balanced
*/

class Stack {
	private final int MAX;// dont want to chnge the value so go with static and final
	private int top;
	private char a[];

	Stack(int length) {
		this.MAX = length;
		a = new char[MAX];
		top = -1;
	}

	// Underflow
	boolean isEmpty() {
		return (top < 0);// return -1
	}

	// Insertion in stack
	boolean push(char x) {
		if (top >= (MAX - 1)) {
			System.out.println("stack overflow");
			return false;
		}
		a[++top] = x;
		return true;
	}

	// deletion
	char pop() {
		if (top < 0) {
			System.out.println("stack underflow");
			return '\0';// return null character
		}
		return a[top--];
	}

	// top position find
	char peek() {
		return (top < 0) ? '\0' : a[top];
	}

	static String BalancedParantheses(String s) {
		Stack stack = new Stack(s.length());
		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return "Not Balanced";
				}
				char topchar = stack.pop();
				if (isMatchingPair(topchar, ch)) {
					return "balanced";
				}
			}
		}
		return stack.isEmpty() ? "Balanced" : "Not Balanced";
	}

	static boolean isMatchingPair(char open, char close) {
		return (open == '(' && close == ')') ||
				(open == '{' && close == '}') ||
				(open == '[' && close == ']');
	}

	public static void main(String[] args) {
		String input1 = "({[()]})";
		System.out.println("input : " + input1 + " output : " + BalancedParantheses(input1));

	}
}