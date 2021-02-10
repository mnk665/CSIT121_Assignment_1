public class Manager extends Employee{
    private double budget;
    private double salary;
    public Manager()
    {
      super();
      salary=0.0;
      budget=0.0;
    }
    public Manager(double salary,double budget)
    {
        super();
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

    }
}
