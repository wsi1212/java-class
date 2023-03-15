package kr.hs.dgsw.java;

public class Person {
    String name="박상현";
    int age=0;
    double height=0.0;

    void aged(){
        age++;
        height+=6;
    }

    void printBSH(){
        System.out.printf("%s님의 나이는 %d 살이고 키는 %.0fcm 입니다\n",name,age,height);
        if (height<100)
            System.out.println("키가 작으시네요 ㅋ");

    }

}
