
import java.util.Scanner;
class StringPellindrom{

static boolean pellindrome(String s)
{
//String orgi = s;
String temp = "";
for(int i=s.length()-1; i>=0; i--)
{
  temp += s.charAt(i);
// s.charAt[i] = s.charAt[s.length];
}
System.out.println("reverse String: "+temp);

if(s.equals(temp))
 return true;	
else 
	return false;
}


public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter a string");
String str = sc.nextLine();
System.out.println("is pellindrome: " + pellindrome(str));
}
}
/*Input: "madam"
Output: true
Input: "hello"
Output: false
*/