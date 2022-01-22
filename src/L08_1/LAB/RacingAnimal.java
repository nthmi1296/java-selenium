package L08_1.LAB;

public class RacingAnimal {

    public static void main(String[] args) {

        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        int max = horse.getRandomSpeed();
        String winner = horse.getClass().getSimpleName();
        if (max < tiger.getRandomSpeed()) {
            max = tiger.getRandomSpeed();
            winner = tiger.getClass().getSimpleName();
        }
        if (max < dog.getRandomSpeed()) {
            max = dog.getRandomSpeed();
            winner = dog.getClass().getSimpleName();
        }

        System.out.println("Horse with random speed: " + horse.getRandomSpeed());
        System.out.println("Tiger with random speed: " + tiger.getRandomSpeed());
        System.out.println("Dog   with random speed: " + dog.getRandomSpeed());
        System.out.println("-------------------------------------");
        System.out.println("The winner is " + winner + " with speed: " + max);
    }
}
