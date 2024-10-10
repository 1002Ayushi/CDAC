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
	
	public class Question3{
	public static String reverse(String s){
	   Stack s1 = new Stack(s.length());
	     for (char ch : s.toCharArray()) {
            s1.push(ch);
        }

        // Pop each character from the stack to form the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!s1.isEmpty()) {
            reversed.append(s1.pop());
        }

        return reversed.toString();
    }
	
	public static void main(String[] args) {
        // Test Case 1
		String i = "hello";
        System.out.println("Input: " + reverse(i));
}
}
