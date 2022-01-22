package L08;

// Builder Design Pattern
public class House {

    private int mainDoorNumbers = 1;
    private String color = "white";
    private String topRoofColor = "red";

    // Read Only
    private House(Builder builder) {
        mainDoorNumbers = builder.mainDoorNumbers;;
        color = builder.color;
        topRoofColor = builder.topRoofColor;;
    }

    public int getMainDoorNumbers() {
        return mainDoorNumbers;
    }

    public String getColor() {
        return color;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }


    // Write Only | Inner Class
    public static class Builder{
        private int mainDoorNumbers;
        private String color;
        private String topRoofColor;

        public Builder() {
        }

        public void withMainDoorNumbers(int mainDoorNumbers) {
            this.mainDoorNumbers = mainDoorNumbers;
        }

        public void withColor(String color) {
            this.color = color;
        }

        public void topRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
        }

        public House build(){
            return new House(this);
        }
    }
}
