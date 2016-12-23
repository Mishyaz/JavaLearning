package test7_static;

public class Cat {
    String name;
    int age = 10;
    static int catsAmount;

    static {//статический блок инициализации
//        age = 20; нельзя
        catsAmount = 20;
    }

    {//блок инициализации
        age = 20;
        catsAmount = 20;
    }

    public Cat(String name) {
        this.name = name;
        catsAmount++;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void about() {
        System.out.println(name);
        System.out.println(age);
    }

    void showCatsAmount() {
        System.out.println(catsAmount);
    }

    static void staticShowCatsAmount() {
        System.out.println(catsAmount);
//        about(); нельзя
    }
}
