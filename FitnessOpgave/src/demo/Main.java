package demo;

import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Adminstration("Hans","060555-2153"));
        personList.add(new Instructor("Henrik","161205-2354",55));
        personList.add(new Member("Bilal","290995-2107",true));
        personList.add(new Instructor("Ole","271205-2464",20));
        personList.add(new Adminstration("Anders","091059-2597"));
        personList.add(new Instructor("Mohammed","020685-2931",40));
        personList.add(new Adminstration("Miklas","070599-2025"));
        personList.add(new Member("Mads", "020598-2651",true));
        personList.add(new Member("Sofie","120595-2102",false));

        System.out.println("FITNESS EMPLOYEES");
        System.out.println("--------------------------------------------------------------------------");
        for (Person person: personList) {
            if(person instanceof Adminstration || person instanceof Instructor) {
                System.out.println(person.toString());
            }
        } System.out.println("-------------------------------------------------------------------------- \n");

        System.out.println("FITNESS MEMBERS");
        System.out.println("--------------------------------------------------------------------------");
        for (Person person: personList) {
            if(person instanceof Member) {
                System.out.println(person.toString());
            }
        } System.out.println("-------------------------------------------------------------------------- \n");

        System.out.println("EMPLOYEES & MEMBERS Name and CPR");
        System.out.println("--------------------------------------------------------------------------");
        for (Person person: personList) {
            if(person instanceof Adminstration || person instanceof Instructor || person instanceof Member) {
                System.out.println(person.toStringNameCpr());
            }
        } System.out.println("-------------------------------------------------------------------------- \n");




    }
}
