package L11;

public abstract class Employee {

    protected abstract double getSalary();
    protected abstract double getSupportSalary();

    public static void main(String[] args) {
        Employee employee = new Employee() {
            @Override
            protected double getSalary() {
                return 100;
            }

            @Override
            protected double getSupportSalary() {
                return 10;
            }
        };
    }
}
