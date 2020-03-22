// Gordon Bates
// gordondonphx@gmail.com
// github.com/jdoes
// started on 03/18/2020
// based on https://www.udemy.com/course/java-for-absolute-beginners
        // Coding Challenge 3 if-then statements


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
//EXERCISE 3 and 4:

    	Scanner scanner = new Scanner(System.in);

    	int randNum = ThreadLocalRandom.current().nextInt(1, 6);
		System.out.print("Pick a number from 1 to 5: ");
		int numPick = scanner.nextInt();

		if (numPick == randNum) {
			System.out.format("%d is correct. Lucky guess!!! ", numPick);
		}

		else {
			System.out.println("\nNope. Have one more try.");
			if (numPick > randNum) {
				System.out.print("You guessed too high. ");
			}
			if (numPick < randNum) {
				System.out.print("You guessed too low. ");
			}
			int numPick2 = scanner.nextInt();
			if (numPick2 ==randNum) {
				System.out.format("\nCORRECT!\n%d was a good second guess. ", numPick2);
			}
			else {
				System.out.println("Still not. Better luck next time. ");
			}
		}

	}
}


//========================================
//EXERCISE 1:
    /*
	int x = 9;
	int y = 9;

	    if (x > y) {
	        System.out.println("x is greater than y");
        }
	    else if (x < y) {
	        System.out.println("x is less than y");
        }
	    else {
	        System.out.println("x equals y");
        }

     */

//============================================
//EXERCISE 2:
/*

Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter an X value: ");
		int X = scanner.nextInt();

		System.out.print("Enter a Y value: ");
		int Y = scanner.nextInt();

		int diff = Math.abs(X - Y);

		if (X > Y) {
			System.out.format("%d is greater than %d, and ", X, Y);
		}
		else if (X < Y) {
			System.out.format("%d is less than %d, and ", X, Y);
		}
		else {
			System.out.format("%d equals %d, which means ", X, Y);
		}

    System.out.format("the difference is %d.", diff);

 */