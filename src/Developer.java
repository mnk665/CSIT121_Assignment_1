public class Developer extends Employee{
    private static final int JuniorMax=2000;
    private static final int MidMax=4000;

    enum role_title {junior,midlevel,senior_developer}
    private String type;
    private double salary;

    Developer()
    {
     super();
     type="";
     salary=0.0;
    }

    Developer(String type,double salary)
    {
        super();
        this.type=type;
        this.salary=salary;
    }

    //getters
    public static int getJuniorMax() {return JuniorMax;}
    public static int getMidMax() {return MidMax;}
    public String getType() {return type;}
    public double getSalary() {return salary;}

    //setters
    public void setType(String type) {this.type = type;}
    public void setSalary(double salary) {this.salary = salary;}

    @Override
    public void payRaise()
    {

    }
}
