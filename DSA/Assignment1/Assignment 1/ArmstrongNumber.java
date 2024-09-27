import java.util.Scanner;

class ArmstrongNumber{
	static int counting(int a){
		int count =0;
		while(a !=0)
	{
		int temp = a%10;
		count ++;
		a = a/10;
	}
	return count;
	}
	static int result(int original,int count){
		int sum =0;
		while(original !=0)
	{
	  int digit = original%10;
      sum += Math.pow(digit,count);
      original /= 10;	  
	}
	return sum;
	}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int original = n;

	int summ = result(original,counting(n));
	if(n == summ){
		System.out.println("armstrong "+n);
	}
	else 
		System.out.println("not "+n);
}
}