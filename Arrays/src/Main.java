// Gordon Bates
// gordondonphx@gmail.com
// github.com/jdoes
// started on 03/21/2020
// based on https://www.udemy.com/course/java-for-absolute-beginners under Arrays
// Purchase feeble public access cable show and exploit it


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of laps: ");
        int numLaps = scanner.nextInt();
        double[] lapTimes = new double[numLaps];

        double sumTime = 0;
        int count = 1;
        for (int i = 0; i < numLaps; i++) {
            System.out.printf("Lap %d time, in seconds: ", count);
            lapTimes[i] = scanner.nextDouble();
            sumTime = sumTime + lapTimes[i];
            count++;
        }

        double fastTime = lapTimes[0];
        for (int i = 1; i < lapTimes.length; i++) {
            if (lapTimes[i] < fastTime) {
                fastTime = lapTimes[i];
            }
        }

        System.out.printf("\nThe total time for the %d laps was %.3f seconds.", numLaps, sumTime);
        System.out.printf("\nThe fastest time was %.3f seconds.", fastTime);
        double meanTime = (double)sumTime / numLaps;
        System.out.printf("\nThe average time is %.3f seconds.", meanTime);

    }
}


//===============================================================
//int[] array = {75, 7, 4192, 1231, 4546, 3453, 3423, 345345, 4675467, 2, 4, 6, 8};      //the array "array" contains n elements.
//    //positions are called index
//    int count = 0;
//
//        for (int i = array.length -1; i >= 0; i--) { //array.length is the number of elements
//                if (array[i]%2 == 0 && array[i] > 1000) {
//                System.out.println(array[i]);
//                count++;
//                }
//                }
//
//                System.out.printf("There are %d even numbers, greater than 1,000 in this array.", count);

//==================================================================
//Scanner scanner = new Scanner(System.in);
//    int[] array = {5654, 7344, 4192, 1231, 4546, 3453, 3423};      //the array "array" contains n elements.
//    //positions are called index
//    int count = 0;
//    int sumOfArray = 0;
//
//        System.out.println("Above what value do you want the number of values?");
//                int floor = scanner.nextInt();
//
//                for (int i = 0; i < array.length; i++) { //array.length is the number of elements
//        if (array[i] > floor){
//        count++;
//
//        }
//
//        sumOfArray = sumOfArray + array[i];
//        }
//
//        System.out.printf("Number of values greater than 4000: %d", count);
//        double mean = (double)sumOfArray / array.length;
//        System.out.printf("\nThe average is: %.3f",mean );

//===========================================================================
//        boolean [] foo = {true, false, false, true, true};
//        double [] bar = new double[3];
//
//        for (int i = 0; i < bar.length; i++) {
//            System.out.println(bar[i]);
//        }
//        for (int i = 0; i < foo.length; i++) {
//            System.out.println(foo[i]);
//        }

//==============================================================================
//        to do randomness, you are going to need:
//        import java.util.concurrent.ThreadLocalRandom;
//
//        Scanner scanner = new Scanner(System.in);
//
//        //If you add a prediction option, make sure you also change
//        // the array dimension "n", in String[n] on the next line
//        String [] predictions = new String[5];
//        predictions[0] = "a pioneer";
//        predictions[1] = "loved by many";
//        predictions[2] = "a leader in the electronic frontier";
//        predictions[3] = "a fire truck";
//        predictions[4] = "an absolute legend";
//
//        System.out.print("I will predict your future. Choose 1 - " + predictions.length + ": ");
//        int choice = scanner.nextInt();
//
//        System.out.println("In your future, you will be " + predictions[choice-1] + ".");
//
//        System.out.println("\nDo you want to go for a random fortune? yes/no");
//        String randFort = scanner.next();
//        if (!randFort.equals("yes") && !randFort.equals("no")) {
//            System.out.println("You must answer in the form \"yes\" or \"no\".");
//        }
//        else if (randFort.equals("yes")) {
//            int randChoice = ThreadLocalRandom.current().nextInt(0, predictions.length);
//            System.out.println("\nIn your future, you will be " + predictions[randChoice] + ".");
//            System.out.println("Thanks for participating.\n\nDo you think you can improve this program. Give it a try!");
//            System.out.println("How about not having three different print lines in this part of the code?\nOr maybe " +
//                    "if you dont enter \"yes\" or \"no\" the right way, \nit will loop back and ask you again..." +
//                    "\n\nSky's the limit. Try to make an improvement to this program! :) ");
//        }
//        else {
//            System.out.println("Okay, thanks, have a good day!");
//        }