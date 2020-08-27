package Aufgabe;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        LocalDate birthDate = LocalDate.of(1994,01,21);
        int age = 26;
        String name = "Rashad";
        char gender = 'm';
        String familyName = "Khoshnow";
        double pointAverage = 3.0;
        boolean married = false;
        System.out.printf(" age: %d |name: %s |gender: %c |family name: %s |birth date: %s |point average %f |married: %s  ", age , name , gender , familyName , birthDate , pointAverage,  married);
    }
}
