import java.util.Date;

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

    Developer(String name, Date date_of_birth, int ID, Date date_hired, Gender gender, Type type, String role_title, double salary)
    {
        super(name,date_of_birth,ID,date_hired,gender);
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

    @Override
    public void payRaise()
    {
        switch (type)
        {
            case senior: salary+=0.03*salary;
                                    break;
            case junior: if(salary<=JuniorMax)
                            salary+=0.03*salary;
                                break;
            case midlevel:if(salary<=MidMax)
                            salary+=0.03*salary;
                            break;

        }
    }

    @Override
    public String toString()
    {
        return(
                "Developer"+" "+super.toString()+" "+salary+" "+String.valueOf(type)+" "+role_title
                );
    }
}
