package demo;

public class Person {

    protected String name;
    protected String cpr;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    @Override
    public String toString() {
            return " Name: " + this.name + " CPR: " + this.getCpr();
    }

    public String toStringNameCpr() {
        return " Name: " + getName() + ", CPR: " + getCpr();
    }
}
