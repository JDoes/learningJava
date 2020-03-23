// Gordon Bates
// gordondonphx@gmail.com
// github.com/jdoes
// started on 03/22/2020
// based on https://www.udemy.com/course/java-for-absolute-beginners under Java Fundamentals Wrap Ups
// Purchase feeble public access cable show and exploit it

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        System.out.println("\nHere is how the board is laid out:\n(hint: think of the num pad layout)");
        System.out.println(" 7 | 8 | 9 ");
        System.out.println("---+---+---");
        System.out.println(" 4 | 5 | 6 ");
        System.out.println("---+---+---");
        System.out.println(" 1 | 2 | 3 ");

        Scanner scanner = new Scanner(System.in);
        int input;
        char turn = 'X';
        int currentTurn = 1;

        while (true) {
            do {
                System.out.println("\n" + turn + "'s turn.\nWhat position do you want to play?");
                input = scanner.nextInt();
            } while (pos[input - 1] == 'X' || pos[input - 1] == 'O');
            pos[input - 1] = turn;

            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " ");

            if (pos[0] == turn && pos[1] == turn && pos[2] == turn
                    || pos[3] == turn && pos[4] == turn && pos[5] == turn
                    || pos[6] == turn && pos[7] == turn && pos[8] == turn
                    || pos[0] == turn && pos[3] == turn && pos[6] == turn
                    || pos[1] == turn && pos[4] == turn && pos[7] == turn
                    || pos[2] == turn && pos[5] == turn && pos[8] == turn
                    || pos[0] == turn && pos[4] == turn && pos[8] == turn
                    || pos[2] == turn && pos[4] == turn && pos[6] == turn) {
                System.out.println(turn + " is the winner.");
                break;
            }

            if (turn == 'X') {
                turn = 'O';
            }
            else if (turn == 'O') {
                turn = 'X';
            }

            currentTurn++;
            if (currentTurn > 9) {
                System.out.println("DRAW!!! Nobody's loss - Nobody's win.");
                break;
            }

        }

    }
}

//"   |   |   "
//"---+---+---"
//"   |   |   "
//"---+---+---"
//"   |   |   "
