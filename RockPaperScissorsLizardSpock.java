import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsLizardSpock {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    private static final String LIZARD = "Lizard";
    private static final String SPOCK = "Spock";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INTRO
        System.out.println("********************** WELCOME TO **********************");
        System.out.println("******* ROCK - PAPER - SCISSORS - LIZARD - SPOCK *******\n");
        System.out.println("In order to end the game simply ask, and it shall be given!\n\n");



        System.out.println("Choose [R]ock, [P]aper, [S]cissors, [L]izard or [Sp]ock: ");
        String userChoice = scanner.nextLine();

        int playerW = 0;
        int computerW = 0;
        int draws = 0;

        while (!userChoice.equalsIgnoreCase("end")) {

            //We determine the users choice
            if (userChoice.equalsIgnoreCase("r") || userChoice.equalsIgnoreCase("rock")) {
                userChoice = ROCK;
            } else if (userChoice.equalsIgnoreCase("p") || userChoice.equalsIgnoreCase("paper")) {
                userChoice = PAPER;
            } else if (userChoice.equalsIgnoreCase("s") || userChoice.equalsIgnoreCase("scissors")) {
                userChoice = SCISSORS;
            } else if (userChoice.equalsIgnoreCase("l") || userChoice.equalsIgnoreCase("lizard")) {
                userChoice = LIZARD;
            } else if (userChoice.equalsIgnoreCase("sp") || userChoice.equalsIgnoreCase("spock")) {
                userChoice = SPOCK;
            } else {
                System.out.println("Choose [R]ock, [P]aper, [S]cissors, [L]izard or [Sp]ock: ");
                userChoice = scanner.nextLine();
                continue;
            }

            //Determining computer choice
            Random random = new Random();
            String[] computerChoices = new String[]{"Rock", "Paper", "Scissors", "Lizard", "Spock"};
            String computerChoice = computerChoices[random.nextInt(computerChoices.length)];


            //Outcome of the game

            if (userChoice.equalsIgnoreCase(ROCK)) {

                if (computerChoice.equalsIgnoreCase(LIZARD) || computerChoice.equalsIgnoreCase(SCISSORS)) {
                    System.out.printf("Player WINS!%n%s crushes %s!%n%n", userChoice, computerChoice);
                    playerW++;
                } else if (computerChoice.equalsIgnoreCase(PAPER)) {
                    System.out.printf("Computer WINS!%n%s covers %s!%n%n", computerChoice, userChoice);
                    computerW++;
                } else if (computerChoice.equalsIgnoreCase(SPOCK)) {
                    System.out.printf("Computer WINS!%n%s vaporizes %s!%n%n", computerChoice, userChoice);
                    computerW++;
                } else {
                    System.out.printf("The Game is a DRAW!%n%n");
                    draws++;
                }

            } else if (userChoice.equalsIgnoreCase(LIZARD)) {

                if (computerChoice.equalsIgnoreCase(SPOCK)) {
                    System.out.printf("Player WINS!%n%s poisons %s!%n%n", userChoice, computerChoice);
                    playerW++;
                } else if (computerChoice.equalsIgnoreCase(ROCK)) {
                    System.out.printf("Computer WINS!%n%s crushes %s!%n%n", computerChoice, userChoice);
                    computerW++;
                } else if (computerChoice.equalsIgnoreCase(PAPER)) {
                    System.out.printf("Player WINS!%n%s eats %s!%n%n", userChoice, computerChoice);
                    playerW++;
                } else if (computerChoice.equalsIgnoreCase(SCISSORS)) {
                    System.out.printf("Computer WINS!%n%s decapitate %s!%n%n", computerChoice, userChoice);
                    computerW++;
                } else {
                    System.out.printf("The Game is a DRAW!%n%n");
                    draws++;
                }

            } else if (userChoice.equalsIgnoreCase(SPOCK)) {

                if (computerChoice.equalsIgnoreCase(SCISSORS)) {
                    System.out.printf("Player WINS!%n%s smashes %s!%n%n", userChoice, computerChoice);
                    playerW++;
                } else if (computerChoice.equalsIgnoreCase(ROCK)) {
                    System.out.printf("Player WINS!%n%s vaporizes %s!%n%n", userChoice, computerChoice);
                    playerW++;
                } else if (computerChoice.equalsIgnoreCase(PAPER)) {
                    System.out.printf("Computer WINS!%n%s disproves %s!%n%n", computerChoice, userChoice);
                    computerW++;
                } else if (computerChoice.equalsIgnoreCase(LIZARD)) {
                    System.out.printf("Computer WINS!%n%s poisons %s!%n%n", computerChoice, userChoice);
                    computerW++;
                } else {
                    System.out.printf("The Game is a DRAW!%n%n");
                    draws++;
                }

            } else if (userChoice.equalsIgnoreCase(SCISSORS)) {

                if (computerChoice.equalsIgnoreCase(PAPER)) {
                    System.out.printf("Player WINS!%n%s cut %s!%n%n", userChoice, computerChoice);
                    playerW++;
                } else if (computerChoice.equalsIgnoreCase(LIZARD)) {
                    System.out.printf("Player WINS!%n%s decapitate %s!%n%n", userChoice, computerChoice);
                    playerW++;
                } else if (computerChoice.equalsIgnoreCase(ROCK)) {
                    System.out.printf("Computer WINS!%n%s crushes %s!%n%n", computerChoice, userChoice);
                    computerW++;
                } else if (computerChoice.equalsIgnoreCase(SPOCK)) {
                    System.out.printf("Computer WINS!%n%s smashes %s!%n%n", computerChoice, userChoice);
                    computerW++;
                } else {
                    System.out.printf("The Game is a DRAW!%n%n");
                    draws++;
                }

            } else {

                if (computerChoice.equalsIgnoreCase(ROCK)) {
                    System.out.printf("Player WINS!%n%s covers %s!%n%n", userChoice, computerChoice);
                    playerW++;
                } else if (computerChoice.equalsIgnoreCase(SPOCK)) {
                    System.out.printf("Player WINS!%n%s disproves %s!%n%n", userChoice, computerChoice);
                    playerW++;
                } else if (computerChoice.equalsIgnoreCase(SCISSORS)) {
                    System.out.printf("Computer WINS!%n%s cut %s!%n%n", computerChoice, userChoice);
                    computerW++;
                } else if (computerChoice.equalsIgnoreCase(LIZARD)) {
                    System.out.printf("Computer WINS!%n%s eats %s!%n%n", computerChoice, userChoice);
                    computerW++;
                } else {
                    System.out.printf("The Game is a DRAW!%n%n");
                    draws++;
                }

            }

            System.out.println("Choose [R]ock, [P]aper, [S]cissors, [L]izard or [Sp]ock: ");
            userChoice = scanner.nextLine();
        }

        System.out.println("*****THE GAME IS OVER*****");

        //We Determine who is the winner
        if (playerW < computerW){

            System.out.println("THE COMPUTER IS VICTORIOUS");
            System.out.printf("With %d wins, %d loses, and %d draws",computerW,playerW,draws);

        } else if (playerW > computerW) {

            System.out.println("THE PLAYER IS VICTORIOUS");
            System.out.printf("With %d wins, %d loses, and %d draws",playerW,computerW,draws);

        } else {
            System.out.println("THE GAME WAS A DRAW");
        }


    }


}
