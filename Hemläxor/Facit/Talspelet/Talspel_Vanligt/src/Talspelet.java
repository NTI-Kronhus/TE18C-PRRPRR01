import java.util.Random;
import java.util.Scanner;

public class Talspelet {

    public static Scanner input = new Scanner(System.in);

    //      Difficulty Settings
    //  1. Easy
    final static int maxGuessesEasy = 15;
    final static int maxNumLimitEasy = 25;
    //  2. Normal
    final static int maxGuessesNormal = 10;
    final static int maxNumLimitNormal = 50;
    //  3. Hard
    final static int maxGuessesHard = 7;
    final static int maxNumLimitHard = 100;

    //      Round Settings
    static int currentMaxGuesses = 0;
    static int currentMaxNumLimit = 0;
    static int currentAmountOfGuesses = 0;
    static int currentCorrectNumber = 0;
    static String currentPlayerName = "default";


    /*
        *** MAIN ***
    */

    public static void main(String[] args) {

        startUpScreen();

        boolean isPlaying = true;
        currentPlayerName = getCurrentPlayerName();

        while (isPlaying) {
            oneRound(getDifficulty());
            isPlaying = checkAnotherRound();
        }

        endOfGameScreen();

    }

    private static void oneRound(int difficulty) {
        resetRoundSettings(difficulty);
        roundStartUpScreen(difficulty);

        boolean hasWon = false;
        boolean hasLost = false;

        while(!hasWon && !hasLost){
            int guess = getGuess();
            currentAmountOfGuesses++;

            if(guess < currentCorrectNumber){
                System.out.println("Your guess is smaller than the correct number. You have " + (currentMaxGuesses - currentAmountOfGuesses) + " tries remaining.");
            } else if(guess > currentCorrectNumber){
                System.out.println("Your guess is bigger than the correct number. You have " + (currentMaxGuesses - currentAmountOfGuesses) + " tries remaining.");
            } else {
                hasWon = checkHasWon(guess);
            }
            hasLost = checkHasLost();
        }
        input.nextLine(); //buffer

        endOfRoundScreen(hasWon, hasLost);
    }




    /*
        *** STARTUP + SETTINGS***
     */

    private static void startUpScreen() {
        System.out.println("Welcome to The Number Game!" +
                "\nIn this game you will attempt to guess a number, and receive hints along the way."
        );
    }

    private static String getCurrentPlayerName() {
        System.out.println("Please enter your name: ");
        return input.nextLine();
    }

    private static int getDifficulty() {

        System.out.println("Please select a difficulty for this round, " + currentPlayerName + "." +
                "\n1. Easy - You will guess from 0-" + maxNumLimitEasy + " and you have " + maxGuessesEasy + "tries." +
                "\n2. Normal - You will guess from 0-" + maxNumLimitNormal + " and you have " + maxGuessesNormal + "tries." +
                "\n3. Hard - You will guess from 0-" + maxNumLimitHard + " and you have " + maxGuessesHard + "tries." +
                "\nPlease type '1', '2' or '3' now."
        );

        return input.nextInt();
    }

    private static void resetRoundSettings(int difficulty) {
        switch (difficulty) {
            case 1:
                currentMaxGuesses = maxGuessesEasy;
                currentMaxNumLimit = maxNumLimitEasy;
                break;
            case 2:
                currentMaxGuesses = maxGuessesNormal;
                currentMaxNumLimit = maxNumLimitNormal;
                break;
            case 3:
                currentMaxGuesses = maxGuessesHard;
                currentMaxNumLimit = maxNumLimitHard;
                break;
            default:
                System.out.println("Something went wrong.");
                System.exit(0);
                break;
        }
        currentAmountOfGuesses = 0;
        currentCorrectNumber = randomizeNumber();
    }

    private static int randomizeNumber() {
        Random randomizer = new Random();
        return randomizer.nextInt(currentMaxNumLimit);
    }




    /*
        *** GAMEPLAY ***
     */

    private static int getGuess() {
        System.out.println("Please enter your guess now: ");
        return input.nextInt();
    }

    private static boolean checkHasLost() {
        if(currentAmountOfGuesses >= currentMaxGuesses){
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkHasWon(int guess) {
        if(guess == currentCorrectNumber) {
            return true;
        } else {
            return false;
        }
    }

    private static void roundStartUpScreen(int difficulty) {
        System.out.println("Alright, let's get going!");
        switch (difficulty) {
            case 1:
                System.out.println("You have chosen easy mode." +
                        "\nYou will guess from 0-" + maxNumLimitEasy + " and you have " + maxGuessesEasy + "tries."
                );
                break;
            case 2:
                System.out.println("You have chosen normal mode." +
                        "\nYou will guess from 0-" + maxNumLimitNormal + " and you have " + maxGuessesNormal + "tries."
                );
                break;
            case 3:
                System.out.println("You have chosen hard mode." +
                        "\nYou will guess from 0-" + maxNumLimitHard + " and you have " + maxGuessesHard + "tries."
                );
                break;
            default:
                System.out.println("Something went wrong.");
                System.exit(0);
                break;
        }
        System.out.println("Good luck, " + currentPlayerName + "!");
    }

    private static void endOfRoundScreen(boolean hasWon, boolean hasLost) {
        if(hasWon){
            System.out.println("Congratulations, you won!");
        } else if (hasLost){
            System.out.println("Bummer, you lost...");
        }
        System.out.println("You guessed " + currentAmountOfGuesses + " times, and the correct answer was " + currentCorrectNumber + ".");
    }




    /*
        *** END OF GAME ***
     */

    private static boolean checkAnotherRound() {
        System.out.println("Do you want to play another round? (y/n)");
        String answer = input.nextLine();
        if (answer.equals("y")){
            return true;
        } else{
            return false;
        }
    }

    private static void endOfGameScreen() {
        System.out.println("Thank you for playing, see you next time!");
    }

}
