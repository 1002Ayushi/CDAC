/*. Reverse a singly linked list.
•	Test Case 1:
Input: List = [1, 2, 3, 4, 5]
Output: List = [5, 4, 3, 2, 1]
•	Test Case 2:
Input: List = [10, 20, 30]
Output: List = [30, 20, 10]
________________________________________

*/
class Question2 {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}


	void insertLast(int value) { // append
		Node new_node = new Node(value);
		if (head == null) {
			head = new_node;
		} else {
			Node trev = head;
			while (trev.next != null) {
				trev = trev.next;
			}
			trev.next = new_node;
			// new_node.next = null;
		}
		return;
	}

void reverse(){
	Node prev = null;
	Node current = head;
	Node next;
	while(current != null){
		next = current.next;
		current.next = prev;
		
		prev = current;
		current = next;
	}
	printreverse(prev);
}
void printreverse(Node prev){
	Node trev = prev;
	System.out.print("[");
	while(trev != null)
	{
		System.out.print(trev.data+",");
		trev = trev.next;
	}
	System.out.print("]");
	
	}

	void display() {
		Node trev = this.head;
		System.out.print("[");
		while (trev != null) {
			System.out.print(trev.data + " ");
			trev = trev.next;
			System.out.print(",");
		}
		System.out.print("]");
	}

	public static void main(String args[]) {
		Question2 q = new Question2();
		Question2 q1 = new Question2();
		
		q.insertLast(1);
		q.insertLast(2);
		q.insertLast(3);
		q.insertLast(4);
		q.insertLast(5);
	
         q.display();
		System.out.println();
		
		q.reverse();
	}
}
