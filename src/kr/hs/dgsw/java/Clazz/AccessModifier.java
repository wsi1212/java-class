package kr.hs.dgsw.java.Clazz;

public class AccessModifier {
    int value1;
    private int value2;
    protected int value3;
    public int value4;

    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();
        object.value1 = 1;
        object.value2 = 2;
        object.value3 = 3;
        object.value4 = 4;
    }

}
