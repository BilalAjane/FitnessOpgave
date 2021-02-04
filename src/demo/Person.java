package demo;

public class Person {

    protected String name;
    protected String cpr;

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    public Person(String name, String cpr) {
        this.name = name;
        this.cpr = cpr;
    }
}
