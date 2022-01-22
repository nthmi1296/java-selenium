package L09.LAB02;

import java.security.SecureRandom;

public class Animal {

    protected int speed;
    protected int max;

    public Animal(int max) {
        this.speed = 0;
        this.max = max;
    }

    public void animalSpeed(){
        speed = new SecureRandom().nextInt(this.max);
    }

    public int getSpeed() {
        return speed;
    }
}
