import java.util.Arrays;
import java.util.Scanner;


public class RemoveDuplicate{

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
        int[] arr1 = new int[size];
		int count = 0;
		
		System.out.println("enter elemnts");
		for(int i=0; i<size;i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println("array with duplicates "+Arrays.toString(arr1));

        int newlength = removeDuplicates(arr1);

 System.out.println("New length after removing duplicates from arr1: " + newlength);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr1,newlength)));
        
		sc.close();
    }

    // Method to remove duplicates from a sorted array
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int uniqueIndex = 0; // Index for the next unique element

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            // If the current element is different from the last unique element
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++; // Move to the next position
                arr[uniqueIndex] = arr[i]; // Update the unique element
            }
        }
		return uniqueIndex +1;
}
}