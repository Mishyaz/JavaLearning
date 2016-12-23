package test6_arrayList;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        ArrayList<Ship> list = new ArrayList<Ship>();
//        list.add(123);
//        list.add(12);
//        list.add("hello");
//        list.add(1234);
//        list.add("hello");
        list.add(new Ship());

//        list.remove("hello");

        System.out.println(list);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
