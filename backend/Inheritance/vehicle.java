package backend.Inheritance;

import java.util.Scanner;

public class vehicle {

    Scanner myScanner = new Scanner(System.in);

    public short numberOfSeats;
    public short numberOfWheels;
    public short currentSpeed;
    public byte currentGear;


    public void accelerate() {
        System.out.println("I accelerate by turning my wheels");
        System.out.println("You are currently going " + currentSpeed + " mph");
        System.out.println("How fast do you want to go?");
        int speed = Integer.parseInt(myScanner.nextLine());
        //Build a method for changeGear that uses an if statement to check speed
        if(currentGear == 1){
            if(speed <= 20 && currentSpeed < speed){
                currentSpeed = 20;
                System.out.println("You are now going " + currentSpeed + " mph");
            }
            else {
                System.out.println("You are already travelling faster than this!");
            }
        }

    }

    public void changeGear() {


    }

    public void brake() {
        System.out.println("I brake by applying pressure to brake discs on my wheels");
        System.out.println("What speed do you want to reduce too?");
        int speed = Integer.parseInt(myScanner.nextLine());
        System.out.println("You are now going " + speed + " mph");
    }

    public void license_number() {
        System.out.println("My License number is WU57 BCX");
    }

    public void truckManufacturer() {
        System.out.println("Scania T730 Topline Streamline LHD");
    }

    public void carManufacturer() {
        System.out.println("BMW 1 Series M-Sport");
    }

    public void motorbikeManufacturer() {
        System.out.println("Honda CBR600RR");
    }

    public void bicycleManufacturer() {
        System.out.println("Jamis Dakar A2 2019 Mountain Bike");
    }

    public void busManufacturer() {
        System.out.println("MAN AA752 body 44 Seater Airport Shuttle Bus");
    }

    public void model() {

    }

    public void price() {

    }


}


