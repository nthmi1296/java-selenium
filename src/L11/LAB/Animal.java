package L11.LAB;

import java.security.SecureRandom;

public abstract class Animal {
    
    protected int speed;
//    protected boolean flyAble;
    
    public abstract void animalSpeed();
    public abstract boolean checkFlyAble();

    public int getSpeed() {
        return speed;
    }
}
