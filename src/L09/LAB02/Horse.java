package L09.LAB02;

import java.security.SecureRandom;

public class Horse extends Animal {
//    private int max = 70;
    public Horse(int max) {
        super(max);
    }

    @Override
    public void animalSpeed() {
        speed = new SecureRandom().nextInt(this.max);
    }
}
