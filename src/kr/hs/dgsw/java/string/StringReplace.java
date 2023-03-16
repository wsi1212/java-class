package kr.hs.dgsw.java.string;

public class StringReplace {
    public void study(){
        String str1 = "0123446789";
        String str2 = StringReplace(str1, "4", "5");
        System.out.println(str1);
        System.out.println(str2);
    }

    String StringReplace(String str1, String target, String changed){
        return str1.replace(target,changed);
    }

    public static void main(String[] args) {
        StringReplace stringReplace = new StringReplace();
        stringReplace.study();
    }

}
