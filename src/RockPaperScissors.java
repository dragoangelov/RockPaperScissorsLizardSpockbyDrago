package Projects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    private static final String LIZARD = "Lizard";
    private static final String SPOCK = "Spock";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose rock, paper, scissors, lizard, or spock: ");
        String playerMove = scanner.next();

        if (playerMove.equals("rock")) {
            playerMove = ROCK;
        } else if (playerMove.equals("paper")) {
            playerMove = PAPER;
        } else if (playerMove.equals("scissors")) {
            playerMove = SCISSORS;
        } else if (playerMove.equals("lizard")) {
            playerMove = LIZARD;
        } else if (playerMove.equals("spock")) {
            playerMove = SPOCK;
        } else {
            System.out.println("Invalid Input. Please try it again ...");
            return;
        }

        Random random = new Random();
        int computerRandomNumber = random.nextInt(6);

        String computerMove = "";

        switch (computerRandomNumber) {
            case 1:
                computerMove = "Scissors";
                break;
            case 2:
                computerMove = "Rock";
                break;
            case 3:
                computerMove = "Paper";
                break;
            case 4:
                computerMove = "Lizard";
                break;
            case 5:
                computerMove = "Spock";
                break;
        }

        System.out.printf("The computer chose %s\n", computerMove);

        if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
                (playerMove.equals(ROCK) && computerMove.equals(LIZARD)) ||
                (playerMove.equals(PAPER) && computerMove.equals(ROCK)) ||
                (playerMove.equals(PAPER) && computerMove.equals(SPOCK)) ||
                (playerMove.equals(SCISSORS) && computerMove.equals(LIZARD)) ||
                (playerMove.equals(SCISSORS) && computerMove.equals(PAPER)) ||
                (playerMove.equals(LIZARD) && computerMove.equals(SPOCK)) ||
                (playerMove.equals(LIZARD) && computerMove.equals(PAPER)) ||
                (playerMove.equals(SPOCK) && computerMove.equals(SCISSORS)) ||
                (playerMove.equals(SPOCK) && computerMove.equals(ROCK))) {
            System.out.println("You win.");
        } else if ((playerMove.equals(ROCK) && computerMove.equals(PAPER)) ||
                (playerMove.equals(ROCK) && computerMove.equals(SPOCK)) ||
                (playerMove.equals(PAPER) && computerMove.equals(SCISSORS)) ||
                (playerMove.equals(PAPER) && computerMove.equals(LIZARD)) ||
                (playerMove.equals(SCISSORS) && computerMove.equals(ROCK)) ||
                (playerMove.equals(SCISSORS) && computerMove.equals(SPOCK)) ||
                (playerMove.equals(LIZARD) && computerMove.equals(ROCK)) ||
                (playerMove.equals(LIZARD) && computerMove.equals(SCISSORS)) ||
                (playerMove.equals(SPOCK) && computerMove.equals(PAPER)) ||
                (playerMove.equals(SPOCK) && computerMove.equals(LIZARD))) {
            System.out.println("You lose.");
        } else {
            System.out.println("The game was draw.");
        }
    }
}



