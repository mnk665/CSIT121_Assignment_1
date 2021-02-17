import java.util.*;
public class Company {
    private ArrayList<Employee>employees;
    private static double current_balance;

    public Company()
    {
       employees=new ArrayList<Employee>();
       current_balance=0.0;
    }

    public Company(ArrayList<Employee> employees, double current_balance) {
        this.employees = employees;
        this.current_balance = current_balance;
    }

    //getters
    public ArrayList<Employee> getEmployees() {return employees;}
    public static double getCurrent_balance() {return current_balance;}

    //setters
    public void setEmployees(ArrayList<Employee> employees) {this.employees = employees;}
    public void setCurrent_balance(double current_balance) {this.current_balance = current_balance;}

    //methods
    public void addEmployees(){}
    public void removeEmployees(){}
    public void listEmployees(){}
    public void displayEmpbyID(){}
    public void givePayRaise(){}

    private void calcTotalSal(){}
    private void updateBalance(){}
    private void resetHoursWorked(){}
    private void topBudget(){}

    public void companyPayRoll(){  //all financials of the company
        calcTotalSal();
        updateBalance();
        resetHoursWorked();
        topBudget();
    }


}
