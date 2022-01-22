package L09.LAB02;

import java.security.SecureRandom;

public class Dog extends Animal {
//   private int max = 65;

    public Dog(int max) {
        super(max);
    }

    @Override
    public void animalSpeed() {
        speed = new SecureRandom().nextInt(this.max);
    }

}
