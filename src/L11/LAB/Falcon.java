package L11.LAB;

import java.security.SecureRandom;

public class Falcon extends Animal{

    private int max = 40;

    public Falcon() {
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
