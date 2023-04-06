package kr.hs.dgsw.java.problems;

import kr.hs.dgsw.java.Scanner.ScannerStudy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 1. 금액을 입력해서, 현재 대한민국에서 통용되는 화폐의 개수로 나누어 출력하는 프로그램을 완성하세요. 화폐의 개수를 최소한으로 사용할 수 있는 경우의 수입니다.
    예를 들어 124,820원이 입력된다면 "오만원권 2장, 일만원권 2장, 일천원권 4장, 오백원권 1장, 일백원권 3장, 일십원권 2장" 으로 출력이 되어야 합니다.
*/
public class P1 {

    void printMoney(int money) {
        int cnt = 0;
        List<String> result = new ArrayList<>();
        List<Integer> result_cnt = new ArrayList<>();
        int[] money_arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        String[] money_name = {"오만원권", "일만원권", "오천원권", "천원권", "오백원권", "일백원권", "오십원권", "일십원권", "오원권", "일월권"};
        int len = money_arr.length;
        for (int i =0; i < len; i++){
            cnt = money / money_arr[i];
            money %= money_arr[i];
            if (cnt != 0) {
                result.add(money_name[i]);
                result_cnt.add(cnt);
            }
        }

        len = result.size();
        for (int i = 0; i < len; i++) {
            if (i != len - 1) {
                System.out.print(result.get(i) + " ");
                System.out.print(result_cnt.get(i) + "장, ");
            } else {
                System.out.print(result.get(i) + " ");
                System.out.print(result_cnt.get(i) + "장");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.substring(0, str.length() - 1);
        int money = Integer.parseInt(str);
        P1 p1 = new P1();
        p1.printMoney(money);
        scanner.close();
    }
    /*
    ex input 1) 124820원
    오만원권 2장, 일만원권 2장, 일천원권 4장, 오백원권 1장, 일백원권 3장, 일십원권 2장

    ex input 2) 2147483647원
    오만원권 42949장, 일만원권 3장, 일천원권 3장, 오백원권 1장, 일백원권 1장, 일십원권 4장, 오원권 1장, 일원권 2장
    */
}
