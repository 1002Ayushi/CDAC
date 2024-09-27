import java.util.Scanner;

class IntegerPalindrome {


    // Helper method to find the reverse of the number using recursion
    static int reverse(int num, int rev) {
        // Base case: when the number becomes 0
        if (num == 0) {
            return rev;
        }
        // Reverse the number by moving digits
        rev = (rev * 10) + (num % 10);
        return reverse(num / 10, rev);
    }

    // Method to check if the number is a palindrome
    static boolean isPalindrome(int num) {
        // If number is negative, return false directly
        if (num < 0) {
            return false;
        }
        // Get the reverse of the number and compare with original number
        return num == reverse(num, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
