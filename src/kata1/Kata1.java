package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Elisabet", new Date(93,6,21));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}