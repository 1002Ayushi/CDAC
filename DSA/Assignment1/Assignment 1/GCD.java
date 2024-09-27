//if(a>b)
//gcd(a%b,b)
//else(a,b%a)

import java.util.Scanner;
class GCD{
public  static int findGcd(int a, int b)
{  
if(b > a)//base  condition
return findGcd(b,a);
if( b == 0)
	return a;
else
	return findGcd(b, a%b);
}
public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.println("eneter any two number");
int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("gcd : "+findGcd(a,b));
}
}