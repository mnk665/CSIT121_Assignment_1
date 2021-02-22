import java.time.LocalDate;

public class CustomerSupport extends Employee {
    private static final double rate = 0.02; //2 percent
    private int hours_worked;
    private double wage;

    CustomerSupport() {
        super();
        hours_worked = 0;
        wage = 0.0;
    }

    CustomerSupport(String name, Gender gender, LocalDate date_of_birth, int ID, LocalDate date_hired, double wage, int hours_worked) {
        super(name,gender,date_of_birth,ID,date_hired);
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


    public void payRaise() {
        wage += rate * wage;
        System.out.println("Pay raise have been provided to the employee.");
    }

    public double getSalary() {
        double salary;
         if(hours_worked>48)
             salary=((48*wage)+((hours_worked-48)*(0.25*wage)));
         else
             salary=hours_worked*wage;

         return salary;
    }


    public void reset(){
        hours_worked=0;
    }

    @Override
    public String toString()
    {
        return(
                "Support"+" "+super.toString()+" "+wage+" "+hours_worked
                );
    }

}