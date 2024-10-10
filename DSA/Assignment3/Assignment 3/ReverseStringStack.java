import java.util.Scanner;
import java.util.Stack;
/*. Reverse a string using a stack.
•	Test Case 1:
Input: "hello"
Output: "olleh"
•	Test Case 2:
Input: "world"
Output: "dlrow"
________________________________________
*/

class ReverseStringStack{
	
	public static String reverseString(String s){
	Stack<Character> stack = new Stack<>();
	for(Character c : s.toCharArray()){
		stack.push(c);
	}
	
	StringBuilder rev = new StringBuilder();
	
	while( !stack.isEmpty()){
		rev.append(stack.pop());
	}
	return rev.toString();
	}
	
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println( "reverseString: " + reverseString(str));
		
	}
}