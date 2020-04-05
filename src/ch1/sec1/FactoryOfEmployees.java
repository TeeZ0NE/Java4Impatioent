package ch1.sec1;

public class FactoryOfEmployyies {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob");
        System.out.printf("salary of %s is %f", employee1.getName(), employee1.getSalary());
    }
}
