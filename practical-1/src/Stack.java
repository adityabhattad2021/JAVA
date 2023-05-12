public class Stack {
    private int top;
    private int[] arr;
    private int size;

    Stack(int size) {
        arr = new int[size];
        this.size = size;
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow!!!");
        } else {
            top++;
            arr[top] = x;
        }
    }

    public int pop() {
        int x = -1;
        if (!isEmpty()) {
            x = arr[top];
            top--;
        } else
            System.out.println("Stack Underflow");

        return x;
    }

    public int peek() {
        int x = -1;
        if (!isEmpty())
            x = arr[top];
        return x;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}