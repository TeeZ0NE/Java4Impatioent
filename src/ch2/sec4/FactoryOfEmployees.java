package ch2.sec4;

import static ch.AssertionCheck.*;

public class FactoryOfEmployees {
    /**
     * Richest class.
     */
    private static class Richest {
        /**
         * Get most of richest from staff.
         *
         * @param staff
         * @return
         */
        private static Employee getRichest(ArrayListOfStaff<Employee> staff) {
            Employee currEmployee = new Employee("Nobody");
            for (Employee employee : staff) {
                if (employee.getSalary() > currEmployee.getSalary()) {
                    currEmployee = employee;
                }
            }
            return currEmployee;
        }
    }

    /**
     * Main method.
     *
     * @param args array of console arguments
     */
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob");
        employee1.printEmplData();
        System.out.println("Increase salary " + employee1.increaseSalary(10));
        employee1.printEmplData();
        employee1.setSalary(100D);
        employee1.printEmplData();
        System.out.println("Increase salary " + employee1.increaseSalary(10));
        employee1.setSalary(100D);
        employee1.printEmplData();
        System.out.println("Increase Salary " + employee1.increaseSalary(10));
        employee1.printEmplData();

        // Collection //
        ArrayListOfStaff<Employee> staff = new ArrayListOfStaff<>();
        staff.add(employee1);
        for (Employee employee : staff) {
            if (employee.getName().equalsIgnoreCase(employee1.getName()))
                employee.increaseSalary(5);
        }
        employee1.printEmplData();

        staff.add(new Employee("TiRexx", 1200D));
        staff.get(staff.size() - 1).increaseSalary(2);
        staff.get(staff.size() - 1).printEmplData();

        staff.add(new Employee("Homeless"));
        staff.removeIf(employee -> employee.getSalary() <= 0);
        staff.add(new Employee("Rich", 2500D));
        System.out.println(staff);
        // get richest employee and fire him then //
        Employee richestEmployee = Richest.getRichest(staff);

        System.out.format("Get richest (name: %s) employee from a list and he still working: %b%n", richestEmployee.getName(), staff.contains(richestEmployee));
        System.out.format("Giving the sack 2 employee %b%n", fireEmployeeMain(staff, richestEmployee));
        System.out.format("Get richest (name: %s) employee from a list and he still working: %b%n", richestEmployee.getName(), staff.isInStaff(richestEmployee));
        assertion(!staff.contains(richestEmployee), "Richest found");
    }


    /**
     * Fire employee.
     *
     * @param staff Group of staff
     * @param employee2fire employee which will be fired
     * @return if fired true or false if didn't
     * @see ArrayListOfStaff#fireEmployee(Employee)
     */
    private static boolean fireEmployeeMain(ArrayListOfStaff<Employee> staff, Employee employee2fire) {
        return (staff.contains(employee2fire))
                ? staff.fireEmployee(employee2fire)
                : Boolean.FALSE;
    }
}
