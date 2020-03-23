// Gordon Bates
// gordondonphx@gmail.com
// github.com/jdoes
// started on 03/21/2020
// based on https://www.udemy.com/course/java-for-absolute-beginners under Arrays
// Purchase feeble public access cable show and exploit it

public class Main {

    public static void main(String[] args) {

 //=========================
 //EXERCISE 3:
        double [] myArray = new double[5];
        myArray[0] = 1.23;
        myArray[1] = 2.34;
        myArray[2] = 3.45;
        myArray[3] = 4.56;
        myArray[4] = 5.67;

        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }

        double avg = (double)sum/myArray.length;

        System.out.printf("The total is: %.3f", sum);
        System.out.printf("\nThe average is: %.3f", avg);


    }
}

//================================================
// EXERCISE 1 and 2:
//
//    int[] array = new int[20];
//    for (int i = 0; i < array.length; i++) {
//        array[i] = i + 1;
//    }
//
//    //Printed Backwards:
//    System.out.println("\nPrinted Backwards: ");
//	for (int i = array.length - 1; i >= 0; i--) {
//	    System.out.println(array[i]);
//
//    }
//    //Printed Forwards:
//	System.out.println("\nPrinted Forwards: ");
//	for (int i = 0; i < array.length; i++) {
//        System.out.println(array[i]);
//    }