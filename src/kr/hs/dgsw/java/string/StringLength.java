package kr.hs.dgsw.java.string;

public class StringLength {
    public void study(){
        String str1 = "Hello world";
        String str2 = "홍길동";
    }

    void showLength(String str){
        int length = str.length();
        System.out.printf("%s의 길이는 %d 입니다.\n",
                str, length);
    }

    public static void main(String[] args) {
        StringLength stringLength = new StringLength();
        stringLength.showLength("박상현");
    }

}
