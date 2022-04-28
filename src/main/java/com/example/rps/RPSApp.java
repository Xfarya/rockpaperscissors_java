package com.example.rps;

import java.util.Scanner;


public class RPSApp {

    static RPS rps = new RPS();
    static MoveGenerator moveGenerator = new MoveGenerator();
    static ScoreCounter scoreCounter = new ScoreCounter();

    public static void main(String[] args) {
        gamePlay();
       }

    private static void gamePlay() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter your move, Type in rock, paper, or scissors. \nTo play computer, press 'a' for player 2 \nTo quit, press 'q'");
            System.out.print("\nPlayer 1: ");
            String myMove = in.nextLine();
            myMove = repeatUntilCorrectMove(myMove);
            if (myMove.equals("q")) {
                gameExitMessage();
                break;
            };

            String player2Move;
            String rockPaperScissorsOutcome = null;

            System.out.print("\nPlayer 2:");
            player2Move = in.nextLine();
            player2Move = repeatUntilCorrectMove(player2Move);
            if (player2Move.equals("q")) {
                gameExitMessage();
                break;
            };

            rockPaperScissorsOutcome = rps.play(myMove, player2Move);
            System.out.print(rockPaperScissorsOutcome);
            scoreCounter.gamesCounter(rockPaperScissorsOutcome);
        }
    }

    private static void gameExitMessage() {
        System.out.println("\nThanks for playing! You won "
                + scoreCounter.winsCounter
                + "/"
                + (scoreCounter.drawsCounter + scoreCounter.lossesCounter + scoreCounter.winsCounter)
                + " games. well done!\n"
                + "\nwins: " + scoreCounter.winsCounter
                + " || losses: "
                + scoreCounter.lossesCounter
                + " || ties: "
                + scoreCounter.drawsCounter);
    }


    private static String repeatUntilCorrectMove(String move) {
        Scanner in = new Scanner(System.in);
        while (true) {
            if (move.equals("q")) {
                return move;
            }
            if (move.equals("a")) {
                move = moveGenerator.getRandomMove();
            }
            else if (!moveGenerator.isMyMoveValid(move)) {
                System.out.println("Player move is not valid, please enter a valid move:\nPlayer: ");
                move = in.nextLine();
            } else {
                break;
            }
        }
        return move;
    }
}
