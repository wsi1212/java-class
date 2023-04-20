package kr.hs.dgsw.java.inhehert;

import java.lang.reflect.Member;

public class Mammal extends Animal{

    public void feed() {
        System.out.println("젖을 먹인다.");
    }

    public void birth() {
        System.out.println("태생으로 자식을 낳는다.");
    }
    @Override
    public void move() {
        super.move();
        System.out.println("빠르게 움직인다");
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.feed();
        mammal.birth();
        mammal.move();

        Animal lion = new Mammal();
        lion.move();//Animal의 move가 호출된다.
//        lion.feed(); Animal 타입이 feed를 가지지 않으므로 lion이 Mammal 이어도 안됨
//        Mammal dog = new Animal(); 안됨
    }
}
