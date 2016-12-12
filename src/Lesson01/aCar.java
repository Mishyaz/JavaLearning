package Lesson01;

public abstract class aCar implements iCar {
    private int speed = 100;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed + 12;
    }

    public void baseDescription() {
        out(this.getClass().getSimpleName() + " - (Speed: " + speed + " and EngineVolume: " + getEngineVolume() + ")");
    }

    private void out(String str) {
        System.out.println(str);
    }
}
