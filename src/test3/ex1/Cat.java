package test3.ex1;

public class Cat {
    //Характеристики (состояние), свойства, поля
    int age;
    String name;
    double weight;
    boolean isMale;
    //Alt+Enter - попросить ИДЕЮ предложить варианты исправления ошибки
    Tail tail; //композиция
    Talisman talisman; //агрегация

    //Методы (поведение)
    void voice() {
        System.out.println("Мяу!");
    }

    void sleep() {
        System.out.println("Хррр!");
    }

    void about() {
        String s =  "Cat{" +
                "age=" + age +
                ", name = " + name +
                ", weight = " + weight +
                ", isMale = " + isMale +
                ", tail = " + tail +
                ", talisman = " + talisman +
                '}';
        System.out.println(s);
    }
//конструкторы
//    Cat() {
//        System.out.printf("Вызвали пустой конструктор");
//    }

    Cat() {
    }

    public Cat(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }
}
