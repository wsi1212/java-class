package kr.hs.dgsw.java.string;

public class StringIndexOf {
    void study(){
        String str1 = "죽는 날까지 하늘을 우러러 한 점 부끄럼 없기를";
        String str2 = "Hello world!";

        shoePosition(str1, "죽는");
        shoePosition(str1, "하늘");
        shoePosition(str2, "world");
        shoePosition(str2, "abc");
        shoePosition(str2, "l");
        shoePosition(str2, "l",3);
        shoePosition(str2, "l",4);
    }

    void shoePosition(String str, String pattern){
        int position = str.indexOf(pattern);
        System.out.printf("\"%s\"문장에서 \"%s\" 은 %d 번쨰 나옵니다.\n",
                str, pattern, position+1);
    }

    void shoePosition(String str, String pattern, int fromIndex){
        int position = str.indexOf(pattern, fromIndex);
        System.out.printf("\"%s\"문장에서 \"%s\" 은 %d 번쨰 나옵니다.\n",
                str, pattern, position+1);
    }

    public static void main(String[] args) {
        StringIndexOf stringIndexOf = new StringIndexOf();
        stringIndexOf.study();
    }
}
