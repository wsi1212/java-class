package kr.hs.dgsw.java.inhehert;

public class Whale extends Mammal{
    public void move() {
        System.out.println("헤염친다.");
    }

    public void spout() {
        System.out.println("물을 뿜는다.");
    }
    public static void main(String[] args) {
        Whale whale = new Whale();//whale 안 메서드 까지 사용 가능
        whale.die();

        Mammal whale2 = new Whale();// Whale 안 메서드 사용 불가
        whale2.move();

        Whale dolphin = (Whale)whale2;
        dolphin.spout();
    }
}
