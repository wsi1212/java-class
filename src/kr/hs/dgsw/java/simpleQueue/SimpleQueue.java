package kr.hs.dgsw.java.simpleQueue;

import java.util.Scanner;

public class SimpleQueue {
    private int rear = 0;
    private int front = 0;
    private static final int SIZE = 5;
    private String[] array = new String[SIZE];

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % SIZE == front;
    }

    public void enqueue(String value) {
        array[rear] = value;
        rear++;
        rear %= SIZE;
    }

    public void printQueue() {
        for (int i = front; i < rear; i++) {
            System.out.printf("%s ", array[i]);
        }
        System.out.println("");
    }

    public int getSize() {
        return (rear - front + SIZE) % SIZE;
    }

    public void dequeue() {
        array[front] = "";
        front++;
        front %= SIZE;
    }

    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue();
        Scanner scanner = new Scanner(System.in);
        String ward = null;
        String command = null;
        while (true) {
            command = scanner.next();
            if (command == "exit!") {
                queue.printQueue();
                break;
            } else if ("en".equals(command)) {
                if (queue.isFull()) {
                    System.out.println("Queue is Full!!");
                } else {
                    ward = scanner.next();
                    queue.enqueue(ward);
                    queue.printQueue();
                }
            } else if ("de".equals(command)) {
                if (queue.isEmpty()) {
                    System.out.println("Queue if Empty");
                } else {
                    queue.dequeue();
                    queue.printQueue();
                }
            } else if ("size".equals(command)) {
                System.out.println(queue.getSize());
            } else {
                System.out.println("Wrong Command");
            }
        }
        scanner.close();
    }

}
