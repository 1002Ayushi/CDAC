import java.util.Scanner;
class NonRepeated{
	private static char isNotRepeated(String str){
		char c;
		for(int i=0; i<str.length(); i++){
			boolean bool=true;
			for(int j=0; j<str.length();j++){
				if(j!=i && str.charAt(i)==str.charAt(j)){
					bool = false;
					break;
				}
			}
			if(bool)
				return str.append(str.charAt(i)).append(" ");
		}
		return '-';
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	//Scanner file to tke input(s)
		System.out.print("Enter a String: ");
		String str = sc.nextLine();					//Storing i/p from user in var
		System.out.println(isNotRepeated(str));
	}
}