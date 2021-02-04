package demo;

public class Employee extends Person{

    private int hours;
    private int salary;

    public Employee(String name, String cpr) {
        super(name, cpr);
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }
}
