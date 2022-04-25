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

    private static void gamePlay() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter your move, Type in rock, paper, or scissors. \nTo play computer, press 'a' for player 2 \nTo quit, press 'q'");
            System.out.print("\nPlayer 1: ");
            String myMove = in.nextLine();
            String player2Move;
            String rockPaperScissorsOutcome = null;

            if (myMove.equals("q")) {
                break;
            }
            System.out.print("\nPlayer 2:");
                player2Move = in.nextLine();


                rockPaperScissorsOutcome = rps.play(myMove, player2Move);
                System.out.print(rockPaperScissorsOutcome);
                gamesCounter(rockPaperScissorsOutcome);
            }
    }

    private static void gamesCounter(String rockPaperScissorsOutcome) {
        if (rockPaperScissorsOutcome.contains("You tied")) {
            drawsCounter += 1;
        } else if (rockPaperScissorsOutcome.contains("You win")) {
            winsCounter += 1;
        } else if (rockPaperScissorsOutcome.contains("You lose")) {
            lossesCounter += 1;
        }
    }

    private static void gameExitMessage() {
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
