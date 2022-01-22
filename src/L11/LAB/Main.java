package L11.LAB;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();

        Dog dog = new Dog();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        Falcon falcon = new Falcon();
        Eagle eagle = new Eagle();


        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(falcon);
        animalList.add(eagle);

        // For loop to random speed:

        for (Animal animal : animalList) {
            animal.animalSpeed();
        }

//        dog.animalSpeed();
//        horse.animalSpeed();
//        tiger.animalSpeed();
//        falcon.animalSpeed();
//        eagle.animalSpeed();

//        Check: flyAble

        List<Animal> acceptedList = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.checkFlyAble()) {
                acceptedList.add(animal);
            }
        }
        animalList = acceptedList;
//        System.out.println(acceptedList);

        int max = 0;
        String winner = "";
        for (Animal animal : animalList) {

            if (max < animal.getSpeed()) {
                // Assign max with animal speed when max found
                // then assign winner
                max = animal.getSpeed();
                winner =  animal.getClass().getSimpleName();
            }
        }

        for (Animal animal : animalList) {
            System.out.println("The " + animal.getClass().getSimpleName() + " with the speed: " + animal.getSpeed());

        }
        System.out.println("-------------------------------------");
        System.out.println("The winner is " + winner + " with speed: " + max);

//        int max = horse.getSpeed();
//        String winner = horse.getClass().getSimpleName();
//        if (max < tiger.getSpeed()) {
//            max = tiger.getSpeed();
//            winner = tiger.getClass().getSimpleName();
//        }
//        if (max < dog.getSpeed()) {
//            max = dog.getSpeed();
//            winner = dog.getClass().getSimpleName();
//        }
//
//        System.out.println("Horse  with random speed: " + horse.getSpeed());
//        System.out.println("Tiger  with random speed: " + tiger.getSpeed());
//        System.out.println("Dog    with random speed: " + dog.getSpeed());
//        System.out.println("Falcon with random speed: " + falcon.getSpeed());
//        System.out.println("Eagle  with random speed: " + eagle.getSpeed());
//        System.out.println("-------------------------------------");
//        System.out.println("The winner is " + winner + " with speed: " + max);
    }
}
