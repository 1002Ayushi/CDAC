/*. Merge two sorted linked lists.
•	Test Case 1:
Input: List1 = [1, 3, 5], List2 = [2, 4, 6]
Output: Merged List = [1, 2, 3, 4, 5, 6]
•	Test Case 2:
Input: List1 = [10, 15, 20], List2 = [12, 18, 25]
Output: Merged List = [10, 12, 15, 18, 20, 25]
________________________________________
*/
class Question4{
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
		
		public static Node merge(Node l1, Node l2){
			if(l1 == null) return l2;
			if(l2 == null) return l1;
			
		if(l1.data < l2.data){
			l1.next = merge(l1.next,l2);
			return l1;
		}
		else{
           l2.next = merge(l1,l2.next);
           return l2;	   
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
			
		}
		
		public static void main(String []args){
			Question4 q1 = new Question4();
			q1.append(1);
			q1.append(3);
			q1.append(5);
			 System.out.print("List1: ");
			q1.display();
			
			System.out.println();
			Question4 q2 = new Question4();
			q2.append(2);
			q2.append(4);
			q2.append(6);
			 System.out.print("List2: ");
			q2.display();
			
			Node neww = merge(q1.head,q2.head);
			
			 System.out.print("\nMerged List: ");
			Question4 mergeList = new Question4();
			mergeList.head = neww;
			mergeList.display();
			
			
		}
	}
