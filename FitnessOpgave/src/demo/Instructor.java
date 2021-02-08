package demo;

public class Instructor extends Employee{

    public Instructor(String name, String cpr, int hours) {
        this.name = name;
        this.cpr = cpr;
        this.hours = hours;
    }

    @Override
    public int getSalary() {
        return this.hours * 199;
    }

    @Override
    public String toString() {
        return " Name: " + name + ", CPR: " + cpr + ", Hours: " + hours + ", Salary: " + getSalary() + ", Vacation: No vacation";

    }

}
