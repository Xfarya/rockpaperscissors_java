package com.example.rps;

import java.util.Scanner;

public class RPSApp {

    public static int lossesCounter = 0;
    public static int winsCounter = 0;
    public static int drawsCounter = 0;

    static RPS rps = new RPS();

    public static void main(String[] args) {
        gamePlay();
        gameExitMessage();
       }

    public static void gamePlay() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter your move, Type in rock, paper, or scissors. To quit, press 'q'");
            System.out.print("\nI choose: ");
            String myMove = in.nextLine();

            if (myMove.equals("q")) {
                break;
            }
            String rpsResult = rps.result(myMove);
            System.out.print(rpsResult);
            gamesCounter(rpsResult);
        }
    }

    public static void gamesCounter(String rpsResult) {
        if (rpsResult.contains("You tied")) {
            drawsCounter += 1;
        } else if (rpsResult.contains("You win")) {
            winsCounter += 1;
        } else {
            lossesCounter += 1;
        }
    }

    public static void gameExitMessage() {
        System.out.println("\nThanks for playing! You won "
                + winsCounter
                + "/"
                + (drawsCounter + lossesCounter + winsCounter)
                + " games. well done!\n"
                + "\nwins: " + winsCounter
                + " || losses: "
                + lossesCounter
                + " || ties: "
                + drawsCounter);
    }
}
