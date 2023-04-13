package kr.hs.dgsw.java.simpleStack;

import java.util.Scanner;

public class SimpleStack {
    private static final int SIZE = 10;
    private String[] array = new String[SIZE];
    private int top = 0;

    public void push(String value) {
        array[top] = value;
        top++;
    }

    public String pop() {
        top--;
        return array[top];
    }

    public void printStack() {
        if(isEmpty()){
            System.out.println("스택이 비어있습니다.");
        }else {
            for (int i = 0; i < top; i++) {
                System.out.printf("%s ", array[i]);
            }
            System.out.println("");
        }
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public boolean isFull() {
        return top >= SIZE;
    }

    public int getSize() {
        return top;
    }

    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();
        Scanner scanner = new Scanner(System.in);
        String word = null;
        String command = null;
        while (true) {
            command = scanner.next();
            if (command.equals("push")) {
                if (stack.isFull()) {
                    System.out.println("스택이 가득 찼습니다.");
                    continue;
                }
                word = scanner.next();
                stack.push(word);
                stack.printStack();
            } else if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println("스택이 비어있습니다.");
                    continue;
                }
                stack.pop();
                stack.printStack();
            } else if (command.equals("size")) {
                System.out.println(stack.getSize());
            } else if (command.equals("exit")) {
                break;
            } else {
                System.out.println("잘못된 명령어입니다.");
            }
        }
        scanner.close();
    }

}
