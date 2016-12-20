package test4SeaBattle;

public class Field {
    final int SIZE = 10;
    char[] cells = new char[SIZE];
    Ship ship;

    void init() {
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
    }

    void setShip(Ship ship) {
        this.ship = ship;
        cells[ship.position] = 'X';
    }

    void doShoot(int shoot) {
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
    }

    void show() {
        System.out.println(cells);
    }

    boolean isNotGameOwer() {
        return cells[ship.position] == 'X';
    }
}
