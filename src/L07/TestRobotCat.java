package L07;

public class TestRobotCat {

    public static void main(String[] args) {
        RobotCat robotCat1 = new RobotCat("Lucky", "1997");
        System.out.println(robotCat1.getName());
        robotCat1.setName("Min");
        System.out.println(robotCat1.getName());
    }
}
