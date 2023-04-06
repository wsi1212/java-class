package kr.hs.dgsw.java.operation;

public class OperationStudy {

    String toBinary(int value){
        var result = "";

        while (value > 0){
           result = (value %2) + result;
           //
           value /= 2;

        }
        return result;
    }

    void studyNot(){
        int value = 1;
        int value2 = ~value;
        System.out.println(value2);
        System.out.println(toBinary(value));
    }

    void studyArithmetic(){
        int op1 = 5;
        int op2 = 3;
        int op3 =5;
        int plus = op1 + op2;
        int minus = op1 - op2;
        int multiply = op1 * op2;
        int divide = op1 / op2;
        int modulus = op1 % op2;
        
    }

    void studyLogical(){
        boolean op1 = true;
        boolean op2 = false;
        boolean result;
        result = op1 && op2 || op1;// && 는 || 보다 우선순위가 높다
        result = op1 || op2;
    }
    public static void main(String[] args) {
        OperationStudy operationStudy = new OperationStudy();
        operationStudy.studyArithmetic();
        operationStudy.studyNot();
        System.out.println(operationStudy.toBinary(8));
    }
}
