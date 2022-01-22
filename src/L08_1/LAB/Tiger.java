package L08_1.LAB;

import java.security.SecureRandom;

public class Tiger {

    private int randomSpeed;

    public Tiger() {
        this.randomSpeed = new SecureRandom().nextInt(100);
    }

    public int getRandomSpeed() {
        return randomSpeed;
    }
}
