package kr.hs.dgsw.java.string;

public class StringEquals {
    void study() {
        String name = "John";
        String name1 = "John";
        String name2 = "Peter";
        String name3 = new String("John");
        String name4 = new String("John");

        showEquvalent(name, name1);
        showEquvalent(name1, name2);
        showEquvalent(name2, name3);
        showEquvalent(name3, name4);
        showEquals(name,name1);
        showEquals(name1,name2);
        showEquals(name2,name3);
        showEquals(name3,name4);
    }
    void showEquvalent(String str1, String str2) {
        boolean result = str1 == str2;
        System.out.printf("%s == %s : %b \n", str1, str2, result);
    }

    void showEquals(String str1, String str2){
        boolean result = str1.equals(str2);
        System.out.printf("%s.equals(%s) : %b\n",str1,str2,result);
    }

    public static void main(String[] args) {
        StringEquals stringEquals = new StringEquals();
        stringEquals.study();

    }
}