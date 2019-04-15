package Animals;

import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class createAnimal {
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        createAnimal create = new createAnimal();
        create.getAnimalType();
    }

    private void getAnimalType() {
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();
        if (animal.equalsIgnoreCase("dog")) {
            createDog();
        } else if (animal.equalsIgnoreCase("cat")) {
            createCat();
        } else {
            System.out.println(animal + " is not an animal we can currently create, please try again");
        }
    }

    private void createDog() {
        System.out.println("What is the dogs name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age = Integer.parseInt(myScanner.nextLine());
        System.out.println("What breed is the dog?");
        String breed = myScanner.nextLine();
        Dog myDog = new Dog(name, size, age, breed);

        System.out.println(myDog.bark(size));
        System.out.println(myDog.play(breed));
        System.out.println(myDog.beHuman(name, age, breed));

        getAnimalType();

    }

    private void createCat() {
        System.out.println("What is the cats name?");
        String name = myScanner.nextLine();
        System.out.println("How big is your cat?");
        String size = myScanner.nextLine();
        System.out.println("How old is the cat?");
        int age = Integer.parseInt(myScanner.nextLine());
        System.out.println("What breed is the cat?");
        String breed = myScanner.nextLine();
        Cat myCat = new Cat(name, age, size, breed);

        System.out.println(myCat.sleep(breed));
        System.out.println(myCat.meow(size));

        getAnimalType();

    }

}
