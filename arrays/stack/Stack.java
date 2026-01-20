package arrays.stack;

public class Stack {
    int[] stack;
    int top ;
    int size;
    public Stack(int size) {
        stack = new int[size];
        this.size = size;
        top = -1;
    }

    public void push(int num){
        if(top == size-1){
            System.out.println("Stack Overflow" );
            return;
        }
        stack[++top] = num;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size - 1;
    }
    public static void main(String[] args) {
    Stack stack = new Stack(5);
    System.out.println(stack.isEmpty());
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.println(stack.isFull());
    stack.push(6);
    System.out.println(stack.pop());
    }
}
