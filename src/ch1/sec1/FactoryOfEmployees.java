package ch1.sec1;

public class FactoryOfEmployees {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob");
        System.out.printf("salary of %s is %.2f%n", employee1.getName(), employee1.getSalary());
        System.out.println(employee1.increaseSalary(10));
        System.out.printf("salary of %s is %.2f%n", employee1.getName(), employee1.getSalary());
        employee1.setSalary(100);
        System.out.printf("salary of %s is %.2f%n", employee1.getName(), employee1.getSalary());
        System.out.println(employee1.increaseSalary(10));
        System.out.printf("salary of %s is %.2f%n", employee1.getName(), employee1.getSalary());
        employee1.setSalary(100);
        System.out.println(employee1.increaseSalary(10));
        System.out.printf("salary of %s is %.2f%n", employee1.getName(), employee1.getSalary());
    }
}
