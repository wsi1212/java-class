package kr.hs.dgsw.java.inhehert;

public class Bird extends Animal{
    public void feed() {
        System.out.println("우유 말고 다 먹인다.");
    }

    public void birth() {
        System.out.println("알을 낳는다.");
    }

    public void fly() {
        System.out.println("하늘을 난다.");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.feed();
        bird.birth();
        bird.fly();
    }
}
