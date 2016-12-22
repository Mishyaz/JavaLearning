package test4SeaBattle;

import java.util.Random;

public class Ship {
    int positionStart;
    int positionEnd;
    int size;

    void initWithRandomPositionAndSize() {
        Random random = new Random();
        size = random.nextInt(3) + 1;
        positionStart = random.nextInt(Field.SIZE - size + 1);
        positionEnd = positionStart + size;
    }

    boolean isIntersectWithAnotherShip(Ship ship) {
        if (positionStart > ship.positionEnd + 1) {
            return false;
        }
        if (positionEnd + 1 < ship.positionStart) {
            return false;
        }
        return true;
    }
}
