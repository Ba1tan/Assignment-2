import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Payable> Persons = new ArrayList<>();
        Persons.add(new Student("Nursultan", "Bukenbayev", 3.00));
        for(Payable person : Persons)
        {
            System.out.println(person);
        }
    }
}