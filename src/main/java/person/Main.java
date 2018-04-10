package person;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Zay");
        Person p2 = new Person("Clause");
        Person p3 = new Person("Zamir");
        Person p4 = new Person("JoJO");
        Person p5 = new Person("Jermaine");
        Person p6 = new Person("Dwayne");
        Person p7 = new Person("Amanuel");


        ArrayList<Person> students = new ArrayList<Person>();

        students.add(p1);
        students.add(p2);
        students.add(p3);
        students.add(p4);
        students.add(p5);
        students.add(p6);
        students.add(p7);


        Iterator<Person> p = students.iterator();
        while (p.hasNext()) {
            Person result = p.next();
            System.out.println(result);
        }

    }
}
