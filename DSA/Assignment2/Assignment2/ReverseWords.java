import java.util.Scanner;
import java.io.*;

public class ReverseWords
{

static String reverse(String s){
String s1 ="";
int strlength = s.length();
for(int i = strlength-1 ; i>0 ; i--)
{
s1 += s.charAt(i);
}
return s1;
}

public static void main(String srgd[]){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
System.out.println("reverse string: "+ reverse(str));
}
}
//java programming
//reverse string: gnimmargorp ava