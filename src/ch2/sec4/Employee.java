package ch2.sec4;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Class Employee create simple employee.
 */
public class Employee implements IntEmployee, Comparable<Employee> {
    private double salary;
    private final String name;
    private static int lastId;
    public int ID;

    static {
        lastId = 1;
    }

    /**
     * Constructor wo salary.
     *
     * @param name of employee
     */
    public Employee(String name) {
        this.name = name;
        addIdd();
    }

    /**
     * Full constructor.
     *
     * @param name of employee
     * @param salary amount of salary at start
     */
    public Employee(String name, double salary) {
        this.salary = salary;
        this.name = name;
        addIdd();
    }

    /**
     * Increment ID.
     */
    private void addIdd() {
        this.ID = lastId++;
    }

    /**
     * Set salary for employee.
     *
     * @param salary Amount of salary
     */
    public void setSalary(double salary) {
        String validatedMsgOfNewSalary = validateNewSalary(salary);
        try {
            if (!validatedMsgOfNewSalary.isEmpty()) throw new Exception(validatedMsgOfNewSalary);
            this.salary = salary;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Check is salary can be set.
     *
     * @param salary storing new employee salary
     * @return message if something went wrong
     */
    public String validateNewSalary(double salary) {
        String msg = "";

        if (salary < 0) msg = "Value cannot be negative or less then zero";
        if (salary < this.salary) msg = "U trying to setup salary less then it is";
        return msg;
    }

    /**
     * Increase salary for employee.
     *
     * @param percentage amount of increase
     * @return true if increased otherwise false
     */
    public boolean increaseSalary(double percentage) {
        boolean isIncreased = Boolean.FALSE;

        if (percentage > 0) {
            salary *= (1 + percentage / 100);
            isIncreased = Boolean.TRUE;
        }
        return isIncreased;
    }

    /**
     * Get employee name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get current employee salary.
     *
     * @return salary amount
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Print data about employee.
     */
    public void printEmplData() {
        IntEmployee.super.printEmplData();
    }

    /**
     * toString class.
     *
     * @return string contains main employee's data
     */
    @Override
    public String toString() {
        DecimalFormat decFormat = new DecimalFormat("#.##");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        decFormat.setRoundingMode(RoundingMode.HALF_UP);
        return
                "Employee{" +
                "ID=" + ID +
                ", salary=" + numberFormat.format(salary) +
                ", amount= " + decFormat.format(salary) +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * Compare salaries of employee.
     *
     * @param other Next employee
     * @return Result of comparable
     */
    public int compareTo(Employee other){
        return Double.compare(getSalary(), other.getSalary());
    }
}
