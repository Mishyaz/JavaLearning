package test1;

import java.util.Arrays;

public class Main5Array2 {
    public static void main(String[] args) {
        int a;
        a = 10;

        int[] stable;
//        stable = {4, 15, 22}; не работает
        stable = new int[100]; // задача размера массива
//        System.out.println(Integer.valueOf(stable[3]));
        stable[3] = 55;
//        for (int number : stable) {
//            System.out.println(number);
//        }
        System.out.println(Arrays.toString(stable));
    }
}
