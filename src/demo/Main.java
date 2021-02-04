package demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Person> personList = new ArrayList<Person>();
        Member m = new Member("Bilal","2909951234",false);
        personList.add(m);


        System.out.println(m);
        System.out.println(personList);
    }
}
