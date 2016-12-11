package Main;

public class RaceCar extends aCar {
    public RaceCar() {
        setSpeed(300);
    }

    @Override
    public double getEngineVolume() {
        return 3.5;
    }
}
