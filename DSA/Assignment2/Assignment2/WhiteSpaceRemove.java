import java.util.Scanner;

class WhiteSpaceRomove{
public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
  String s = sc.nextLine();
/*  
  String[] strs = s.split(" ");
  String ans = "";
  
  //String str = s.replaceAll(" ","");
 // System.out.println("answer: "+str);
 System.out.println("answer: "+ans);
} */

StringBuilder result = new StringBuilder();
for(int i=0; i<s.length();i++){
	if(s.charAt(i) != ' '){
		result.append(s.charAt(i));
	}
}
System.out.println(result);

}
}