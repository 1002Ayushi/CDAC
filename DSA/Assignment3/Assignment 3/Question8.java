
/*Implement a Queue using two Stacks.
•	Test Case 1:
Input: Enqueue 3, Enqueue 7, Dequeue
Output: Queue = [7], Dequeued element = 3
•	Test Case 2:
Input: Enqueue 10, 20, Dequeue, Dequeue
Output: Queue = [], Dequeued elements = 10, 20
________________________________________
*/
import java.util.Scanner;

class Question8 {
    int top1;
    int top2;
    int arr1[];
    int arr2[];
    int size;

    Question8(int size) {
        top1 = top2 = -1;
        this.size = size;
        arr1 = new int[size];
        arr2 = new int[size];
    }

    void push(int value) {
        if (top1 == size - 1) {
            System.out.println("stack is full");
            return;
        } else {
            arr1[++top1] = value;
        }
    }

    int pop() {
        if (top2 == -1) {
            while (top1 != -1) {
                arr2[++top2] = arr1[top1--];
            }
        }
        if (top2 == -1) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        return arr2[top2--];// pop from stack2
    }

    public void display() {
        System.out.print("Queue = [");
        for (int i = top2; i >= 0; i--) {
            System.out.print(arr2[i]);
            if (i > 0 || top1 != -1) {
                System.out.print(", ");
            }
        }
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr1[i]);
            if (i < top1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Helper method for menu-driven input
    public static void menu(Question8 queue) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an action: enqueue, dequeue, display, exit");
            String choice = sc.nextLine().trim().toLowerCase();
            switch (choice) {
                case "enqueue":
                    System.out.print("Enter the value to enqueue: ");
                    int e = sc.nextInt();
                    sc.nextLine(); // Consume the newline
                    queue.push(e);
                    break;
                case "dequeue":
                    int dequeuedValue = queue.pop();
                    if (dequeuedValue != -1) {
                        System.out.println("Dequeued element = " + dequeuedValue);
                    }
                    break;
                case "display":
                    queue.display();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int n = sc.nextInt();
        Question8 queue = new Question8(n);
        sc.nextLine(); // Consume the newline
        menu(queue);
    }

}