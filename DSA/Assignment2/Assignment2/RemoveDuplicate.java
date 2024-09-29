import java.util.Arrays;
import java.util.Scanner;


public class RemoveDuplicate{

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
        int[] arr = new int[size];
		int temp[] = {};
		int count = 0;
		
		System.out.println("enetr elements");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("array with duplicate elements"+ Arrays.toString(arr));
	
		for(int i=0;i<size;i++)
		{
			if(arr[i] == arr[i+1]){ 
			count++;
			 continue;
			}
			temp[i] = arr[i+1];
		}
			System.out.println("\ncount of non duplicate values are : "+count);
		System.out.println("array with no duplicate elements"+ Arrays.toString(temp));
			
			
}
}