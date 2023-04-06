package kr.hs.dgsw.java.problems;

import java.util.Scanner;

public class P2 {

    void printMultiply(int n) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        P2 p2 = new P2();
        p2.printMultiply(n);
        scanner.close();
    }

}
