package ru.itis;
public class Main {
    public static void main(String[] args) {
        Stack a = new Stack();
        a.push('a');
        a.push('b');
        a.push('c');
        a.push('d');
        a.push('e');
        a.printStack();
        System.out.println();
        a.pop();
        a.printStack();
    }
}