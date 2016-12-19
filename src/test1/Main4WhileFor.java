package test1;

public class Main4WhileFor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 3) {
            System.out.println(i);
//            i = i + 1;
//            i += 1;
            i++;
        }

        // fori
        for (int j = 0; j < 3; j++) {
            System.out.println(j);
        }
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 3);
    }
}
