import java.util.*;
public class Employee {

    private String name;
    private Date date_of_birth;
    private int ID;
    private Date date_hired;
    private Gender gender;

    public Employee() {
        name = "";
        date_of_birth = new Date();
        ID = 0;
        date_hired = new Date();
        Gender gender = Gender.male;

    }

    public Employee(String name, Date date_of_birth, int ID, Date date_hired,Gender gender) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.ID = ID;
        this.date_hired = date_hired;
        this.gender=gender;;
    }

    //getters
    public String getName() {return name;}
    public Date getDate_of_birth() {return date_of_birth; }
    public int getID() {return ID;}
    public Date getDate_hired() {return date_hired;}
    public Gender getGender() {return  gender;}


    //setters
    public void setName(String name) {this.name = name;}
    public void setDate_of_birth(Date date_of_birth) {this.date_of_birth = date_of_birth;}
    public void setID(int ID) {this.ID = ID;}
    public void setDate_hired(Date date_hired) {this.date_hired = date_hired;}
    public void setGender(Gender gender) {this.gender=gender;}



    @Override
    public String toString() {
        return (name+"  "+String.valueOf(gender)+"  "+date_of_birth+"  "+ID+
                "  "+date_hired+" ");
    }


    public void payRaise()
    {
        System.out.print("No pa raises");
    }
}