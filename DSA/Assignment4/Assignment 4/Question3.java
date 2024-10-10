/* Detect a cycle in a linked list.
•	Test Case 1:
Input: List = [1 → 2 → 3 → 4 → 5 → 3 (cycle)]
Output: Cycle Detected
•	Test Case 2:
Input: List = [6 → 7 → 8 → 9]
Output: No Cycle
________________________________________

*/
class Question3 {
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
		
	}

public void cycleList(){
	Node slow = head;
	Node fast = head;
	while(fast != null && fast.next != null){
		slow = slow.next;
		fast = fast.next.next;
		
		if(slow == fast){
			System.out.println("Cycle Detected");
			return;
		}
	}
	System.out.println("No cycle");
}

	void display() {
		Node trev = this.head;
		System.out.print("[");
		while (trev != null) {
			System.out.print(trev.data);
			trev = trev.next;
			if(trev != null){
			System.out.print(",");
			}
		}
		System.out.print("]");
	}

	public static void main(String args[]) {
		Question3  q = new Question3();
		q.insertLast(1);
        q.insertLast(2);
        q.insertLast(3);
        q.insertLast(4);
        q.insertLast(5);
        q.insertLast(3);
		
		
		q.display();
		q.head.next.next.next.next = q.head.next;//5-->2 cycle
		System.out.println();
		q.cycleList();
        
		Question3 q2 = new Question3();
        q2.insertLast(6);
        q2.insertLast(7);
        q2.insertLast(8);
        q2.insertLast(9);
        q2.display();
		System.out.println();
        q2.cycleList();
	}
}
