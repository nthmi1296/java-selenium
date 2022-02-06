package L12;

import java.util.List;

public class SalaryCalculator {

    public static double getTotalSalary(List<IEmployee> employeeList){

        double totalSalary = 0;

        for (IEmployee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary() + employee.getSupportSalary();
        }
        return totalSalary;
    }
}
