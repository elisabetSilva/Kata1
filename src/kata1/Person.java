package kata1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Person {
    
    private final String name;
    private final LocalDate birthdate;
    //private final long MILLISECONDS_PER_YEAR = (long) (1000*60*60*24*365.25);

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(birthdate, today);
    }
}