class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 2;
        char op = '/';

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("wrong input");

        }
    }
}