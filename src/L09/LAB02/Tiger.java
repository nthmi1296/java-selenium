package L09.LAB02;

import java.security.SecureRandom;

public class Tiger extends Animal {
//    private int max = 100;

    public Tiger(int max) {
        super(max);
    }

    @Override
    public void animalSpeed() {
//        speed = new SecureRandom().nextInt(this.max);
        super.animalSpeed();
    }
}
