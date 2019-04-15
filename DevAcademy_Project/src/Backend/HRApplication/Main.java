package HRApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner myScanner = new Scanner(System.in);

    ArrayList<HRApplication.Employee> employee = new ArrayList<Employee>();

    public static void main(String[] args){
        Main ma = new Main();
        ma.init();
    }

    private void menu() {
        System.out.println("Welcome to HR NET");
        System.out.println("Enter your Username");
        String login = myScanner.nextLine();
        System.out.println("Enter your password");
        int password = Integer.parseInt(myScanner.nextLine());
        if(login.equalsIgnoreCase() == "Employee" && password == 1234) {
            employeeMenu(login);
        } else if (login.equalsIgnoreCase() == "HR" && password == 2345) {
            HRMenu();
        } else if (login.equalsIgnoreCase() == "Manager" && password == 3456) {
            managerMenu();
        } else {
            System.out.println("Invalid Username / Password combination. Please try again");
        }
    }

    public void init() {
        employee.add( new Employee(1,"Mr", "Patrick", "Phillips", "31121986", "77 Ballance Street", "Bath", "Somerset", "AA1 2PP", "07999465321", "simon@yahoo.com", "Consultant", 01/05/2019));
        employee.add( new Employee(2,"Mrs", "Deirdre", "Phillips", "01101982", "86 Portskewett Street", "Cambridge", "Cambridgeshire", "FW1 2GG", "07999465321", "deidre@yahoo.com", "Consultant", 01/05/2019));
        employee.add( new Employee(3,"Mr", "Peter", "Jones", "22081976", "42 Lliswerry Road", "Oxford", "Oxfordshire", "EA1 2NN", "07999465321", "peter@yahoo.com", "Consultant", 01/05/2019));
        employee.add( new Employee(4,"Mrs", "Abby", "Thomas", "15061988", "54 Broadmead Park", "Edinburgh", "Midlothian", "FA1 2DD", "07999465321", "Abby@yahoo.com", "Consultant", 01/05/2019));
        employee.add( new Employee(5,"Mr", "Connor", "Matthews", "07121999", "36 Moorland Park", "York", "East Riding", "JA1 2VV", "07999465321", "connor@yahoo.com", "Consultant", 01/05/2019));
        employee.add( new Employee(6,"Mrs", "Stefania", "Darkangel", "28051984", "14 Rhian Street", "Milton Keynes", "Buckinghamshire", "QA1 2KK", "07999465321", "stefania@yahoo.com", "Consultant", 01/05/2019));
        employee.add( new Employee(7,"Mr", "Geoffey", "Banks", "20111980", "55 Queens Square", "Manchester", "Greater Manchester", "UA1 2LL", "07999465321", "geoffrey@yahoo.com", "Consultant", 01/05/2019));
        menu();
    }

    private void employeeMenu() {

    }

    private void HRMenu() {

    }

    private void managerMenu() {

    }


}
