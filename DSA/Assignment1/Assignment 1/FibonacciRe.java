import java.util.Scanner;

public class FibonacciRe{
	static int fibo(int n){
		if(n <= 1)
			return n;
	    else
           return fibo(n-1)+fibo(n-2);		
	}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
for(int i=0; i<=num ; i++){
System.out.print(fibo(i)+" ");//0 1 1 2 3 5 8 13 21 34 55

}
}
}
//fib(3)=fib(2)+fib(1)
//        =fib(1)+fib(0)+1
//f(n) = f(n-1) + f(n-2)