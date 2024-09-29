import java.util.Scanner;
import java.util.Arrays;
class ArrayLeftRotation{
public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a size of array!!!");
	int size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("enter position to left rotate");
	int d = sc.nextInt();
	int temp[] = new int[size];
	
	System.out.println("enter array elements");
	for(int i=0; i<size ; i++){
		arr[i] = sc.nextInt();
}
System.out.println("original : "+Arrays.toString(arr));
	

for(int i=0; i<size-d ; i++){
      temp[i] = arr[d+i];
}
for(int i=0; i<d ; i++){
temp[size - d+i] =arr[i];
}
		System.out.println("after rotate : "+Arrays.toString(temp));
}
}
