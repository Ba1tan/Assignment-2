public class Employee extends Person
{
    private String position;
    private double salary;
    public Employee(String firstName, String secondName, String position, double salary)
    {
        super(firstName, secondName);
        setPosition(position);
        setSalary(salary);
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String getPosition() {
        return position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public double getPaymentAmount()
    {
        return getSalary();
    }


    public double getSalary() {
        return salary;
    }
    @Override
    public int compareTo(Person nextPerson) {
        if(this.getPaymentAmount() == nextPerson.getPaymentAmount())
        {
            return 0;
        }
        else if (this.getPaymentAmount() < nextPerson.getPaymentAmount()) {
            return -1;
        }
        else
        {
            return 1;
        }
    }
    public String toString()
    {
        return '\n' + super.toString();
    }

}
