package myapp;

import java.security.SecureRandom;
import java.util.Random;
import java.io.Console;

public class GuessNumber{

    public static void main(String[] args){

        //Create a random number generator
        Random rand = new SecureRandom();

        //generate a number between 1 - 10
        int toGuess = rand.nextInt(10) + 1;

        System.out.printf(">>> To guess: %d\n", toGuess);

        // get input from user
        Console cons = System.console();

        // set a variable called tries
        int tries = 0;

        boolean didWin = false;

        // check if we have guessed 3 times
        while (tries < 3){

            // get input
            String input = cons.readLine("Guess a number between 1 - 10. ");
            int myGuess = Integer.parseInt(input);

            if (myGuess > toGuess)
            System.out.println("Too High");

            else if (myGuess < toGuess)
            System.out.println("Too Low");

            else{
                System.out.println("YOU WIN!");
                didWin = true;
                // exit the while loop
                // didWin = true;
                // break;
                // status = 0 -- signaling the process terminated successfully
                // status = -1 -- signaling the process did not terminate successfully
                System.exit(0);
            }

            tries += 1;

        } // while loop

        if (!didWin){
            System.out.println("YOU LOSE!");
        }
    }
}