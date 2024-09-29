import java.util.Scanner;
import java.io.*;

public class ReverseWord
{
// Method to reverse the order of words in a string
static String reverse(String s){
	String[] word = s.split(" ");// Split the string into words
String revstr =""; // Variable to store the reversed words

for(int i = word.length-1 ; i>=0 ; i--)
{
	revstr += word[i]; // Append each word to the result
    if(i != 0){
		revstr += " ";// Add space between words, but not after the last word
	}
}
return revstr;
}

public static void main(String srgd[]){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
System.out.println("reverse string: "+ reverse(str));
}
}
//hello java
//reverse string: java hello