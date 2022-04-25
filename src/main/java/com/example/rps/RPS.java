package com.example.rps;

import java.util.Arrays;
import java.util.HashMap;

public class RPS {

    public static String result;
    RPSOpponentMove RPSOpponentMove = new RPSOpponentMove();
    public static String opponentMove;
    public static String[] rps = {"rock", "paper", "scissors"};

    public static void main(String[] args) {
    }

    public String play(String myMove) {
        if (!isMyMoveValid(myMove)) {
            result = "Your move isn't valid";
        } else {
            decideWinner(myMove);
        }
        return result;
    }

    private boolean isMyMoveValid(String myMove) {
        return (Arrays.asList(rps).contains(myMove));
    }

    private void decideWinner(String myMove) {
        opponentMove = RPSOpponentMove.opponentMove();
        if (opponentMove.equals(myMove)) {
            result = "Your opponent chose: " + opponentMove + " \nYou tied!";
        } else winnersMap(myMove, opponentMove);
    }

    private void winnersMap(String myMove, String opponentMove) {
        HashMap<String, String> winners = new HashMap<>();
        winners.put("rock", "scissors");
        winners.put("paper", "rock");
        winners.put("scissors", "paper");

        if (winners.get(myMove).equals(opponentMove)) {
            result = "Your opponent chose: " + opponentMove + " \nYou win!";
        } else {
            result = "Your opponent chose: " + opponentMove + " \nYou lose!";
    }
    }

    public void setRPSOpponentMove(com.example.rps.RPSOpponentMove rpsOpponentMove) {
        this.RPSOpponentMove = rpsOpponentMove;
    }

    public com.example.rps.RPSOpponentMove getRPSOpponentMove() {
        return RPSOpponentMove;
    }
}


