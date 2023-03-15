package kr.hs.dgsw.java;

public class Adder {
    int add(int operand1, int operand2){
        int sum=operand1+operand2;
        return sum;
    }

    int newadd(int... operand){
        int sum=0;
        for(int val : operand)
            sum+=val;
        return sum;
    }

    public static void main(String[] args){
        Adder adder = new Adder();
        int result = adder.add(3,21234663);
        System.out.println(result);
        System.out.println(adder.newadd(3,3,3,3,3,3,3,3));
    }
}
