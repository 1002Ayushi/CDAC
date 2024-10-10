import java.util.Stack;
import java.util.Scanner;

public class Parantheise {
    public static void main(String[] args) {
        String expression;
        int length;
        char ch;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the Expression: ");
        expression = s.next();
        
        Stack<Character> stack = new Stack<Character>();
        length = expression.length();
        
        for (int i = 0; i < length; i++) {
            ch = expression.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    System.out.println("\nUnbalanced Parentheses!");
                    return;
                }
            } else if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    System.out.println("\nUnbalanced Parentheses!");
                    return;
                }
            } else if (ch == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    System.out.println("\nUnbalanced Parentheses!");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("\nBalanced Parentheses.");
        } else {
            System.out.println("\nUnbalanced Parentheses!");
        }
        
        s.close(); // Close the scanner to avoid resource leaks
    }
}
