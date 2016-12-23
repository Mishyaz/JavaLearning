package test5_overflow;

public class Main {
    private static int i;

    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("Testing..." + i++);
        test();
    }
}
