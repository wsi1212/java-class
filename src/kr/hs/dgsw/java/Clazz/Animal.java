package kr.hs.dgsw.java.Clazz;

public class Animal {

    private String name;

    private static String category;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        System.out.println("Animal 생성자 호출");
    }

    public String getName() {
        return this.name;
    }

    public static void printName() {
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Animal elephant = new Animal("Elephant");
        elephant.category = "초식동물";
        Animal turtle = new Animal("Turtle");
        turtle.category = "해양동물";
        System.out.println(elephant.name + elephant.category);
        System.out.println(turtle.name + turtle.category);
    }
}
