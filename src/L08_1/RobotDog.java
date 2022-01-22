package L08_1;

import java.util.ArrayList;
import java.util.List;

public class RobotDog {

    private int dogId;
    private static int defaultDogId = 0;

    public RobotDog() {
        dogId = defaultDogId++;
    }

    public int getDogId() {
        return dogId;
    }

    @Override
    public String toString() {
        return "RobotDog{" +
                "dogId=" + dogId +
                '}';
    }

    private static void changeDefaultDogId(){
        defaultDogId++;
    }

    public static void main(String[] args) {
        List<RobotDog> robotDogList = new ArrayList<>();

        for (int dogId = 1; dogId < 11; dogId++) {
            robotDogList.add(new RobotDog());
            RobotDog.changeDefaultDogId();
        }

        System.out.println(robotDogList);
    }
}
