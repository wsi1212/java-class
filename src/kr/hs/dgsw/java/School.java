package kr.hs.dgsw.java;

public class School {
    String schoolName = "대소고";
    int countOfStudents = 0;

    void teach() {
        System.out.println("학생들을 가르쳐줄까말까");
    }

    void enroll() {
        countOfStudents++;
    }

    void graduate() {
        if (countOfStudents > 0)
            countOfStudents--;
    }

    void printInformation(){
        System.out.printf("%s에는 %d명이 재학중 일까요?",schoolName,countOfStudents);
    }
}


