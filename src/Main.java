import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double randNum = Math.floor(Math.random() * 100) + 1; // Random number is generated
        System.out.println("Guess The Number!");
        System.out.println("Choose a number from 1-100");
        int num = userInput.nextInt(); // Asks for user input

        // Loop until the guessed number matches the random number
        while (num != randNum) {
            // Check if the guessed number is within the valid range (1 to 100)
            if (num >= 1 && num <= 100) {
                // Provide feedback if the guessed number is too low
                if (num < randNum) {
                    System.out.println("Too Low");
                    // Provide feedback if the guessed number is too high
                } else if (num > randNum) {
                    System.out.println("Too High");
                }
            } else {
                // Inform the user if their input is outside the valid range
                System.out.println("Number input is not between 1 and 100");
            }
            // Prompt the user to try guessing again
            System.out.println("Try again:");
            num = userInput.nextInt(); // Asks for a new input

        }
        System.out.println("That's the correct number!");
    }
}