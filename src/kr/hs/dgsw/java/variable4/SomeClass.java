package kr.hs.dgsw.java.variable4;

public class SomeClass {

    String name;

    int count;

    final int value = 5;

    void someMethod1() {
        int age = 18;
        name = "홍길동";
    }

    void someMethod2() {
        this.name = "asdf";
        String name = "도현욱";
        System.out.println(this.name);
        System.out.println(name);
    }

    void doSomething(){
        int value = 5;
        value = 7;

        final int value1;
        value1 = 10;
        //value1 = 11; ERROR
    }

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.someMethod1();
        someClass.someMethod2();
    }

}
