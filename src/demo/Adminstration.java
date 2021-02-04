package demo;

public class Adminstration extends Employee{

    private int vacation;

    public Adminstration(String name, String cpr) {
        super(name, cpr);
    }

    public int getVacation() {
        return vacation;
    }
}
