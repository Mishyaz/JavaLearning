package test4SeaBattle;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship(4);

        field.init();
        field.setShip(ship);

        System.out.println("Начало игры!");

        do {
            field.show();
            int shoot = player.getshoot();
            field.doShoot(shoot);
        } while (field.isNotGameOwer());
    }
}
