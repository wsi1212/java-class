package kr.hs.dgsw.java.condition;

public class ConditionStudy {
    void studyIf(){
        boolean flag1 = true;
        boolean flag2 = false;
        if (flag1){
            System.out.println("flag1 is true");
        }else if (flag2){
            System.out.println("flag2 is true");
        } else {
            System.out.println("False");
        }
    }

    void grade(){
        int value = 100;
        if (value >= 100){
            System.out.println("수");
        }else if (value >= 90){
            System.out.println("우");
        }else if (value >= 80) {
            System.out.println("미");
        }else if (value >= 70){
            System.out.println("양");
        }else if (value >= 60) {
            System.out.println("가");
        }else {
            System.out.println("낙제");
        }
    }

    void studyFor(){
        int sum = 0;
        for (int i = 1; i <= 100; i+=2){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ConditionStudy conditionStudy = new ConditionStudy();
        conditionStudy.studyIf();
        conditionStudy.studyFor();
        conditionStudy.grade();
    }
}
