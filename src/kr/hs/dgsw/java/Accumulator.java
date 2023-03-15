package kr.hs.dgsw.java;

public class Accumulator {
    int sum=0;
    int add(int value){
        sum+=value;
        return sum;
    }

    int getSum(){
        return sum;
    }

    int minusUsedAdd(int op1){
        return add(-op1);
    }

    int resetSum(){
        return 0;
    }

    public static void main(String[] args){
        Accumulator acc = new Accumulator();
        acc.add(5);
        acc.add(10);

        int sum1 = acc.getSum();
        System.out.println(sum1);
        sum1= acc.minusUsedAdd(5);
        System.out.println(sum1);
    }

}
