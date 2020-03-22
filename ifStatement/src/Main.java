//Gordon Bates
//Started on 03/17/2020
//github.com/jdoes
//gordonphx@gmail.com
//Udemy URL: https://www.udemy.com/course/java-for-absolute-beginners , under Conditional Statements
//Purchase feeble public cable access television show and exploit them.

/*
    >   greater than
    >=  greater than or equal to
    <   less than
    <=  less than or equal to
    !=  not equal to
    ==  equal to

-----------------------------------------

    || (Logical OR)
    - At least one of them is true
    true    ||  true    -   true
    true    ||  false   -   true
    false   ||  true    -   true
    false   ||  false   -   false

-----------------------------------------

    && (Logical AND)
    - Both have to be true
    true    &&  true    -   true
    true    &&  false   -   false
    false   &&  true    -   false
    false   &&  false   -   false

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The VIP Lounge. You must have a pass and be 18 to enter.");
        System.out.print("Age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.print("\nDo you have a VIP pass? yes/no: ");
            String vip = scanner.next();

            if (vip.equals("yes") || age >= 70) {
                System.out.println("\nThanks, go on in.");
            }
            else {
                System.out.println("Sorry, you must be at least 70, or have a VIP pass.");
            }
        }
        else {
            System.out.println("Sorry, you must be at least 18.");
        }
    }
}
/*

//==========================================================================

Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("You entered one.");
                break;
            case 2:
                System.out.println("You entered two.");
                break;
            default:
                System.out.println("Invalid number.");
                break;
        }
 //       if (num == 1) {
 //           System.out.println("You entered one.");
//
 //       }
 //       else if (num == 2) {
 //           System.out.println("You entered two.");
 //       }
 //       else {
 //           System.out.println("Invalid answer.");
 //       }

//==========================================================================


        Scanner scanner = new Scanner(System.in);

        System.out.println("The VIP Lounge. You must have a pass and be 18 to enter.");

        System.out.print("Age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.print("\nDo you have a VIP pass? yes/no: ");
            String vip = scanner.next();

            if (vip.equals("yes") || age >= 70) {
                System.out.println("\nThanks, go on in.");
            }
            else {
                System.out.println("Sorry, you must be at least 70, or have a VIP pass.");
            }
        }
        else {
            System.out.println("Sorry, you must be at least 18.");
        }

       // if (age >= 18 && vip.equals("yes") || age >= 70) {
       //     System.out.println("Go ahead, thank you.");
       // }
       // else {
       //     System.out.println("Sorry, no can do.");
       // }


//==========================================================================

     Scanner scanner = new Scanner(System.in);

     System.out.println("Welcome to super fast roller coaster!");
     System.out.print("Please enter your height in centimeters: ");
     int height = scanner.nextInt();

     if (height < 130 || height > 210) {
         System.out.println("Sorry, you do not reach the height requirement");
     }

     else {
         System.out.println("Height Accepted.");
     }

//============================================================================

     Scanner scanner = new Scanner(System.in);

     System.out.println("Welcome to super fast roller coaster!");
     System.out.print("Please enter your height in centimeters: ");

     int height = scanner.nextInt();
     int diffLess = 130 - height;
     int diffMore = height - 210;

     if (height < 130) {
         System.out.format("Sorry, you are too short, by %dcm.", diffLess);
     }

     else if (height > 210) {
         System.out.format("Sorry, you're too tall, by %dcm.", diffMore);
     }

     else {
         System.out.println("Height Accepted.");
     }

//=================================================

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        if (10<5) {
            System.out.println(4);
            System.out.println(5);
            System.out.println(6);
        }

        System.out.println(7);
        System.out.println(8);
        System.out.println(9);

*/