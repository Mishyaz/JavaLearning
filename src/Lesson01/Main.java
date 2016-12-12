package Lesson01;

public class Main {
    public static void main(String[] args) {
        System.out.format("Hello %s!\n", args[0]);
        iCar raceCar = new RaceCar();
        iCar defaultCar = new DefaultCar();
        raceCar.baseDescription();
        defaultCar.baseDescription();
        defaultCar.getEngineVolume();
    }
}
