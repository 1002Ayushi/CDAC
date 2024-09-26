import java.util.Scanner;
class facto{
	public static int fact(int n){
		if( n == 0)
			return 1;
		if(n <=1)
			return 1;
		else
			return n*fact(n-1);
	}
public static void main(String args[]){
	System.out.println("enter number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("factorial : "+fact(n));
}
}