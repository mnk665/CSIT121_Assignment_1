import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

        public class Assignment1_MAIN {
         public static void main(String args[]) throws IOException{
            Company company=new Company(new ArrayList<Employee>(),500000);
            Scanner scan_opt=new Scanner(System.in);
             Scanner scan_opt2=new Scanner(System.in);
            int opt=0;
            String choice="";

            ReadFile(company);


            do {
                System.out.println("\t\t\t<<MAIN MENU>>");
                System.out.println("---------------------------");
                System.out.println("Please choose the appropriate choice:");
                System.out.println("1.Add an Employee");
                System.out.println("2.Remove an employee");
                System.out.println("3.List all employees");
                System.out.println("4.Show an employee");
                System.out.println("5.Pay Raise Employee");
                System.out.println("6.Pay Roll");
                System.out.println("7.Exit");
                System.out.print("Enter your choice:");
                opt = scan_opt.nextInt();
                switch (opt) {
                    case 1:
                        company.CreateEmployeeRecord();
                        break;
                    case 2:
                        company.removeEmployees();
                        break;
                    case 3:
                        company.listEmployees();
                        break;
                    case 4:
                        company.displayEmpbyID();
                        break;
                    case 5:
                        company.givePayRaise();
                        break;
                    case 6:
                        company.companyPayRoll();
                        break;
                    case 7:
                            break;
                    default:
                        System.out.println("ERROR:Invalid number entered");
                }
                System.out.println("\nDo you wish to continue?");
                System.out.print("->");
                choice=scan_opt2.nextLine();
            }while (choice.equalsIgnoreCase("yes")||(opt!=7));

            FileWrite(company);
        }

        public static void ReadFile(Company company) throws IOException {
            FileReader fr=new FileReader("EmployeeList.txt");
            Scanner scanFile= new Scanner(fr);
            while(scanFile.hasNextLine())
            {
                String[] arr=scanFile.nextLine().split(" ");
                String empType=arr[0];
                if(empType.equalsIgnoreCase("manager"))
                {
                    company.addEmployee(new Manager(arr[1],Gender.valueOf(arr[2]), LocalDate.of(Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5])),Integer.parseInt(arr[6]),
                            LocalDate.of(Integer.parseInt(arr[7]),Integer.parseInt(arr[8]),Integer.parseInt(arr[9])),Double.parseDouble(arr[10]),Double.parseDouble(arr[11]),Double.parseDouble(arr[12])));

                }
                else if(empType.equalsIgnoreCase("developer"))
                {
                    company.addEmployee(new Developer(arr[1],Gender.valueOf(arr[2]),LocalDate.of(Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5])),Integer.parseInt(arr[6]),
                            LocalDate.of(Integer.parseInt(arr[7]),Integer.parseInt(arr[8]),Integer.parseInt(arr[9])),Double.parseDouble(arr[10]),Type.valueOf(arr[11]),arr[12]));
                }
                else if(empType.equalsIgnoreCase("Support"))
                {
                    company.addEmployee(new CustomerSupport(arr[1],Gender.valueOf(arr[2]),LocalDate.of(Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5])),Integer.parseInt(arr[6]),
                            LocalDate.of(Integer.parseInt(arr[7]),Integer.parseInt(arr[8]),Integer.parseInt(arr[9])),Double.parseDouble(arr[10]),Integer.parseInt(arr[11])));
                }

            }
            fr.close();
            System.out.println("Records have been imported from the file successfully");
        }
        public static void FileWrite(Company company) throws IOException {
            FileWriter fw=new FileWriter("EmployeeList.txt");
            Scanner scan=new Scanner("EmployeeList.txt");
                for (Employee e:company.getEmployees())
                    fw.write(e.toString()+"\n");


            fw.close();
            System.out.println("Any new changes have been saved");
            System.out.println("File Updated.");
        }


}
