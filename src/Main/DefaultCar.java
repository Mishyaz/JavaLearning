package Main;

public class DefaultCar extends aCar {

    @Override
    public double getEngineVolume() {
        return 1.7;
    }

    @Override
    public void baseDescription() {
        super.baseDescription();
        System.out.println("Standart car");
    }
}
