public class Employee extends Person
{
    private String position;
    private int salary;
    public Employee(String firstName, String secondName, String position, int salary)
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

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public double getPaymentAmount()
    {
        return getSalary();
    }

    public int getSalary() {
        return salary;
    }
    public String toString()
    {
        return "Employee: " + getId() + '\n' + super.toString();
    }

}
