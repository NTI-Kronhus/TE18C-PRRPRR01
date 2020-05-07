package com.company;

public class View {

    public static void printInvalidInput() {
        System.out.println("The input you have entered is not a valid choice, try again.");
    }

    public static void printNumberOfTries(int numberOfTries){
        System.out.println("You have " + (numberOfTries) + " tries left.");
    }

    public static void printInterval(int lowerIndex, int upperIndex) {
        System.out.println("Your guess is outside the limits: " + lowerIndex + "-" + upperIndex);
    }

    public static void displayDifficultySelection() {
        System.out.println("Please select a difficulty.");
        System.out.println("\t1.Easy");
        System.out.println("\t2.Medium");
        System.out.println("\t3.Hard");
    }

    public static void replayPrompt() {
        System.out.println("Do you want to play again?");
        System.out.println("Input 'y' to do so.");
    }

    public static void printStartup() {
        System.out.println("Starting the game.");
        printDots(3, 3);
        System.out.println("Welcome to this awesome, incredible and ADVANCED number guessing game...");
        System.out.println("Press 'Enter' to continue.");
    }

    public static void displayMenu() {
        System.out.println("Main menu:");
        System.out.println("\t1.Play");
        System.out.println("\t2.Exit");
    }

    public static void printGoodBye(){
        System.out.println("Good bye");
        printDots(3, 3);
    }

    public static void printSwag(){
        System.out.println("Make a guess!");
    }

    public static void printWin(int numberOfTries, int tries) {
        System.out.println("You win!");
        printDots(3, 2);
        System.out.println("Congratulations you beautiful beast!");
        System.out.println("You had: " + (numberOfTries - tries) + " tries left!");
    }

    public static void printHint(int guess, int answer, int difficulty) {
        String hint = "";
        switch (difficulty) {
            case 0:
            case 1:
                if (guess > answer) {
                    hint += "Your guess is higher ";
                    hint += guess - answer >= 10 ? "by 10 or more." : "by less than 10.";
                } else {
                    hint += "Your guess is lower ";
                    hint += answer - guess >= 10 ? "by 10 or more." : "by less than 10.";
                }
                break;
            case 2:
                hint += guess > answer ?
                        "Your guess is higher than the random number" :
                        "Your guess is lower than the random number";
                break;
            default:
                break;
        }
        System.out.println(hint);
    }

    private static void printDots(int numberOfDots, int timesToRepeat) {
        try {
            for (int i = 0; i < timesToRepeat; i++) {
                for (int j = 0; j < numberOfDots; j++) {
                    System.out.print(".");
                    Thread.sleep(500L);
                }
                System.out.print("\b\b\b\b\b");
            }
        } catch (Exception ex) {
            System.out.println("Thread died with the exception: " + ex);
            return;
        }
    }

    public static void printSetLowerIntervalPrompt() {
        System.out.println("Please select a minimum value.");
    }

    public static void printSetHigherIntervalPrompt() {
        System.out.println("Please select a maximum value.");
    }
}
