package L07.LAB01;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {

    public static double totalSalary(List<StandardEmployee> standardEmployeeList, List<Manager> managerList, List<CEO> ceoList){
        double totalSalary;
        double totalSalaryStandardEmp = 0;
        double totalSalaryManager = 0;
        double totalSalaryCEO = 0;

        for (StandardEmployee employee : standardEmployeeList) {
            double monthly = employee.getSalary() + employee.getSupportSalary();
            totalSalaryStandardEmp = totalSalaryStandardEmp + monthly;
            System.out.println(totalSalaryStandardEmp);
        }
        for (Manager manager : managerList) {
            double monthly = manager.getSalary() + manager.getSupportSalary();
            totalSalaryManager = totalSalaryManager + monthly;
            System.out.println(totalSalaryManager);
        }

        for (CEO ceo : ceoList) {
            double monthly = ceo.getSalary() + ceo.getSupportSalary();
            totalSalaryCEO = totalSalaryCEO + monthly;
            System.out.println(totalSalaryCEO);
        }
        return totalSalary = totalSalaryCEO + totalSalaryManager + totalSalaryStandardEmp;
    }


    public static void main(String[] args) {
        List<StandardEmployee> standardEmployeeList = new ArrayList<>();
        StandardEmployee nv01 = new StandardEmployee(15,5);
        StandardEmployee nv02 = new StandardEmployee(15,5);
        StandardEmployee nv03 = new StandardEmployee(15,5);
        StandardEmployee nv04 = new StandardEmployee(15,5);
        StandardEmployee nv05 = new StandardEmployee(15,5);

        standardEmployeeList.add(nv01);
        standardEmployeeList.add(nv02);
        standardEmployeeList.add(nv03);
        standardEmployeeList.add(nv04);
        standardEmployeeList.add(nv05);

        nv03.setSupportSalary(6.0);

        List<Manager> managerList = new ArrayList<>();
        Manager m01 = new Manager(20, 7);
        Manager m02 = new Manager(20, 7);

        managerList.add(m01);
        managerList.add(m02);

        List<CEO> ceoList = new ArrayList<>();
        CEO ceo1 = new CEO(50,0);
        ceoList.add(ceo1);


        double totalSalary = SalaryCalculator.totalSalary(standardEmployeeList, managerList, ceoList);
        System.out.println("Total: " + totalSalary);

    }
}
