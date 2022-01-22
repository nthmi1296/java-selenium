package L11.LAB;

import L11.LAB.Animal;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private int max = 100;

    @Override
    public boolean checkFlyAble() {
        return false;
    }

    @Override
    public void animalSpeed() {
        this.speed = new SecureRandom().nextInt(max);
    }
}
