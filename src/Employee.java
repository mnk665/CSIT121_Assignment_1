import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Employee {

    private String name;
    private LocalDate date_of_birth;
    private int ID;
    private LocalDate date_hired;
    private Gender gender;

    public Employee() {
        name = "";
        date_of_birth = LocalDate.of(2000,1,1);
        ID = 0;
        date_hired = LocalDate.of(2000,1,1);
        Gender gender = Gender.male;

    }

    public Employee(String name, Gender gender, LocalDate date_of_birth, int ID, LocalDate date_hired) {
        this.name = name;
        this.gender=gender;
        this.date_of_birth = date_of_birth;
        this.ID = ID;
        this.date_hired = date_hired;
    }

    //getters
    public String getName() {return name;}
    public LocalDate getDate_of_birth() {return date_of_birth; }
    public int getID() {return ID;}
    public LocalDate getDate_hired() {return date_hired;}
    public Gender getGender() {return  gender;}


    //setters
    public void setName(String name) {this.name = name;}
    public void setDate_of_birth(LocalDate date_of_birth) {this.date_of_birth = date_of_birth;}
    public void setID(int ID) {this.ID = ID;}
    public void setDate_hired(LocalDate date_hired) {this.date_hired = date_hired;}
    public void setGender(Gender gender) {this.gender=gender;}




    public String toString() {
        String dob=date_of_birth.format(DateTimeFormatter.ofPattern("yyyy MM dd"));
        String doh=date_hired.format(DateTimeFormatter.ofPattern("yyyy MM dd"));
        return (name+" "+String.valueOf(gender)+" "+dob+" "+ID+" "+doh);
    }


    public double ManagerBudget(){return -1;}
    public void reset(){};
    public abstract double getSalary();
    public abstract void payRaise();
}