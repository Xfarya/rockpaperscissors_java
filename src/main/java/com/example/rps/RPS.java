package com.example.rps;

public class RPS {

    public static String result;

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static String result(String myMove, String opponentMove) {
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
            return result;
    }
}
