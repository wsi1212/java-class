package kr.hs.dgsw.java.array;

public class Arraystudy {

    void study() {
        int[] intArray = new int[5];
        int intArray2[] = new int[5];

        double doubleArray[] = new double[5];
        String[] stringArray = new String[10];
        boolean[] booleanArray = new boolean[10];
        intArray[0] = 1;
        stringArray[0] = "Hello";
        System.out.println(booleanArray[0]);
    }

    void studyInit() {
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        System.out.println(intArray[0] + intArray[1]);
    }

    void colorArray() {
        String[] colorArray = new String[]{
                "빨강", "초록", "파랑", "노랑", "핑크"
        };

        for (int i = 0; i < colorArray.length; i++) {
            System.out.println(colorArray[i]);
        }

        for (String color : colorArray) {
            System.out.println(color);
        }


    }

    public static void main(String[] args) {
        Arraystudy arraystudy = new Arraystudy();
        arraystudy.study();
        arraystudy.studyInit();
        arraystudy.colorArray();
    }

}
