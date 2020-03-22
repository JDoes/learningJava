//Gordon Bates
//Started on 03/15/2020
//github.com/jdoes
//gordonphx@gmail.com
//Udemy URL: https://www.udemy.com/course/java-for-absolute-beginners , under User Input
//Purchase public cable access television show and exploit them.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the bill amount?");
        Double amt = scanner.nextDouble();

        System.out.println("How many people are in your party?");
        int ppl = scanner.nextInt();

        Double eachPay = amt/ppl;

        System.out.format("For a bill of the amount $%.2f, each of the %d people needs to pay $%.2f.", amt, ppl, eachPay);



//==========================================================================
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        int length = name.length();

        System.out.format("Your name, %s, is %d characters long.", name, length);

 //========================================================================
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you");
        int age = scanner.nextInt();

        System.out.format("You have lived %d years. In another %d years, you will be %d years old.", age, age, 2*age);

 //===============================================================

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.format("Hello, %s, nice to meet you.", name);
        System.out.println("\nHello, " + name + ", nice to meet you.");


        String first = scanner.next();
        String last = scanner.next();

        System.out.format("Hello, %s %s, nice to meet you.", first, last);
        System.out.println("\nHello, " + first + " " + last + ", nice to meet you.");


//=============================================================================

        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a simple subtraction program.\nEnter the first number: ");
        double first = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double second = scanner.nextDouble();

        System.out.format("The result of %.3f minus %.3f in %.3f.", first, second, first-second);


//===========================================================================

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        int pets = scanner.nextInt();

        System.out.println("What kind of animal are they?");
        String kind = scanner.next();

        System.out.println("How many kids do you have?");
        double kids = scanner.nextDouble();

        //System.out.print(4.5 - 2.7);
        System.out.format("You have %d %s, and %.2f kids.", pets, kind, kids);


//=====================================================================================
//Simple program to ask for name of user:


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.println(userName + " is a nice name.");

        System.out.println("\nHow old are you, " + userName + "?");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userName + " and you are " + userAge + " years old.");

        System.out.println("\nHow tall are you in meters, " + userName + ", whom is "+ userAge + " years old?");
        double userHeight = scanner.nextDouble();
        System.out.println("Wow, I would have only guessed " + (userHeight - (double)0.2) + "m.");



//==================================

        int         age         = 27;
	    double      height      = 14.27;
	    char        userInput   = '\u4321';
	    String      name        = "Jeff";
        Scanner     keyRead           = new Scanner(System.in);
        String      input           = keyRead.next();

        System.out.println(input);

         */
    }
}
