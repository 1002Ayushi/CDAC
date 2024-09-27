
import java.util.Scanner;

class SquareRoot{

public static int Squareroot(int n )//n=4
{
	//base condition
	if( n ==0 || n==1)//false
		return n;
	
	 // Starting from 1, try all numbers until
     // i*i is greater than or equal to x.
	int i =1 , result =1;
	while( result <= n){ // 1<= 4 -->true, true --> 4==4
		i++;              // i =2, i =3
		result = i * i;   //result = 4 , 9
	}
	return i-1;  //3-1 = 2
}

public static void main(String []args)
{
Scanner sc = new Scanner(System.in);
System.out.println("eneter any one number");
int a = sc.nextInt();

System.out.println("squareRoot : "+ Squareroot(a));// a= 4 , return "2"
}
}