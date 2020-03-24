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

        System.out.println("What is the max score that can be achieved?");
        int maxScore = scanner.nextInt();

        System.out.println("How many students took the test?");
        int numStudent = scanner.nextInt();
        int [] scores = new int[numStudent];

        int count = 1;
        int sumScore = 0;
        for (int i = 0; i < numStudent; i++) {
            System.out.println("Enter the score for Student " + count + " in number of points: ");
            scores[i] = scanner.nextInt();
            sumScore = sumScore + scores[i];
            count++;
        }

        count = 1;
        for (int i = 0; i < numStudent; i++) {
            //System.out.println("Student " + count + " score = " + scores[i] + ", which is " +
                    //((double)scores[i]/maxScore)*100 + " %");
            System.out.printf("\nStudent %d score = %d, which is %.2f%%",
                    count, scores[i], ((double)scores[i]/maxScore)*100);
            count++;
        }

        int highScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }

        int lowScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < lowScore) {
                lowScore = scores[i];
            }
        }

        int avgScore = sumScore / numStudent;
        double highScorePercent = ((double)highScore/maxScore)*100;
        double avgPercent = ((double)avgScore/maxScore)*100;
        double lowScorePercent = ((double)lowScore/maxScore)*100;

        System.out.printf("\n\nHigh score = %d, which is %.2f%%.", highScore, highScorePercent);
        System.out.printf("\nAverage score = %d , which is %.2f%%.", avgScore, avgPercent);
        System.out.printf("\nLow score = %d, which is %.2f%%.", lowScore, lowScorePercent);
        System.out.println();

    }
}
