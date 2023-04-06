package kr.hs.dgsw.java.problems;

import java.util.*;

public class P4 {

    ArrayList<Integer> measures(int n){
        ArrayList<Integer> measure = new ArrayList<>();
        for (int i = 1; i <= n/2; i++){
            if (n % i == 0){
                measure.add(i);
            }
        }
        return measure;
    }
    public static void main(String[] args) {
        P4 p4 = new P4();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int result = 1;
        HashSet<Integer> n_measures_set = new HashSet<>(p4.measures(n));
        HashSet<Integer> m_measures_set = new HashSet<>(p4.measures(m));
        HashSet<Integer> intersection = new HashSet<>(n_measures_set);
        intersection.retainAll(m_measures_set);// 교집합 수행
        List<Integer> common_measures = new ArrayList<>(intersection);
        for (int i = 0; i <= common_measures.size()-1; i++){
            result *= common_measures.get(i);
        }
        System.out.println(n * m / result);
        scanner.close();
    }

}
