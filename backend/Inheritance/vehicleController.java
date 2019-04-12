package backend.Inheritance;

import java.util.Scanner;

public class vehicleController {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        vehicleController vc = new vehicleController();
        vc.menu();
    }

    private void menu() {
        System.out.println("\n");
        System.out.println("Which vehicle would you like to create today?");
        System.out.println("1 - Car");
        System.out.println("2 - Bus");
        System.out.println("3 - Truck");
        System.out.println("4 - Train");
        System.out.println("5 - Motorbike");
        System.out.println("6 - Bicycle");
        int input = Integer.parseInt(myScanner.nextLine());

        switch(input) {
            case 1:
                createCar();
                break;

            case 2:
                createBus();
                break;

            case 3:
                createTruck();
                break;

            case 4:
                createTrain();
                break;

            case 5:
                createMotorbike();
                break;

            case 6:
                createBicycle();
                break;
            default:
        }
        menu();
    }

    private void createCar() {
        car c = new car((short)5, (short)4);
        c.carManufacturer();
        c.license_number();
        c.steer("Right");
        c.accelerate();
        c.brake();
        menu();
    }

    private void createBus() {
        bus b = new bus((short)5, (short)4);
        b.busManufacturer();
        b.steer("Left");
        b.accelerate();
        b.brake();
        menu();
    }

    private void createTruck() {
        truck a = new truck((short)5, (short)4);
        a.truckManufacturer();
        a.steer("Left");
        a.accelerate();
        a.brake();
        menu();
    }

    private void createTrain() {
        train t = new train((short)5, (short)4);
        t.steer("");
        t.accelerate();
        t.brake();
        menu();
    }

    private void createMotorbike() {
        motorbike m = new motorbike((short)5, (short)4);
        m.motorbikeManufacturer();
        m.steer("Left");
        m.accelerate();
        m.brake();
        menu();
    }

    private void createBicycle() {
        bicycle b = new bicycle((short)5, (short)4);
        b.bicycleManufacturer();
        b.steer("Right");
        b.accelerate();
        b.brake();
        menu();
    }
}
