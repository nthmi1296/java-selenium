package L07.LAB;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {

    public static double totalSalary(List<StandardEmp> standardEmpList) {
        // loop over the list -> add: salary and sp salary

        double totalSalary = 0;
        for (StandardEmp emp : standardEmpList) {
            double monthlyEmpSalary = emp.getSalary() + emp.getSupportSalary();
            totalSalary = totalSalary + monthlyEmpSalary;
        }

        return totalSalary;
    }

    public static void main(String[] args) {
        List<StandardEmp> standardEmpList = new ArrayList<>();
        StandardEmp nv01 = new StandardEmp(15.5, 1.8);
        StandardEmp nv02 = new StandardEmp(15.5, 1.8);

        standardEmpList.add(nv01);
        standardEmpList.add(nv02);

        nv02.setSupportSalary(2.0);
        double totalSalary = SalaryCalculator.totalSalary(standardEmpList);
        System.out.println(totalSalary);
    }
}
