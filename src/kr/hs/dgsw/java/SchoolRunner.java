package kr.hs.dgsw.java;

public class SchoolRunner {
    public static void main(String[] args) {
        School school = new School();
        school.enroll();
        school.enroll();
        school.enroll();
        school.graduate();
        school.printInformation();
        school.schoolName="농마고";
    }
}
