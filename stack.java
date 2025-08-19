public class stack {
    int top;
    int capacity;
    int arr[];

    stack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int tem) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top] = tem;
        System.out.println(tem + "pushed");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("stack Elements:");
        for (int i = top; i == 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        stack s = new stack(10);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        s.display();
        s.pop();
        s.display();
        s.pop();
    }


}
