import java.util.Scanner;

class Queue {
    int front, rear;
    int[] arr;
    int max;

    Queue(int size) {
        this.max = size;
        front = rear = -1;
        arr = new int[max];
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return rear == max - 1;
    }

    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + x);
        } else {
            if (front == -1) {
                front = 0; // First element enqueued
            }
            arr[++rear] = x;
            System.out.print(x + " enqueued --> ");
        }
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            System.out.println("Dequeued element: " + arr[front]);
            if (front >= rear) {
                // Queue has only one element
                front = rear = -1;
            } else {
                front++;
            }
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue = [");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + (i < rear ? ", " : ""));
            }
            System.out.println("]");
        }
    }
}

public class Question6 {

    public static void menuDriven(Queue queue, Scanner scanner) {
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
        Queue queue = new Queue(10); // Queue size of 10
        menuDriven(queue, scanner); // Call the menu-driven helper method
        scanner.close();
    }
}
