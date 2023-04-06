package kr.hs.dgsw.java.problems;

import java.util.Scanner;

public class P5 {

    int shift1(int n){
        int result = 1;
        for(int i = 1; i<= n; i++)
            result *= i;
        return result;
    }
    public static void main(String[] args) {
        P5 p5 = new P5();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(p5.shift1(n));
    }
}
