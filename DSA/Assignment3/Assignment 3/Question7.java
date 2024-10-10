
/*Implement a Circular Queue using an array.
•	Test Case 1:
Input: Enqueue 4, 5, 6, 7, Dequeue, Enqueue 8
Output: Queue = [8, 5, 6, 7]
•	Test Case 2:
Input: Enqueue 1, 2, 3, 4, Dequeue, Dequeue, Enqueue 5
Output: Queue = [5, 3, 4]
________________________________________
*/
import java.util.Scanner;

class Question7 {
    private int[] queue;
    private int front, rear, capacity, size;

    public Question7(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity; // Move rear circularly
        queue[rear] = value; // Add value to the rear
        size++;
        System.out.println(value + " enqueued.");
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return -1 if preferred
        }
        int value = queue[front]; // Get value at front
        front = (front + 1) % capacity; // Move front circularly
        size--;
        System.out.println("Dequeued element: " + value);
        return value;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to display the current state of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue = [");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Menu-driven method
    public static void menuDriven(Question7 queue, Scanner scanner) {
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Enqueue
                    System.out.print("Enter a number to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;

                case 2: // Dequeue
                    queue.dequeue();
                    break;

                case 3: // Display
                    queue.display();
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    return; // Exit the menu method

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question7 cq1 = new Question7(4);

        // Menu-driven interaction
        menuDriven(cq1, scanner); // You can also interact with the first queue
        scanner.close();
    }
}
