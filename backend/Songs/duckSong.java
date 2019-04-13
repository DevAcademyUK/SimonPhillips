package Songs;

import java.util.Scanner;

public class duckSong {
    public static void main(String[] args) {
        duckSong singing = new duckSong();
        singing.sing();
    }

    private void sing() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many ducks are swimming?");
        int ducks = myScanner.nextInt();

        String word = "ducks";
        for (int i = ducks; i > 0; i--) {
            System.out.println(i + " little" + word + " went swimming one day");
            System.out.println("Over the hills and far away");
            System.out.println("Mother duck said, quack quack quack quack!");
            if (i == 1) {
                System.out.println("But no little ducks came swimming back");
            } else {
                int newNum = i - 1;
                if (newNum == 1) {
                    word = "duck";
                }
                System.out.println(newNum + " little" + word + " came back");
                System.out.println();
            }
        }
        System.out.println("\nMother duck went out swimming one day");
        System.out.println("Over the hills and far away");
        System.out.println("Mother duck said, quack quack quack quack!");
        System.out.println("And all the " + ducks + " ducks came swimming back");
    }
}
