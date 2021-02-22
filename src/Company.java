import java.time.LocalDate;
import java.util.*;
public class Company {
    private ArrayList<Employee>employees;
    private double current_balance;

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
    public double getCurrent_balance() {return current_balance;}

    //setters
    public void setEmployees(ArrayList<Employee> employees) {this.employees = employees;}
    public void setCurrent_balance(double current_balance) {this.current_balance = current_balance;}

    //methods
    public void CreateEmployeeRecord(){
        System.out.println("---------------------------");
        Scanner scanString=new Scanner(System.in);
        Scanner scanInt=new Scanner(System.in);
        Scanner scanDouble=new Scanner(System.in);
        String name,gender,emp_type,typeOfDev,role;
        int id,hoursWorked,dobY,dobM,dobD,dohY,dohM,dohD;
        double budgetCap,salary,currentBudget,wage;
        System.out.println("\t\tENTER EMPLOYEE DETAILS:");
                System.out.print("\nNAME:");
                name=scanString.nextLine();
                System.out.print("GENDER(male/female):");
                gender=scanString.nextLine();
                System.out.println("DATE OF BIRTH");
                System.out.print("Year:");
                dobY=scanInt.nextInt();
                System.out.print("Month:");
                dobM=scanInt.nextInt();
                System.out.print("Day:");
                dobD=scanInt.nextInt();
                System.out.print("EMPLOYEE ID:");
                id=scanInt.nextInt();
                System.out.println("DATE OF Hire");
                System.out.print("Year:");
                dohY=scanInt.nextInt();
                System.out.print("Month:");
                dohM=scanInt.nextInt();
                System.out.print("Day:");
                dohD=scanInt.nextInt();
                System.out.print("Employee type (manager,developer,support):");
                emp_type=scanString.nextLine();
                if (emp_type.equalsIgnoreCase("manager")) {
                    System.out.print("BudgetCap:");
                    budgetCap=scanDouble.nextDouble();
                    System.out.print("Salary:");
                    salary= scanDouble.nextDouble();
                    System.out.print("Current Budget:");
                    currentBudget= scanDouble.nextDouble();
                    addEmployee(new Manager(name,Gender.valueOf(gender), LocalDate.of(dobY,dobM,dobD),id,LocalDate.of(dohY,dohM,dohD),budgetCap,salary,currentBudget));

                }
                else if(emp_type.equalsIgnoreCase("Developer")){
                    System.out.print("Salary:");
                    salary= scanDouble.nextDouble();
                    System.out.print("Type of developer:");
                    typeOfDev= scanString.nextLine();
                    System.out.print("Role Title:");
                    role= scanString.nextLine();
                    addEmployee(new Developer(name,Gender.valueOf(gender),LocalDate.of(dobY,dobM,dobD),id,LocalDate.of(dohY,dohM,dohD),salary,Type.valueOf(typeOfDev),role));

                }
                else if(emp_type.equalsIgnoreCase("Support")){
                    System.out.print("wage:");
                    wage= scanDouble.nextDouble();
                    System.out.print("Hours Worked");
                    hoursWorked= scanDouble.nextInt();
                    addEmployee(new CustomerSupport(name,Gender.valueOf(gender),LocalDate.of(dobY,dobM,dobD),id,LocalDate.of(dohY,dohM,dohD),wage,hoursWorked));

                }

            }


    public void removeEmployees() {
        System.out.println("---------------------------");
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        System.out.print("Enter the ID of employee to be removed:");
        int id = scan.nextInt();
        for (Employee e : employees) {
            if (id == e.getID()) {
                employees.remove(e);
                System.out.println("Record of employee having ID:" + e.getID() + " is removed.");
                return;
            } else {
                counter++;
            }

        }
        if(counter==employees.size())
            System.out.println("Sorry,the record doesnt exist.");
    }

    public void listEmployees() {
        System.out.println("---------------------------");
        for(Employee e:employees)
            System.out.println(e.toString());
    }
    public void displayEmpbyID() {
        System.out.println("---------------------------");
        Scanner scan = new Scanner(System.in);
        int counter=0;
        System.out.print("Please enter employee ID to display employee: ");
        int input1 = scan.nextInt();

        for (Employee e : employees) {
            if (input1 == e.getID()) {
                System.out.println(e);
            }
            else{
                counter++;
            }
        }
        if(counter==employees.size())
            System.out.println("Sorry,the record doesnt exist.");
    }

    public void givePayRaise(){
        System.out.println("---------------------------");
        Scanner scan= new Scanner(System.in);
        int counter=0;
        System.out.print("Please enter employee ID give a pay raise: ");
        int input = scan.nextInt();

        for(Employee e: employees){
            if(input == e.getID()){
                e.payRaise();
            }
            else
            {
                counter++;
            }
        }
        if(counter==employees.size())
            System.out.println("Sorry,the record doesnt exist");

    }

    private void calcTotalSal(){
        double totalSalary=0;
        for(Employee e:employees)
        {
           totalSalary+=e.getSalary();
        }
        System.out.println("The total salary of all employees in the company is ="+totalSalary);
        if(current_balance>=totalSalary) {
            current_balance -= totalSalary;
        }
        else
        {
            System.out.println("Not enough balance");
        }

    }
    private void resetHoursWorked(){
      for (Employee e:employees)
      {
          e.reset();
      }
        System.out.println("All hours of support staff have been reset");
    }

    private void topBudget(){
        for(Employee e:employees) {
            if (e.ManagerBudget() != -1) {
                System.out.println("Manager with ID " + e.getID() + " has their budget topped");
                System.out.println(e.ManagerBudget());
                current_balance -= e.ManagerBudget();//money to replenish manager's budget deducted from company balance
            }
        }
        }

    public void companyPayRoll(){  //all financials of the company
        System.out.println("----------------------------------");
        System.out.println("\t\tPAYROLL");
        System.out.println("\t\t-------");
        calcTotalSal();
        resetHoursWorked();
        topBudget();
        System.out.println("Company balance has been updated");
        System.out.println("Company Balance=" + (current_balance));
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }


}
