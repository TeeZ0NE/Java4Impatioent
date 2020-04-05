package ch1.sec1;

import java.util.ArrayList;
import java.util.Collection;

public class FactoryOfEmployees {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob");
        employee1.printEmplData();
        System.out.println(employee1.increaseSalary(10));
        employee1.printEmplData();
        employee1.setSalary(100);
        employee1.printEmplData();
        System.out.println(employee1.increaseSalary(10));
        employee1.setSalary(100);
        employee1.printEmplData();
        System.out.println(employee1.increaseSalary(10));
        employee1.printEmplData();

        // Collection //
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(employee1);
        for (Employee employee : staff) {
            if (employee.getName().equalsIgnoreCase(employee1.getName()))
                employee.increaseSalary(5);
        }
        employee1.printEmplData();

        staff.add(new Employee("TiRexx", 1200));
        staff.get(staff.size()-1).printEmplData();
        staff.get(staff.size()-1).increaseSalary(2);
        staff.get(staff.size()-1).printEmplData();
    }
}
