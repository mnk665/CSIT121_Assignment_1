import java.time.LocalDate;

public class Developer extends Employee{
    private static final int JuniorMax=2000;
    private static final int MidMax=4000;

    private Type type;
    private String role_title;
    private double salary;

    Developer()
    {
     super();
     Type type= Type.senior;
     role_title="";
     salary=0.0;
    }

    Developer(String name, Gender gender, LocalDate date_of_birth, int ID, LocalDate date_hired, double salary, Type type, String role_title)
    {
        super(name,gender,date_of_birth,ID,date_hired);
        this.type=type;
        this.role_title=role_title;
        this.salary=salary;
    }

    //getters
    public static int getJuniorMax() {return JuniorMax;}
    public static int getMidMax() {return MidMax;}
    public Type getType(){return type;}
    public String getRole_title() {return role_title;}
    public double getSalary() {return salary;}

    //setters
    public void setType(Type type){this.type=type;}
    public void setRole_title(String type) {this.role_title = role_title;}
    public void setSalary(double salary) {this.salary = salary;}


    public void payRaise()
    {
        switch (type)
        {
            case senior:
                            salary+=0.03*salary;
                                    break;
            case junior:
                            if(salary<=JuniorMax)
                             {
                                 salary+=0.03*salary;
                                 System.out.println("Pay raise have been provided to the employee.");
                             }
                         else
                             {System.out.println("Salary has reached the limit for junior employees");}
                                break;
            case midlevel:
                            if(salary<=MidMax)
                              {
                                  salary+=0.03*salary;
                                  System.out.println("Pay raise have been provided to the employee.");
                              }
                            else
                              {System.out.println("Salary has reached the limit for senior employees");}
                            break;

        }
    }

    public double PayRollSalary(){
        return salary;
    }

    @Override
    public String toString()
    {
        return(
                "Developer"+" "+super.toString()+" "+salary+" "+ type +" "+role_title
                );
    }
}
