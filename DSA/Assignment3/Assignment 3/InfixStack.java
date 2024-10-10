import java.util.Scanner;
/*. Convert an infix expression to postfix using a stack.
•	Test Case 1:
Input: "A + B * C"
Output: "A B C * +"
•	Test Case 2:
Input: "A * B + C / D"
Output: "A B * C D / +"
________________________________________
*/

class Stack {
    private char[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new char[size];
        capacity = size;
        top = -1;
    }

    public void push(char value) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack overflow");
        }
        arr[++top] = value;
    }

    public char pop() {
        if (top == -1) {
            throw new RuntimeException("Stack underflow");
        }
        return arr[top--];
    }

    public char peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int precedence(char operator) {
        if (operator == '+' || operator == '-') return 1;
        if (operator == '*' || operator == '/') return 2;
        return 0;
    }
}

public class InfixStack {
    public static String convertToPostfix(String expression) {
        Stack stack = new Stack(100);
        StringBuilder postfix = new StringBuilder();

        for (char current : expression.toCharArray()) {
            if (Character.isLetterOrDigit(current)) {
                postfix.append(current).append(' ');
            } else if (current == '+' || current == '-' || current == '*' || current == '/') {
                while (!stack.isEmpty() && stack.precedence(stack.peek()) >= stack.precedence(current)) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(current);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }

        return postfix.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an infix expression: ");
        String input = scanner.nextLine();
        String result = convertToPostfix(input);
        System.out.println("Postfix: " + result);
        scanner.close();
    }
}
