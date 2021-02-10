
public class CustomerSupport extends Employee{
    private static int rate=2;
    private int hours_worked;
    private double wage;

    CustomerSupport()
    {
        super();
        hours_worked=0;
        wage=0.0;
    }

    CustomerSupport(int hours_worked,double wage)
    {
        super();
        this.hours_worked=hours_worked;
        this.wage=wage;
    }

    //getters
    public static int getRate() {return rate;}
    public int getHours_worked() {return hours_worked;}
    public double getWage() {return wage;}

    //setters
    public void setHours_worked(int hours_worked) {this.hours_worked = hours_worked;}
    public void setWage(double wage) {this.wage = wage;}

    @Override
    public void payRaise()
    {

    }

    public void calculateWage(){}
    public void calculateSalary(){}
}

