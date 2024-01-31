public class Student extends Person
{
    private double gpa;

    public Student(String firstName, String secondName, double gpa)
    {
        super(firstName, secondName);
        setGpa(gpa);
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    @Override
    public double getPaymentAmount() {
        if(getGpa() >  2.67)
        {
            return 36660.00;
        }
        else
        {
            return 0;
        }
    }
    @Override
    public String getPosition()
    {
        return "Student";
    }

    @Override
    public String toString()
    {
        return '\n' +  super.toString();
    }

}
