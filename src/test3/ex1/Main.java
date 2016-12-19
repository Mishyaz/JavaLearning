package test3.ex1;

public class Main {
    public static void main(String[] args) {
        Cat cat1;
        cat1 = new Cat();

        cat1.age = 3;
        cat1.name = "Мурка";

        cat1.about();

        Cat cat2 = new Cat();
        cat2.name = "Tom";
        cat2.age = 5;
        cat2.isMale = true;
        cat2.about();

    }
}
