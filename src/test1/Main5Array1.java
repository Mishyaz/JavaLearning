package test1;

import java.util.Arrays;

public class Main5Array1 {
    public static void main(String[] args) {
        int a = 10;
        int[] numbers = {10, 4, 7, 15};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[1]);
//        numbers[3] = "string";
        numbers[3] = 12;
        System.out.println(numbers[3]);
        System.out.println(Arrays.toString(numbers));

        //itar + tab
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //iter + tab
        //foreach
        for (int number : numbers) {
            System.out.println(number);
        }
        for (String s : args) {
            System.out.println(s);
        }

    }
}

