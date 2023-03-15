package kr.hs.dgsw.java;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person();
        for (int i = 1; i <= 10; i++)
            person.aged();
        person.printBSH();
    }
}
