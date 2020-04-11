package ch2.sec4;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Employee {
    private double salary;
    private final String name;
    private static int lastId;
    public int ID;

    static {
        lastId= 1;
    }

    public Employee(String name) {
        this.name = name;
        addIdd();
    }

    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
        addIdd();
    }

    private void addIdd() {
        this.ID = lastId++;
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

    @Override
    public String toString() {
        DecimalFormat decFormat = new DecimalFormat("#.##");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        decFormat.setRoundingMode(RoundingMode.HALF_UP);
        return "Employee{" +
                "ID=" + ID +
                ", salary=" + numberFormat.format(salary) +
                ", amount= " + decFormat.format(salary) +
                ", name='" + name + '\'' +
                '}';
    }
}
