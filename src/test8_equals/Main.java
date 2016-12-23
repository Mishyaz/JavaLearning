package test8_equals;

public class Main {
    public static void main(String[] args) {
        String string1 = "hello";
//        String string2 = "hello";
        String string2 = new String("hello");

        if (string1 == string2) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        if (string1.equals(string2)) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
    }
}
