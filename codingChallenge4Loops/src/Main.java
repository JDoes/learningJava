//Gordon Bates
//Started on 03/21/2020
//github.com/jdoes
//gordonphx@gmail.com
//Udemy URL: https://www.udemy.com/course/java-for-absolute-beginners , under Loops
//Purchase feeble public access cable show and exploit it.

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

//==========================================================
// EXERCISE 5 and 6:

        Scanner scanner = new Scanner(System.in);

        int randNum = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int count = 0;
        System.out.println("The game is to guess a number from 1 to 100: ");

        do{
            System.out.println("\nTake a guess: ");
            guess = scanner.nextInt();

            if (guess > randNum) {
                System.out.format("\nIncorrect. Guess lower than %d.", guess);
            }
            else if (guess < randNum) {
                System.out.format("\nIncorrect. Guess higher than %d.", guess);
            }

            count++;
        }while (guess != randNum);

        System.out.format("\n%d is CORRECT!!!", randNum);
        System.out.format("\nYou got it on your %dth try. Great job!", count);

        }

    }


//=============================================
//EXERCISE 1:

//      for (int i = 1; i <= 40; i++) {
//	        System.out.println(i);
//    }

//==============================================
//EXERCISE 2:
//        int count = 1;
//
//        for (int i = 1; i <= 40; i++) {
//            System.out.println(i);
//            if (count == 3) {
//                System.out.println("Quack");
//                count = 0;
//            }
//            count++;
//        }

//=====================================================
//EXERCISE 3:
//        Scanner scanner = new Scanner(System.in);
//        String password;
//
//        do{
//            System.out.println("Enter the correct password to continue: ");
//            password = scanner.next();
//        } while(!password.equals("shark50"));
//
//        if (password.equals("shark50")) {
//            System.out.println("Correct. Thank you for participating.");
//        }

//=========================================
// EXERCISE 4:
//        for (int x = 0; x <=10; x++){
//            System.out.format("%d, ",x);
//        }
//        System.out.println("\b\b.");