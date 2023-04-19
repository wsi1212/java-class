package kr.hs.dgsw.java.Clazz;

public class StaticBug {
    static int age;
    static String name;


    public static void main(String[] args) {
        age = 0;
        name = "홍길동";
    }
}
