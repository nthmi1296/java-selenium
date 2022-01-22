package L11.LAB;

import java.security.SecureRandom;

public class Dog extends Animal {
    private int max = 65;

    public Dog() {
    }

    @Override
    public boolean checkFlyAble() {
        return false;
    }

    @Override
    public void animalSpeed() {
        speed = new SecureRandom().nextInt(this.max);
    }

}
