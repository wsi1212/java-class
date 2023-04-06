package kr.hs.dgsw.java.problems;

import java.util.Scanner;

public class P3 {

    boolean isPerfectNumber(int n){
        int sum = 0;
        for (int i = 1; i<= n/2; i++){
            if (n %i == 0){
                sum += i;
            }
        }
        if (sum == n)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P3 p3 = new P3();
        int n = scanner.nextInt();
        System.out.printf(p3.isPerfectNumber(n) ? "%d는 완전수가 맞습니다" : "%d는 완전수가 아닙니다", n);
        scanner.close();
    }

}
