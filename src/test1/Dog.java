package test1;

public class Dog {
    public static void main(String[] args) {
        String s;
        s = aport(" косточка", 20);
        System.out.println(s);
    }
    static String aport(String it, int amount) {
        String result = "Пожеванная" + it + ", количество " + amount;
        return result;
    }
}
