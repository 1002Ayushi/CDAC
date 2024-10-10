/*Implement a doubly linked list with insert, delete, and traverse operations.
•	Test Case 1:
Input: Insert 10 → Insert 20 → Insert 30 → Delete 20
Output: List = [10, 30]
•	Test Case 2:
Input: Insert 1 → Insert 2 → Insert 3 → Delete 1
Output: List = [2, 3]
________________________________________
*/
class Question7{
	Node head;
	 class Node{
		Node prev,next;
		int data;
		Node(int data){
			this.data = data;
			prev=next=null;
		}
	}
void insert(int data){//insert at first
		Node new_node = new Node(data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null){
			head.prev = new_node;
			new_node = head;
		}
	}
		
    void append(int data){//insert at last
	Node new_node = new Node(data);
	if(head == null){
		head = new_node;
	}
	Node trev = head;
		while(trev.next != null){
			trev = trev.next;
		}
		trev.next = new_node;
		new_node.prev = trev;
		new_node.next = null;
		}
		
	void deleteByValue(int value){
		//empty list
	if(head == null)
		return;
	
		Node trev = head;
		while(trev.data != value){
			trev = trev.next;
		}
		trev.next.prev = trev.prev;
		trev.prev.next  =  trev.next;
	}	
		
		void display(){
			Node trev = head;
			while(trev != null){
				System.out.print(trev.data+"--->");
				trev = trev.next;
			}
		}
	
public static void main(String []args){
	Question7 q1 = new Question7();
	q1.append(10);
	q1.append(20);
	q1.append(30);
	q1.display();
	System.out.println();
	q1.deleteByValue(20);
	q1.display();
}
}