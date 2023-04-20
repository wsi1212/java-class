package kr.hs.dgsw.java.inhehert;

public class Parent {
    private int value1;

    protected int value2;

    public int value3;

    public int add() {
        return value1 + value2 + value3;
    }

    public void setValue1(int value1){
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }
}
