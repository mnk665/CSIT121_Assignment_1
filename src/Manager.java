import java.time.LocalDate;

public class Manager extends Employee{
    private double currentBudget;
    private double salary;
    private double budgetCap;
    public Manager()
    {
      super();
      salary=0.0;
      currentBudget =0.0;
      budgetCap =0.0;

    }
    public Manager(String name, Gender gender, LocalDate date_of_birth, int ID, LocalDate date_hired, double budgetCap, double salary, double currentBudget)
    {
        super(name,gender,date_of_birth,ID,date_hired);
        this.salary=salary;
        this.currentBudget = currentBudget;
        this.budgetCap = budgetCap;
    }

    //getters
    public double getCurrentBudget() {return currentBudget;}
    public double getSalary() {return salary;}
    public double getBudgetCap() {return budgetCap;}

    //setters
    public void setCurrentBudget(double currentBudget) {this.currentBudget = currentBudget;}
    public void setSalary(double salary) {this.salary = salary;}
    public void setBudgetCap(double budgetCap) {this.budgetCap = budgetCap;}


    public void payRaise()
    {
         salary+=0.05*salary;
         budgetCap +=200;
    }

    @Override
    public double ManagerBudget(){
            double difference=budgetCap-currentBudget;
            currentBudget=budgetCap;
        return (difference);
    }

    @Override
    public String toString() {
        return (
               "Manager"+" "+super.toString()+" "+ budgetCap +" "+salary+" "+ currentBudget
                );
    }
}
