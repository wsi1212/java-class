package kr.hs.dgsw.java.inhehert;

public class Animal {
    protected String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(){
        System.out.println("움직인다");
    }

    public void die(){
        System.out.println("죽는다");
    }
}
