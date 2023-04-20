package kr.hs.dgsw.java.inhehert;

public class Cat extends Mammal{
    public void cry(){
        System.out.println("야옹");
    }

    public void move(){
        System.out.println("민첩하게 움직인다");
    }
    public static void main(String[] args) {
        Mammal cat = new Cat();
//        cat.cry();
        cat.move();
    }
}
