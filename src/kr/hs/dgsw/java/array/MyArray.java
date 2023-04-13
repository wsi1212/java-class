package kr.hs.dgsw.java.array;

import java.util.Random;

public class MyArray {
    int[] array = new int[10];

    void makeArray() {
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < array.length; i++) {
            this.array[i] = random.nextInt(1000);
        }
        printArray();
        System.out.println(findMinIndex());
        System.out.println(sumArray());
        System.out.println(averageArray());
    }

    void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.println("");
    }

    int findMinIndex() {
        int min = array[0];
        int minIndex = 0;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    int sumArray() {
        int sum = 0;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            sum += array[i];
        }
        return sum;
    }

    double averageArray() {
        return sumArray() / (double)array.length;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.makeArray();
    }
}
