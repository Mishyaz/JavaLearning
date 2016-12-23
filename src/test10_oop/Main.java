package test10_oop;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.age = 10;
//        animal.about();

        Cat cat = new Cat();
        cat.name = "Myrka";
        cat.home = "Home";
//        cat.about();

        Dog dog = new Dog();
        dog.name = "Dogy";
        dog.age = 5;
//        dog.about();

        Animal[] animals = new Animal[4];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = new Crocodile();
        animals[3] = new Lion();

        for (Animal an : animals) {
            an.about();
        }
    }

}
