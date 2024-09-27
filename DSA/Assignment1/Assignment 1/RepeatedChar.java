import java.util.Scanner;
import java.util.Arrays;

class RepeatedChar{

public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a string: ");
String str = new String(sc.nextLine());
char [] ch = str.toCharArray();
String temp = "";

for(int i =0; i<ch.length ; i++)
{
	boolean isRepeated = false;
	for(int j =i+1; j<ch.length ; j++){
		if(ch[i] == ch[j]){
			isRepeated = true;
			break;
			
		}
		}
		if(isRepeated && str.indexOf(ch[i]) == i){
			
		System.out.print(ch[i] + " ");
		}
}
}
}