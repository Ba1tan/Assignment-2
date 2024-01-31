import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        Person Person1 = new Student("Ringo", "Starr", 2.45);
        Person Person2 = new Employee("John", "Lennon", "Administrator", 27045.78);
        Person Person3 = new Student("Paul", "Paul", 3.24);
        Person Person4 = new Employee("George", "Harrison", "Manager", 50000.00);
        ArrayList<Person> person = new ArrayList<>();
        person.add(Person3);
        person.add(Person4);
        person.add(Person1);
        person.add(Person2);

        Collections.sort(person);

        printData(person);
    }
    public static void printData(ArrayList<Person> person)
    {
        for(Person p : person)
        {
            System.out.println(p);
        }
    }
}