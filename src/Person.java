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
    @Override
    public abstract double getPaymentAmount();


    public abstract String getPosition();
    public String toString()
    {
        return getPosition() + " " + getId() + ':' + " " + '\n' + "Name: " + getFirstName() + '\n' + "Surname: " + getSecondName() + '\n' + "Earns " + getPaymentAmount() + " tenge";
    }

}
