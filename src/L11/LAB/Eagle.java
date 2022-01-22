package L11.LAB;

import java.security.SecureRandom;

public class Eagle extends Animal{

    private int max = 60;

    public Eagle() {
    }

    @Override
    public boolean checkFlyAble() {
        return true;
    }

    @Override
    public void animalSpeed() {
        this.speed = new SecureRandom().nextInt(max);
    }
}
