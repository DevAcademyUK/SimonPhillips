package Backend.HRApplication;

import java.util.Comparator;
import java.util.Scanner;

public class Employee {

    Scanner myScanner = new Scanner(System.in);

    protected int employeeID;
    public String Title;
    public String Forename;
    public String Surname;
    protected String DOB;
    public String Address;
    public String City;
    public String County;
    public String postCode;
    public String contactNumber;
    public String emailAddress;
    protected String Position;
    protected String startDate;

    public Employee (int ID, String title, String forename, String surname,
                     String dob, String address, String city, String county, String postcode,
                     String contactnumber, String emailaddress, String position, String startdate) {
        employeeID = ID;
        this.Title = title;
        this.Forename = forename;
        this.Surname = surname;
        this.DOB = dob;
        this.Address = address;
        this.City = city;
        this.County = county;
        this.postCode = postcode;
        this.contactNumber = contactnumber;
        this.emailAddress = emailaddress;
        this.Position = position;
        this.startDate = startdate;
    }

    private void addNewEmployee() {
        System.out.println("What is the employees title?");
        String name = myScanner.nextLine();
        System.out.println("What is the employees forename?");
        String fname = myScanner.nextLine();
        System.out.println("What is the employees surname?");
        String sname = myScanner.nextLine();
        System.out.println("What is the employees DOB?");
        String dob = myScanner.nextLine();
        System.out.println("What is the employees address?");
        String address = myScanner.nextLine();
        System.out.println("What is the employees city?");
        String city = myScanner.nextLine();
        System.out.println("What is the employees county?");
        String county = myScanner.nextLine();
        System.out.println("What is the employees post code?");
        String postcode = myScanner.nextLine();
        System.out.println("What is the employees contact number?");
        String contactNumber = myScanner.nextLine();
        System.out.println("What is the employees email address");
        String emailAddress = myScanner.nextLine();
        System.out.println("What is the employee position?");
        String position = myScanner.nextLine();
        System.out.println("What is the employees start date?");
        String startDate = myScanner.nextLine();

    }

    public static Comparator<Employee>
}
