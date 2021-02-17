import java.util.Date;

public class CustomerSupport extends Employee {
    private static double rate = 0.02; //2 percent
    private int hours_worked;
    private double wage;

    CustomerSupport() {
        super();
        hours_worked = 0;
        wage = 0.0;
    }

    CustomerSupport(String name, Date date_of_birth, int ID, Date date_hired, Gender gender,int hours_worked, double wage) {
        super(name,date_of_birth,ID,date_hired,gender);
        this.hours_worked = hours_worked;
        this.wage = wage;
    }

    //getters
    public static double getRate() {
        return rate;
    }

    public int getHours_worked() {
        return hours_worked;
    }

    public double getWage() {
        return wage;
    }

    //setters
    public void setHours_worked(int hours_worked) {
        this.hours_worked = hours_worked;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public void payRaise() {
        wage += rate * wage;
    }

    public double calculateSalary() {
        double salary=0;
         if(hours_worked>48)
             salary=((48*wage)+((hours_worked-48)*(0.25*wage)));
         else
             salary=hours_worked*wage;

         return salary;
    }

    @Override
    public String toString()
    {
        return(
                "Support"+" "+super.toString()+" "+wage+"  "+hours_worked
                );
    }

}