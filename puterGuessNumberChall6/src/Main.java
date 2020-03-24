// Gordon Bates
// gordondonphx@gmail.com
// github.com/jdoes
// started on 03/24/2020
// based on https://www.udemy.com/course/java-for-absolute-beginners under Java Fundamentals Wrap Ups
// Coding Challenge 6: Exercise 3 Computer Guess Number
// Purchase feeble public access cable show and exploit it

//Import the scanner, which is what listens for input to be typed by user
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        //Describe the game
        System.out.println("\n### Guess My Number Game ###\n");
        System.out.println("Hello human, my name is HAL. \n" +
                "Think of a number within some range and I'll try to guess it.");

        //Ask user for the range of the number they're thinking
        //Still needs error checking, where the minimum must be less than the maximum
        System.out.println("What is the lower limit of the range?");
        int min = scanner.nextInt();
        System.out.println("What is the upper limit of the range?");
        int max = scanner.nextInt();

        //Give rules
        System.out.println("--- Rules ---");
        System.out.printf("I will make guesses from %d to %d.", min, max);
        System.out.println("\nEnter \"higher\" if my guess is too low.");
        System.out.println("Enter \"lower\" if my guess is too high.");
        System.out.println("Enter \"correct\" if I get it right.");


        //Narrow down to half the numbers, by making first guess be near or at the middle of the range
        //Since we are dealing with ints, there are cases where the average will not be exactly in the
        // middle of min and max, but it still narrows down the possibilities by a lot.
        int compGuess = (min + max)/2;
        while (true) {
            System.out.printf("\nComputer guesses: %d.", compGuess);
            System.out.println("\nEnter your response as higher, lower, or correct.");
            input = scanner.next();

            if (input.equals("higher")) {
                //the guess was too low, so the number must be in the upper half of the range
                //reset the min of new range to just above the middle of the previous range
                min = compGuess + 1;
            } else if (input.equals("lower")) {
                //the guess was too high, so the number must be in the lower half of the range
                //reset the max of the new range to just below the middle of the previous range
                max = compGuess - 1;
            } else if (input.equals("correct")) {
                //the number has been guessed!
                System.out.printf("%d, huh!?! I actually thought it was that all along!", compGuess);
                break;
            }

            //Narrow down half by making next guess be in middle of new range
            //The average of two numbers is equidistant from those numbers on a number line,
            //except for in this case, we are dealing with integers, so the
            // program rounds down to the previous whole number.
            compGuess = (min + max)/2;

            //if one guess is 8, you say higher, and the next guess is 9, and you say lower, that is not possible
            if (min > max) {
                System.out.printf("That's not possible. %d is not less than %d lets try again.", min, max);
                break;
            }

        }

    }
}

//===================================================================
// Narrow down by incrementing or decrementing the min and max by + / - 1.
//
//import java.util.Scanner;
//        import java.util.concurrent.ThreadLocalRandom;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input;
//
//        System.out.println("\n### Guess My Number Game ###\n");
//        System.out.println("Think of a number within some range and I'll try to guess it.");
//
//        System.out.println("What is the lower limit of the range?");
//        int min = scanner.nextInt();
//        System.out.println("What is the upper limit of the range?");
//        int max = scanner.nextInt();
//
//        System.out.println("--- Rules ---");
//        System.out.println("I will make guesses from " + min + " to " + max + ".");
//        System.out.println("Enter \"higher\" if my guess is too low.");
//        System.out.println("Enter \"lower\" if my guess is too high.");
//        System.out.println("Enter \"correct\" if I get it right.");
//
//        while (true) {
//            int guess = ThreadLocalRandom.current().nextInt(min, max +1);
//            System.out.println("\nComputer guesses: " + guess + ".");
//            System.out.println("Enter your response as higher, lower, or correct.");
//            input = scanner.next();
//            if (input.equals("higher")) {
//                min = guess + 1;
//            } else if (input.equals("lower")) {
//                max = guess - 1;
//            } else if (input.equals("correct")) {
//                System.out.println(guess + ", huh!?! I actually thought it was that all along!");
//                break;
//            }
//        }
//
//    }
//}