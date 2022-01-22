package L11.LAB;

import java.security.SecureRandom;

public class Horse extends Animal {
    private int max = 75;

    @Override
    public boolean checkFlyAble() {
        return false;
    }

    @Override
    public void animalSpeed() {
        speed = new SecureRandom().nextInt(this.max);
    }
}
