package com.example.rps;

import java.util.Arrays;
import java.util.Random;

public class RPS {

    public static String result;
    public static String opponentMove;

    public static void main(String[] args) {
    }

    public String result(String myMove) {
        if (!isMyMoveValid(myMove)) {
            result = "Your move isn't valid";
        } else {
            opponentMove = opponentMove();
            if (opponentMove.equals(myMove)) {
                result = "You tied!";
            } else if (opponentMove.equals("scissors")) {
                result = "You win";
            } else if (opponentMove.equals("paper")) {
                result = "You lose";
            } else {
                if (myMove.equals("paper") && opponentMove.equals("rock")) {
                    result = "You win";
                } else if (myMove.equals("paper") && opponentMove.equals("scissors")) {
                    result = "You lose";
                } else if (myMove.equals("paper") && opponentMove.equals("paper")) {
                    result = "You tied!";
                } else {
                    if (myMove.equals("scissors") && opponentMove.equals("paper")) {
                        result = "You win";
                    } else if (myMove.equals("scissors") && opponentMove.equals("rock")) {
                        result = "You lose";
                    } else if (myMove.equals("scissors") && opponentMove.equals("scissors")) {
                        result = "You tied!";
                    }
                }
            }
        }
            return result;
    }

    public boolean isMyMoveValid(String myMove) {
        String[] rps = {"rock", "paper", "scissors"};
        return (Arrays.asList(rps).contains(myMove));
    };

    public String opponentMove() {
        String[] rps = {"rock", "paper", "scissors"};
        String computerMove = rps[new Random().nextInt(rps.length)];
        return computerMove;
    }

}

