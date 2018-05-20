package curs_20may;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack();
        System.out.println(myStack.isEmpty());
        myStack.push(4);
        System.out.println(myStack.pop());
        myStack.push(3);
        myStack.push(2);
        myStack.push(6);
        myStack.push(6);
        myStack.push(6);
        myStack.push(6);
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
    }
}
