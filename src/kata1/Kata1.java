package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {

    public static void main(String[] args) {
        //Calendar date = GregorianCalendar.getInstance();
        //date.set(1993, 6, 21);
        LocalDate date = LocalDate.of(1993, Month.JUNE, 21);
        Person person = new Person("Elisabet", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
    }
}
