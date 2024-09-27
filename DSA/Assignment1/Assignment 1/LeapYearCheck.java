import java.util.Scanner;

class LeapYearCheck {

    // Recursive method to check if a year is a leap year
    static boolean isLeapYear(int year) {
        // Base case: If year is less than or equal to 0, it's invalid
        if (year <= 0) {
            return false;
        }

        // Leap year conditions
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input year from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check if the given year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
