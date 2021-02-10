import java.util.*;
public class Employee {

    private String name;
    private Date date_of_birth;
    private int ID;
    private Date date_hired;

    enum gender {male, female}

    private ArrayList<Manager> managers;
    private ArrayList<Developer> developers;
    private ArrayList<CustomerSupport> Customer_SuppReps;

    public Employee() {
        name = "";
        date_of_birth = new Date();
        ID = 0;
        date_hired = new Date();
        managers = new ArrayList<Manager>();
        developers = new ArrayList<Developer>();
        Customer_SuppReps = new ArrayList<CustomerSupport>();

    }

    public Employee(String name, Date date_of_birth, int ID, Date date_hired, ArrayList<Manager> managers, ArrayList<Developer> developers, ArrayList<CustomerSupport> customer_SuppReps) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.ID = ID;
        this.date_hired = date_hired;
        this.managers = managers;
        this.developers = developers;
        this.Customer_SuppReps = customer_SuppReps;
    }

    //getters
    public String getName() {return name;}
    public Date getDate_of_birth() {return date_of_birth; }
    public int getID() {return ID;}
    public Date getDate_hired() {return date_hired;}
    public ArrayList<Manager> getManagers() {return managers;}
    public ArrayList<Developer> getDevelopers() {return developers;}
    public ArrayList<CustomerSupport> getCustomer_SuppReps() {return Customer_SuppReps;}


    //setters
    public void setName(String name) {this.name = name;}
    public void setDate_of_birth(Date date_of_birth) {this.date_of_birth = date_of_birth;}
    public void setID(int ID) {this.ID = ID;}
    public void setDate_hired(Date date_hired) {this.date_hired = date_hired;}
    public void setManagers(ArrayList<Manager> managers) {this.managers = managers;}
    public void setDevelopers(ArrayList<Developer> developers) {this.developers = developers;}
    public void setCustomer_SuppReps(ArrayList<CustomerSupport> customer_SuppReps) {Customer_SuppReps = customer_SuppReps;}


    public void payRaise()
    {

    }
}