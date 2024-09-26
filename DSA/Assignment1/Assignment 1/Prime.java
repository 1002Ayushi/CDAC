import java.util.Scanner;
class Prime{
public static boolean isPrime(int num,int div){
	if(num < 2)
		return false;
	if(div == 1)
		return true;
	if(num % div == 0)
		return false;
	return isPrime(num,div-1);
}


public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if(isPrime(num , num/2))
	{
		System.out.println(num +" true prime");
	}
	else{
		System.out.println(num+" false not a prime");
	}
}
}