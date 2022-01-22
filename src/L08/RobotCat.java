package L08;

public class RobotCat {

    private String name;
    private String year;

    public RobotCat() {
    }

    public RobotCat(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    // Service method
    public void run(){
        System.out.println("Running");
        doSthInside();
    }

    // Support method
    private void doSthInside(){

    }
}
