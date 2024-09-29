import java.util.Scanner;
import java.util.Arrays;

class ReverseArray{
public static void main(String []args){
int arr[] = {1,2,3,4};
System.out.println(Arrays.toString(arr));
int start =0;
int end = arr.length-1;

while(start < end){
	int temp = arr[start];
	arr[start] = arr[end];
	arr[end] = temp;
	
	start++;
	end--;
}
System.out.println("reverse: "+Arrays.toString(arr));
}
}

//Input: arr = [1, 2, 3, 4]
//Output: [4, 3, 2, 1]
