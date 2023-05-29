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
            System.out.println("Invalid Input. Please try again ...");
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

        if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) {
            System.out.println("YOU WIN! Rock crushes Scissors");
        } else if (playerMove.equals(ROCK) && computerMove.equals(LIZARD)) {
            System.out.println("YOU WIN! Rock crushes Lizard");
        } else if (playerMove.equals(PAPER) && computerMove.equals(ROCK)) {
            System.out.println("YOU WIN! Paper covers Rock");
        } else if (playerMove.equals(PAPER) && computerMove.equals(SPOCK)) {
            System.out.println("YOU WIN! Paper disproves Spock");
        } else if (playerMove.equals(SCISSORS) && computerMove.equals(LIZARD)) {
            System.out.println("YOU WIN! Scissors decapitate Lizard");
        } else if (playerMove.equals(SCISSORS) && computerMove.equals(PAPER)) {
            System.out.println("YOU WIN! Scissors cuts Paper");
        } else if (playerMove.equals(LIZARD) && computerMove.equals(SPOCK)) {
            System.out.println("YOU WIN! Lizard poisons Spock");
        } else if (playerMove.equals(LIZARD) && computerMove.equals(PAPER)) {
            System.out.println("YOU WIN! Lizard eats Paper");
        } else if (playerMove.equals(SPOCK) && computerMove.equals(SCISSORS)) {
            System.out.println("YOU WIN! Spock smashes Scissors");
        } else if (playerMove.equals(SPOCK) && computerMove.equals(ROCK)) {
            System.out.println("YOU WIN! Spock vapourises Rock");
        } else if (playerMove.equals(ROCK) && computerMove.equals(PAPER)) {
            System.out.println("YOU LOSE! Paper covers Rock");
        } else if (playerMove.equals(ROCK) && computerMove.equals(SPOCK)) {
            System.out.println("YOU LOSE! Spock vapourises Rock");
        } else if (playerMove.equals(PAPER) && computerMove.equals(SCISSORS)) {
            System.out.println("YOU LOSE! Scissors cuts Paper");
        } else if (playerMove.equals(PAPER) && computerMove.equals(LIZARD)) {
            System.out.println("YOU LOSE! Lizard eats Paper");
        } else if (playerMove.equals(SCISSORS) && computerMove.equals(ROCK)) {
            System.out.println("YOU LOSE! Rock crushes Scissors");
        } else if (playerMove.equals(SCISSORS) && computerMove.equals(SPOCK)) {
            System.out.println("YOU LOSE! Spock smashes Scissors");
        } else if (playerMove.equals(LIZARD) && computerMove.equals(ROCK)) {
            System.out.println("YOU LOSE! Rock crushes Lizard");
        } else if (playerMove.equals(LIZARD) && computerMove.equals(SCISSORS)) {
            System.out.println("YOU LOSE! Scissors decapitate Lizard");
        } else if (playerMove.equals(SPOCK) && computerMove.equals(PAPER)) {
            System.out.println("YOU LOSE! Paper disproves Spock");
        } else if (playerMove.equals(SPOCK) && computerMove.equals(LIZARD)) {
            System.out.println("YOU LOSE! Lizard poisons Spock");
        } else {
            System.out.println("The game was draw.");
        }
    }
}



