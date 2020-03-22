//Gordon Bates
//Started on 03/17/2020
//github.com/jdoes
//gordonphx@gmail.com
//Udemy URL: https://www.udemy.com/course/java-for-absolute-beginners , under Loops
//Purchase feeble public cable access television show and exploit them.


import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String again;

    	do {
			int num = ThreadLocalRandom.current().nextInt(1, 7);
			System.out.format("You rolled a %d.", num);
			System.out.println("\nRoll again? y/n: ");
			again = scanner.next();
		} while(again.equals("y"));

    	if (again.equals("n")) {
			System.out.println("Okay, thanks for playing.");
		}
	}
}


//	int i = 1;
//	while (i <= 5) {
//	    System.out.println(i);
//	    i += 1;
//    }

//    	Scanner scanner = new Scanner(System.in);
//    	System.out.println("How high do you want to count?");
//    	int y = scanner.nextInt();
//    	for (int i = 0; i <= y; i++) {
//    		System.out.format("Test for %d \n", i);
//		}

//    	System.out.println("How high do you want to count?");
//    	int x = scanner.nextInt();
//    	int j = 0;
//    	while (j <= x) {
//    		System.out.format("Counting: %d \n", j);
//    		//j = j + 1; this and the next two lines all do the same thing, just different syntax
//    		//j += 1;
//    		j++;
//		}

//    	for (int i = 1; i <=16; i++) {
//    		if (i%2 == 0) {
//    			continue;
//			}
//    		System.out.println(i);
//		}