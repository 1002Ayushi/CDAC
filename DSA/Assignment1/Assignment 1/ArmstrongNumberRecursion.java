import java.util.Scanner;

class ArmstrongNumberRecursion{
	static int armSum(int number, int power)
	{
		 // Base case: when number becomes 0, return 0
		if(number == 0){
			return 0;
		}
		
		 // Get the last digit
	int digit = number % 10;
	
	 // Recursive case: Add the nth power of the last digit to the result of remaining digits
	return (int)Math.pow(digit,power)+armSum(number / 10 ,power);
	}

// Helper method to calculate the number of digits in the number
static int count(int number){
if(number == 0){
	return 0;
}
return 1+ count(number/10);
}
static boolean isArmNum(int number){
	int numOfDigit = count(number);// Find the number of digits
	return number == armSum(number , numOfDigit);// Check if the sum equals the original number
}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
		System.out.println("armstrong "+ isArmNum(n));
}
}
