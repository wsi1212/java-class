package kr.hs.dgsw.java.Clazz;

public class Multiplier {

    private int operand1;
    private int operand2;

    public void setOperand1(int operand) {
        this.operand1 = operand;
    }

    public void setOperand2(int operand) {
        this.operand2 = operand;
    }

    public void showResult() {
        //표준 출력 장치로도 3 * 4 = 12 라고 출력한다
        int result = 0;
        for (int i = 0; i < operand2; i++){
            result += operand1;
        }
        System.out.println(operand1 + " * " + operand2 + " = " + result);
    }

    public static void main(String[] args) {
        Multiplier multiplier = new Multiplier();
        multiplier.setOperand1(3);
        multiplier.setOperand2(5);
        multiplier.showResult();
    }

}
