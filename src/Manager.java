import java.util.Date;

public class Manager extends Employee{
    private double budget;
    private double salary;
    public Manager()
    {
      super();
      salary=0.0;
      budget=0.0;
    }
    public Manager(String name, Date date_of_birth, int ID, Date date_hired, Gender gender,double salary, double budget)
    {
        super(name,date_of_birth,ID,date_hired,gender);
        this.salary=salary;
        this.budget=budget;
    }

    //getters
    public double getBudget() {return budget;}
    public double getSalary() {return salary;}

    //setters
    public void setBudget(double budget) {this.budget = budget;}
    public void setSalary(double salary) {this.salary = salary;}

    @Override
    public void payRaise()
    {
         salary+=0.05*salary;
         budget+=200;
    }

    @Override
    public String toString() {
        return (
               "Manager"+" "+super.toString()+" "+String.valueOf(Company.getCurrent_balance())+" "+salary+" "+budget
                );
    }
}
