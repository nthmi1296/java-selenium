package L12_1;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Mute();
    }


    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck decoyDuck = new DecoyDuck();

        mallardDuck.performFly();
        mallardDuck.performQuack();

        decoyDuck.performFly();
        decoyDuck.performQuack();

    }
}
