package L12;

public interface Slugs {
    String lesson1 = "/lesson_1";
    String lesson2 = "/lesson_2";

    default void doSth(){
        System.out.println(".....");
    }

    static void doAnotherThing(){
        System.out.println("...............");
    }
}
