package ch2.sec4;

public interface IntEmployee {
    public void setSalary(double salary);

    public String validateNewSalary(double salary);

    public boolean increaseSalary(double percentage);

    public String getName();

    public double getSalary();

    default public void printEmplData() {
        System.out.printf("Employee name: %s with salary: %.2f%n", getName(), getSalary());
    }
}
