package L08_1.LAB;

import java.security.SecureRandom;

public class Dog {

    private int randomSpeed;

    public Dog() {
        this.randomSpeed = new SecureRandom().nextInt(60);
    }

    public int getRandomSpeed() {
        return randomSpeed;
    }
}
