package test8_equals;

public class MainCat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom");
        Cat cat2 = new Cat("Tom");

        if (cat1 == cat2) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        if (cat1.equals(cat2)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
