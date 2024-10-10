/*Implement a Min-Heap.
•	Test Case 1:
Input: Insert 10, 15, 20, 17, Extract Min
Output: Min-Heap = [15, 17, 20], Extracted Min = 10
•	Test Case 2:
Input: Insert 30, 40, 20, 50, Extract Min
Output: Min-Heap = [30, 40, 50], Extracted Min = 20
________________________________________
*/
class Question9{
	public static void main(String []args){
		
		void heapify(int arr[],int n ,int i){
			int largest = i;
			int l = 2*i+1;
			int r = 2*i+2;
			
			if(l<n &&
		}
		
		void heapsort(int arr[]){
			int n = arr.length;
			
			//min heap
			for(int i =0; i<n/2;i++){
				int temp = arr[0];
				arr[0] = arr[i];
				arr[i] = temp;
				
				heapify(arr,0,i);
			}
		}
		
		void display(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+ " ");
		}
		System.out.println();
		
	}
		
		Question9 h1 = new Question9();
		int arr[] = {10,15,20,17};
		h1.display(arr);
		
		h1.heapsort(arr);
		h1.display(arr);
		
	}
}