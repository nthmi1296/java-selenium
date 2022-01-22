package L09.LAB02;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(70);
        Horse horse = new Horse(65);
        Tiger tiger = new Tiger(100);

//        Random speed each animal

        dog.animalSpeed();
        horse.animalSpeed();
        tiger.animalSpeed();


        int max = horse.getSpeed();
        String winner = horse.getClass().getSimpleName();
        if (max < tiger.getSpeed()) {
            max = tiger.getSpeed();
            winner = tiger.getClass().getSimpleName();
        }
        if (max < dog.getSpeed()) {
            max = dog.getSpeed();
            winner = dog.getClass().getSimpleName();
        }

        System.out.println("Horse with random speed: " + horse.getSpeed());
        System.out.println("Tiger with random speed: " + tiger.getSpeed());
        System.out.println("Dog   with random speed: " + dog.getSpeed());
        System.out.println("-------------------------------------");
        System.out.println("The winner is " + winner + " with speed: " + max);
    }
}
