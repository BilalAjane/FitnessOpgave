package demo;

public class Adminstration extends Employee{

    int vacation = 5;

    public Adminstration(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
        this.hours = 37;
        this.salary = 33000;
    }

    public int getVacation() {
        return vacation;
    }

    @Override
    public String toString() {
        return " Name: " + name + ", CPR: " + cpr + ", Hours: " + hours + ", Salary: " + salary + ", Vacation: " + vacation;
    }
}
