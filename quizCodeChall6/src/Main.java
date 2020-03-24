// Gordon Bates
// gordondonphx@gmail.com
// github.com/jdoes
// started on 03/24/2020
// based on https://www.udemy.com/course/java-for-absolute-beginners under Java Fundamentals Wrap Ups
// Coding Challenge 6: Exercise 2 Quiz Program
// Purchase feeble public access cable show and exploit it

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] question = new String[5];
	    question[0] = "Dogs are animals. True or False?";
        question[1] = "Animals do photosynthesis. True or False?";
        question[2] = "Dogs are bananas. True or False?";
        question[3] = "Ice cream is colder than body temperature. True or False?";
        question[4] = "Math are gud. True or False?";

        Boolean[] response = new Boolean[5];
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            response[i] = scanner.nextBoolean();
        }

        System.out.println("\n-------|||RESULTS|||-------");

        Boolean[] answer = new Boolean[5];
        answer[0] = Boolean.valueOf("True");
        answer[1] = Boolean.valueOf("False");
        answer[2] = Boolean.valueOf("False");
        answer[3] = Boolean.valueOf("True");
        answer[4] = Boolean.valueOf("True");

        int score = 0;
        int count = 1;
        for (int i = 0; i < response.length; i++) {
            if (response[i].equals(answer[i])) {
                System.out.println("You got #" + count + " correct. +1 point!");
                score++;
            }
            else if (!response[i].equals(answer[i])) {
                System.out.println("You got #" + count + " incorrect. 0 points :(");
            }
            count++;
        }

        System.out.println("\n-------|||SCORE|||-------");

        double percent = ((double)score/answer.length)*100;
        System.out.println("You scored " + score + " out of " + answer.length + "." +
                "\nThat is a "+ percent + "%.");

    }
}
