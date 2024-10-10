public class StackMin {
	private int top;
	int size;
	private int[] arr;
	int min = Integer.MAX_VALUE;

	StackMin(int size) {
		top = -1;
		arr = new int[size];
	}

	void push(int element) {
		if (top == size - 1) {
			System.out.println("stack overflow");
			// return;
		}
		if (min > element) {
			min = element;
		}
		arr[++top] = element;
	}

	void pop() {
		if (top == -1) {
			System.out.println("stack underflow");
		}
		top--;
	}

	int getMin() {
		int result = (top + size - 1) / 2;
		int min = arr[result];
		return min;
	}

	public static void main(String[] args) {
		StackMin s = new StackMin(10);
		s.push(10);
		s.push(20);
		System.out.println("get min " + s.getMin());
	}

}