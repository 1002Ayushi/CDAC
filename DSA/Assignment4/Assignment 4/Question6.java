/* Remove duplicates from a sorted linked list.
•	Test Case 1:
Input: List = [1, 1, 2, 3, 3, 4]
Output: List = [1, 2, 3, 4]
•	Test Case 2:
Input: List = [7, 7, 8, 9, 9, 10]
Output: List = [7, 8, 9, 10]
________________________________________
*/
class Question6{
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
		public void removeDuplicate(){
				Node current = head;
				while(current != null && current.next != null){
				if(current.data == current.next.data){
					current.next = current.next.next;
				} else {
				current = current.next;
				}
				}
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
		 Question6 q1 = new Question6();
        q1.append(1);
        q1.append(1);
        q1.append(2);
        q1.append(3);
        q1.append(3);
        q1.append(4);
        System.out.print("List: ");
        q1.display();
		q1.removeDuplicate();
        q1.display();
		

        Question6 q2 = new Question6();
        q2.append(7);
        q2.append(7);
        q2.append(8);
        q2.append(9);
        q2.append(9);
        q2.append(10);
		
        System.out.print("List: ");
        q2.display();
		q2.removeDuplicate();
        q2.display();
		

    }
}
