/*5. Find the nth node from the end of a linked list.
•	Test Case 1:
Input: List = [10, 20, 30, 40, 50], n = 2
Output: 40
•	Test Case 2:
Input: List = [5, 15, 25, 35], n = 4
Output: 5
________________________________________
*/

class Question5{
	Node head;
	
	 static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	 }
		public void append(int value){
			Node new_node = new Node(value);
			if(head == null){
				head = new_node;
			}
			else{
			Node trev = head;
			while(trev.next != null){
				trev = trev.next;
			}
			trev.next = new_node;
			}
		}
		
	public 	int findKthFromEnd(int key){
		Node trev = head;                                                                    
		Node prev = head;
		
		for(int i = 0 ; i<key ; i++){
			if(prev == null){
				return -1;
			}
			prev = prev.next;
		}
		while(prev != null){
			trev = trev.next;
			prev = prev.next;
		}
		return trev.data;
		}
		
		public void display(){
			Node trev = head;
		System.out.print("[");
			while(trev != null){
				System.out.print(trev.data+" ");
				trev = trev.next;
			}
		System.out.print("]");
			System.out.println();
		}
		
		public static void main(String []args){
		 Question5 q1 = new Question5();
        q1.append(10);
        q1.append(20);
        q1.append(30);
        q1.append(40);
        q1.append(50);
        System.out.print("List: ");
        q1.display();

		int result1 = q1.findKthFromEnd(2);
        System.out.println(result1);

        Question5 q2 = new Question5();
        q2.append(5);
        q2.append(15);
        q2.append(25);
        q2.append(35);
        System.out.print("List: ");
        q2.display();

  
        int result2 = q2.findKthFromEnd(4);
        System.out.println(result2);
    }
}
