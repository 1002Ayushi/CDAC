// Stack implementation using an array
class Stack {
    private char[] arr;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        arr = new char[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char value) {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = value;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return '\0'; // Return null character if stack is empty
        }
        return arr[top--];
    }
}

// Main class to check for balanced parentheses
public class Paranthesee { // Ensure this matches the file name
    public static String checkBalanced(String exp) {
        Stack stack = new Stack(exp.length());

        for (char ch : exp.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') { // Push opening brackets
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') { // Check for closing brackets
                if (stack.isEmpty()) {
                    return "Not Balanced";
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return "Not Balanced";
                }
            }
        }
        return stack.isEmpty() ? "Balanced" : "Not Balanced";
    }

    private static boolean isMatchingPair(char open, char close) { // Helper method
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        // Test Case 1
        String input1 = "({[()]})";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + checkBalanced(input1)); // Expected output: Balanced

        // Test Case 2
        String input2 = "([)]";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + checkBalanced(input2)); // Expected output: Not Balanced
    }
}
