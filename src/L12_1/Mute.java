package L12_1;

public class Mute implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I'm mute..!!");
    }
}
