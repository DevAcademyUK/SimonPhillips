package games;

import java.util.Random;
import java.util.Scanner;
//Import library's which you can use for your program. Think of this as a codebase with accessible methods.
public class rockPaperScissors {
    //The main class that everything else is nested within
    String playerName;
    String playerMove;
    String computerMove;
    //declarinhg empty string variables
    int score;
    //declaring empty int variable
    Scanner myScanner = new Scanner(System.in);
    //Utilising the scanner library, declaring a new scanner within the variable myScanner, this is an method that will wait for an input from the user via the console.
    public static void main(String[] args){
    //Main method
        rockPaperScissors rps = new rockPaperScissors();
        //declaring a variable rps calling a new function rockPaperScissors();
        rps.initialiseGame();
        //Calling the rps variable and then calling the initialiseGame function.
    }


    private void initialiseGame(){
        //Method
        System.out.println("Enter your name: ");
        //Print to console
        playerName = myScanner.nextLine();
        //variable call nextline of myScanner variable
        playGame();
        //calls playGame method
    }

    private void playGame(){
        System.out.println("Enter your move: ");
        //Ask for a move (rock, paper or scissors)
        playerMove = myScanner.nextLine();
        //Setting variable playerMove to nextLine method of myScanner.
        System.out.println(playerName + " has selected " + playerMove + " as their move");
        //Print to console variables and strings using concatenation.
        computerMove = generateComputerMove();
        //Setting variable to generateComputerMove method
        String result = getWinner(playerMove, computerMove);

        if(result.equalsIgnoreCase("Win")){
            System.out.println("Congratulations, you won this round!");
            score++;
        }
        else if(result.equalsIgnoreCase("Lose")){
            System.out.println("You lost this round!");
            score--;
        }
        else {
            System.out.println("This round was a draw!");
        }

        if(score < 3 && score > -3){
            //if score is less than 3 and score is more than -3
            playGame();
            //playgame method
        }
        else if(score == 3){
            //else score is equal to 3, return winner
            System.out.println("Winner Winner!!");

        }
        else if(score == -3){
            //else if score == -3, return lose
            System.out.println("You Looooooosssseeeee!");
        }

    }

    private String generateComputerMove() {

        Random r = new Random();
        // set variable r to new Random method from random library
        String move = "";
        //string variable move equals empty string
        int i = r.nextInt(3);
        //int i = r variable next line method of random library

        switch(i){
            //switch statemeent to assign either rock, paper, scissors to move variable depending on random number
            case 0:
                move = "Rock";
                break;

            case 1:
                move = "Paper";
                break;

            case 2:
                move = "Scissors";
                break;
        }
        return move;
    }

    private String getWinner(String playerMove, String computerMove){
        String outcome = "";
        //if statements compare playermove variable with computermove variable and assigns the result to the outcome variable
        if(playerMove.equalsIgnoreCase("rock")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Draw";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Lose";
            }
            else{
                outcome = "Win";
            }
        }
        if(playerMove.equalsIgnoreCase("paper")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Win";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Draw";
            }
            else{
                outcome = "Lose";
            }
        }
        if(playerMove.equalsIgnoreCase("scissors")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Lose";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Win";
            }
            else{
                outcome = "Draw";
            }
        }
        return outcome;
    }
}
