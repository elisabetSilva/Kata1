package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1993, 6, 21);
        Person person = new Person("Elisabet", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
