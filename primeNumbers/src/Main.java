// Gordon Bates
// gordondonphx@gmail.com
// github.com/jdoes
// started on 03/22/2020
// based on https://www.udemy.com/course/java-for-absolute-beginners under Java Fundamentals Wrap Ups
// Purchase feeble public access cable show and exploit it

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Up to what limit do you want to list all primes?");
        long lim = scanner.nextLong();
        long num;
        long div;
        long count = 0;

        for (num = 2; num < lim; num++) {
            boolean isPrime = true;
            for (div = 2; div * div < num; div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                double ratio = (double)count/num;
                System.out.printf("\n%d is the %dth prime number, and the ratio of term number to value is %.5f.", num, count, ratio);
            }
        }
    }
}

//    Scanner scanner = new Scanner(System.in);
//        System.out.println("What number do you want to check if it's prime?");
//                long num = scanner.nextLong();
//                long div;
//                boolean isPrime = true;
//
//                for (div = 2; div < num; div++) {
//        if (num % div == 0) {
//        isPrime = false;
//
//        break;
//        }
//
//        }
//        if (isPrime) {
//        System.out.printf("%d is prime. It has exactly two distinct factors: 1 and itself.", num);
//        }
//        else {
//        System.out.printf("%d is not prime. At least one of its factors is %d.", num, div);
//        }