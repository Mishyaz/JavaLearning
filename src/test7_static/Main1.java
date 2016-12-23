package test7_static;

public class Main1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tommy");
        Cat cat2 = new Cat("Tom", 2);
//        System.out.println(cat1.catsAmount); не корректно
        System.out.println(Cat.catsAmount);
        cat1.showCatsAmount();
        cat1.about();
        cat2.about();
    }
}
