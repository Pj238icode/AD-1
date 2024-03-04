public class Stack {
    class stack {
        int data;
        stack next;

        stack(int data) {
            this.data = data;
            this.next = null;
        }

    }

    stack head = null;

    void push(int ele) {
        stack node = new stack(ele);

        if (head == null) {
            head = node;

        } else {
            stack temp = head;
            head = node;
            node.next = temp;
        }

    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            stack temp = head;
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }

    void pop() {

        if (!isEmpty()) {
            head = head.next;

        } else {
            System.out.println("Stack is empty!");
        }

    }

    boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.display();
        System.out.println();
        s.pop();
        s.pop();
        s.display();

    }

}