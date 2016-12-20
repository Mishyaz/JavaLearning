package test3.ex3;

public class Horse {
    String name;
    int speed;
    String color;
    boolean isMale;
    int age;

    void eat() {
        about();
        System.out.println("eating...");
    }

    void about() {
        String sex = (isMale) ? "Male" : "Female"; //тернарный оператор
        System.out.printf("Name: %s, age: %d, sex: %s \t", name, age, sex);
    }

    void ride() {
        about();
        System.out.println("Riding at speed: " + speed);
    }
}
