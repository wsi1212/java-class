package kr.hs.dgsw.java.dataType4;

public class DataTypeStudy {

    void studyInteger(){
        byte byteValue = 1;
        short shortValue = 1;
        int intValue = 1;
        long lingValue = 1;
    }

    void studyChar(){
        char first = '가';
        char last = '힣';
        int count = last - first + 1;
        char charValue = 'A';
        for (int i = '가';i<='힣';i++){
            System.out.printf("%c : %d\n", i, i);
        }
        System.out.printf("한글 총 개수 %d\n",count);
    }

    public static void main(String[] args) {
        DataTypeStudy dataTypeStudy = new DataTypeStudy();
        dataTypeStudy.studyChar();
    }

}
