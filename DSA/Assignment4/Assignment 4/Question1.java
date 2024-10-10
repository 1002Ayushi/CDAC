/*•	Test Case 1:
Input: Insert 3 → Insert 7 → Insert 5 → Delete 7 → Search 5
Output: List = [3, 5], Found = True
•	Test Case 2:
Input: Insert 9 → Insert 4 → Delete 4 → Search 10
Output: List = [9], Found = False
________________________________________
*/
class Question1 {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	void insertFirst(int value) {
		Node new_node = new Node(value);
		new_node.next = head;
		head = new_node;
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

	void insertMiddle(int value, int val) {
		Node new_node = new Node(value);
		Node trev = head;
		while (trev.data != val) {
			trev = trev.next;
		}
		new_node.next = trev.next;
		trev.next = new_node;
	}

	void deleteFirst() {
		head = head.next;
	}

	void deleteLast() {
		Node trev = head;
		while (trev.next.next != null) {
			trev = trev.next;
		}
		trev.next = null;
	}

	void deleteMiddle(int value) {// by value
		Node current = head;
		Node previous = null;

		while (current.data != value) {
			previous = current;
			current = current.next;
		}
		previous.next = current.next;
		current.next = null;
	}

	int getLength() {
		Node trev = head;
		int count = 0;
		while (trev != null) {
			trev = trev.next;
			count++;
		}
		return count;
	}

	void searchFirstNode() {
		System.out.println("first node data: " + head.data);
	}

	void searchLastNode() {
		Node trev = head;
		while (trev.next != null) {
			trev = trev.next;
		}
		System.out.println("last node data: " + trev.data);
	}

	void searchMiddleNode() {
		Node slow = head;
		Node fast = head;
		while (fast != null && slow != null) {
			slow = fast.next;
			fast = fast.next.next;
		}
		System.out.println("find middle node data : " + slow.data);
	}

	void searchElement(int value) {
		Node trev = head;
		while (trev != null) {
			if (trev.data == value)
			System.out.println("Found = true" );// element found
			else{
				System.out.println("Found = false");	
			}
			trev = trev.next;
		}
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
		Question1 q = new Question1();
		Question1 q1 = new Question1();
		
		q.insertLast(3);
		q.insertLast(7);
		q.insertLast(5);
		 
		q.deleteMiddle(7);

         q.display();
		System.out.println();
		q.searchElement(5);
		
		q1.insertLast(9);
		q1.insertLast(4);

		q1.deleteMiddle(4);

         q1.display();
		System.out.println();
		q1.searchElement(10);

	}
}
