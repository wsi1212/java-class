package kr.hs.dgsw.java.inhehert;

public class Adder {
    protected int op1;
    protected int op2;

    public int calculate() {
        return op1 + op2;
    }

    public void  setOp1(int op1) {
        this.op1 = op1;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }
}
