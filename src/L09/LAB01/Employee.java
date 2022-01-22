package L09.LAB01;

import java.util.List;

public class Employee {

    private int empID;
    protected double salary;
    protected double supportSalary;

    public Employee(int empID, double salary, double supportSalary) {
        this.empID = empID;
        this.salary = salary;
        this.supportSalary = supportSalary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSupportSalary() {
        return supportSalary;
    }

    public void setSupportSalary(double supportSalary) {
        this.supportSalary = supportSalary;
    }
}
