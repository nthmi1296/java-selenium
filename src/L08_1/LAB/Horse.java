package L08_1.LAB;

import java.security.SecureRandom;

public class Horse {
    private int randomSpeed;

    public Horse() {
        this.randomSpeed = new SecureRandom().nextInt(75);
    }

    public int getRandomSpeed() {
        return randomSpeed;
    }
}
