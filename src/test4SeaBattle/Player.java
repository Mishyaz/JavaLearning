package test4SeaBattle;

import java.util.Scanner;

public class Player {
    int getshoot() {
        System.out.println("Куда стрелять?");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.printf("Вы ввели %s\n", s);
        int shoot = Integer.parseInt(s);
        return shoot;
    }
}
