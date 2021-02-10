package demo;

public class Employee extends Person{

    int hours = 0;
    int salary = 0;

    public Employee() {
    }

    public int getHours() {
        return hours;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return " Name: " + name + ", CPR: " + cpr + ", Hours: " + hours + ", Salary: " + salary + ", Vacation: ";

    }
}
