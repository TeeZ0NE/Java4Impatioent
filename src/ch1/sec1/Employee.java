package ch1.sec1;

import java.util.EmptyStackException;

public class Employee {
    private double salary;
    private String name;

    public Employee(String name) {
        this.salary = 0.0;
        this.name = name;
    }

    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
    }

    public void setSalary(double salary) {
        String validatedMsgOfNewSalary = validateNewSalary(salary);
        try {
            if (!validatedMsgOfNewSalary.isEmpty()) throw new Exception(validatedMsgOfNewSalary);
            this.salary = salary;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private String validateNewSalary(double salary) {
        String msg = "";

        if (salary < 0) msg = "Value cannot be negative or less then zero";
        if (salary < this.salary) msg = "U trying to setup salary less then it is";
        return msg;
    }

    public boolean increaseSalary(double percentage) {
        boolean isIncreased = Boolean.FALSE;

        if (percentage > 0) {
          salary *= (1 + percentage / 100);
          isIncreased = Boolean.TRUE;
        }
        return isIncreased;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void printEmplData() {
        System.out.printf("Employee name: %s with salary: %.2f%n", getName(), getSalary());
    }
}
