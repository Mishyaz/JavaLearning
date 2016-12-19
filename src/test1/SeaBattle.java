package test1;

import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        char[] cells = new char[10];
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
        int position = 4;
        cells[position] = 'X';

        do {
            System.out.println(cells);
            Scanner scanner = new Scanner(System.in);
            String s;
            s = scanner.nextLine();
            System.out.printf("Вы ввели %s\n", s);

            int shoot = Integer.parseInt(s);

            switch (cells[shoot]) {
                case '.':
                    System.out.println("Промах!");
                    cells[shoot] = '*';
                    break;
                case 'X':
                    System.out.println("Попадание!");
                    cells[shoot] = '_';
                    break;
                case '*':
                    System.out.println("Уже стреряли!");
                    break;
                default:
                    System.out.println("Error");
            }
        } while (cells[position] == 'X');
    }
}