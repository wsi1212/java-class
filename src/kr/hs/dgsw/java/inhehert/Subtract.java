package kr.hs.dgsw.java.inhehert;

public class Subtract extends Adder{
    @Override
    public int calculate() {
        return op1 - op2;
    }

    public static void main(String[] args) {
        Adder adder = new Subtract();
        adder.setOp1(7);
        adder.setOp2(4);

        System.out.println(adder.calculate());
    }
}
