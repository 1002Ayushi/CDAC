/* Implement a Stack using an array.
•	Test Case 1:
Input: Push 5, 3, 7, Pop
Output: Stack = [5, 3], Popped element = 7
•	Test Case 2:
Input: Push 10, Push 20, Pop, Push 15
Output: Stack = [10, 15], Popped element = 20
________________________________________
*/
import java.util.Arrays;
import java.util.Scanner;

class Stack1{
static final int max= 3;
 int arr[] = new int[max]; ;
 int top;

Stack1()
{
	top = -1;
}

boolean isEmpty()
{
		return (top < 0);
}

boolean isFull()
{

		return (top == max-1);
}

boolean push(int x){
	if(top >= max-1){
		System.out.println("stack overflow");
		return false;
	}
	else 
		arr[++top] = x;
	return true;
}

int pop(){
	if(top < 0){
		System.out.println("stack is underflow");
		return -1;
	}
	 return arr[top--];
	
}
/*
void display(){
	if(isEmpty()){
		System.out.println("stack Empty");
	}
	else
		System.out.println("stack elemnets are: ");
		
		System.out.println();
}	

void show(int index){
	if(index < 0) //base condition
	return;
		System.out.print(arr[index]+" ");
	show(index-1); //recursive call
}*/

public String toString(){
	StringBuilder sb = new StringBuilder("[");
	for(int i=0; i<=top;i++){
		sb.append(arr[i]);
		if(i<top){
			sb.append(",");
		}
	}
	sb.append("]");
	return sb.toString();
}

public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	Stack1 s1 = new Stack1();
	Stack1 s2 = new Stack1();
	s1.push(5);
	s1.push(3);
	s1.push(7);
	
   int popped1 = s1.pop();
   System.out.println("Stack = " + s1 + ", Popped element = " + popped1);
	
	s2.push(10);
	s2.push(20);
	s2.push(30);
	
	int popped2 = s2.pop();
	
	 System.out.println("Stack = " + s2 + ", Popped element = " + popped2);
	
}
}