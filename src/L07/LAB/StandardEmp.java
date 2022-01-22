package L07.LAB;

public class StandardEmp {

    private double salary;
    private double supportSalary;

    public StandardEmp(double salary, double supportSalary) {
        this.salary = salary;
        this.supportSalary = supportSalary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSupportSalary(double supportSalary) {
        this.supportSalary = supportSalary;
    }

    public double getSalary() {
        return salary;
    }

    public double getSupportSalary() {
        return supportSalary;
    }
}
