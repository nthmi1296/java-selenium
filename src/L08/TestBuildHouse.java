package L08;

public class TestBuildHouse {

    public static void main(String[] args) {

        House.Builder builder = new House.Builder();
        builder.withMainDoorNumbers(3);
        builder.withColor("blue");
        builder.topRoofColor("yellow");

        // Immutable object
        House house = builder.build();
        System.out.println(house.getMainDoorNumbers());
        System.out.println(house.getColor());
        System.out.println(house.getTopRoofColor());
    }
}
