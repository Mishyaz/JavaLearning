package test1;

public class Main4_1Inc {
    public static void main(String[] args) {
        int i;
        i = 0;
        int a2 = ++i + i++;

        i = 0;
        int a;
        i = i + 1;
        a = i;
        a = a + i;
        i = i = 1;
        System.out.println(a2);
        System.out.println(a);

        a = 0;
        i = 0;
        int a3 = i++ + ++i;

        i = 0;
        i = i + 1;
        i = i + 1;
        a = a + i;
        System.out.println(a3);
        System.out.println(a);
    }
}
