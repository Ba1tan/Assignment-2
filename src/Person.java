public abstract class Person implements Payable, Comparable<Person>
{
    private int id;
    private static int id_gen = 1;
    private String firstName;
    private String secondName;

    public Person()
    {
        id = id_gen++;
    }
    public Person(String firstName, String secondName)
    {
        this();
        setFirstName(firstName);
        setSecondName(secondName);
    }
    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int compareTo(Person nextPerson) {
        if (this.getPaymentAmount() == nextPerson.getPaymentAmount())
        {
            return 0;
        }
        else if (this.getPaymentAmount() < nextPerson.getPaymentAmount())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

    public abstract String getPosition();
    public String toString()
    {
        return getPosition() + " " + getId() + ':' + " " + '\n' + "Name: " + getFirstName() + '\n' + "Surname: " + getSecondName() + '\n' + "Earns " + getPaymentAmount() + " tenge";
    }

}
