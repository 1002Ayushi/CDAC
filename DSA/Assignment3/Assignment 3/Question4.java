import java.util.Scanner;

class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    // Stack constructor
    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push method
    public void push(int value) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack overflow");
        }
        arr[++top] = value;
    }

    // Pop method
    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack underflow");
        }
        return arr[top--];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}

public class Question4 {
    public static int evaluatePostfix(String expression) {
        Stack stack = new Stack(100); // Initialize stack with a capacity of 100
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                int rightOperand = stack.pop();
                int leftOperand = stack.pop();
                int result = applyOperator(leftOperand, rightOperand, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop(); // The final result
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int applyOperator(int left, int right, String operator) {
        switch (operator) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            default:
                throw new UnsupportedOperationException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a postfix expression: ");
        String input = scanner.nextLine();

        try {
            int result = evaluatePostfix(input);
            System.out.println("Output: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
