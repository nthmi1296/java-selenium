package L09.LAB01;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {

    public static double totalSalary(List<Employee> employeeList, List<Manager> managerList, List<CEO> ceoList){
        double totalSalary = 0;
        double totalSalaryEmp = 0;
        double totalSalaryManager = 0;
        double totalSalaryCEO = 0;

        for (Employee employee : employeeList) {
            double monthly = employee.getSalary() + employee.getSupportSalary();
            totalSalaryEmp = totalSalaryEmp + monthly;
            System.out.println(totalSalaryEmp);
        }

        System.out.println("-----------");
        for (Manager manager : managerList) {
            double monthly = manager.getSalary() + manager.getSupportSalary();
            totalSalaryManager = totalSalaryManager + monthly;
            System.out.println(totalSalaryManager);
        }

        System.out.println("-----------");
        for (CEO ceo : ceoList) {
            double monthly = ceo.getSalary() + ceo.getSupportSalary();
            totalSalaryCEO = totalSalaryCEO + monthly;
            System.out.println(totalSalaryCEO);
        }

        System.out.println("-----------");
        return totalSalary = totalSalaryCEO + totalSalaryManager + totalSalaryEmp;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee nv01 = new Employee(01, 12.0, 0);
        Employee nv02 = new Employee(02, 13.0, 0);
        Employee nv03 = new Employee(03, 13.0, 0);

        employeeList.add(nv01);
        employeeList.add(nv02);
        employeeList.add(nv03);

        nv03.setSupportSalary(5.0);

        List<Manager> managerList = new ArrayList<>();
        Manager m01 = new Manager(04, 20, 10);
        Manager m02 = new Manager(05, 20, 10);

        managerList.add(m01);
        managerList.add(m02);

        List<CEO> ceoList = new ArrayList<>();
        CEO c01 = new CEO(06, 30, 15);
        CEO c02 = new CEO(07, 30, 15);

        ceoList.add(c01);
        ceoList.add(c02);


        double totalSalary = SalaryCalculator.totalSalary(employeeList, managerList, ceoList);
        System.out.println("Total: " + totalSalary);

    }
}
