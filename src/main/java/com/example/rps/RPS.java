package com.example.rps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class RPS {

    public static String result;
    public static String opponentMove;
    public static String[] rps = {"rock", "paper", "scissors"};

    public static void main(String[] args) {
    }

    public String result(String myMove) {
        if (!isMyMoveValid(myMove)) {
            result = "Your move isn't valid";
        } else {
            decider(myMove);
        }
        return result;
    }

    public boolean isMyMoveValid(String myMove) {
        return (Arrays.asList(rps).contains(myMove));
    }

    public String opponentMove() {
        String opponentMove = rps[new Random().nextInt(rps.length)];
        return opponentMove;
    }

    public String decider(String myMove) {
        opponentMove = opponentMove();
        if (opponentMove.equals(myMove)) {
            result = "Your opponent chose: " + opponentMove + " \nYou tied!";
        } else {
            winnersMap(myMove, opponentMove);
        }
        return result;
    }

    public String winnersMap(String myMove, String opponentMove) {
        HashMap<String, String> winners = new HashMap<String, String>();
        winners.put("rock", "scissors");
        winners.put("paper", "rock");
        winners.put("scissors", "paper");

        if (winners.get(myMove).equals(opponentMove)) {
            result = "Your opponent chose: " + opponentMove + " \nYou win!";
        } else {
            result = "Your opponent chose: " + opponentMove + " \nYou lose!";
    }
        return result;
    }

}


