import java.util.Scanner;

class ReverseNumber{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n = sc.nextInt();//123
int temp=0;

int sign = (n<0) ? -1 :1;// Determine the sign of the number
 n = Math.abs(n); // Work with the absolute value of the number
 
while(n>0){
temp = temp*10 + n%10;//3 -->
n = n/10;//12
}

 temp *= sign;
 
 if(sign == -1)
System.out.print("reverse number: "+ temp);
else
	System.out.print("reverse number: "+ temp);
}
}

/*
Input: 12345
Output: 54321
Input: -9876
Output: -6789
*/