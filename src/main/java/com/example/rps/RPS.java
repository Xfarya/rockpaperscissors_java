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

    public String play(String myMove, String oppMove) {
            opponentMove = RPSOpponentMove.opponentMove(oppMove);
        if (!isMyMoveValid(myMove)) {
            result = "Player 1 move isn't valid";
        }
        else if (!isMyMoveValid(opponentMove)) {
                result = "Player 2 move isn't valid"; }
        else {
            decideWinner(myMove);
        }
        return result;
    }

    private boolean isMyMoveValid(String move) {
        return (Arrays.asList(rps).contains(move));
    }

    private void decideWinner(String myMove) {
        if (opponentMove.equals(myMove)) {
            result = "Your opponent chose: " + opponentMove + " \nYou tied!";
        } else winnersMap(myMove);
    }

    private void winnersMap(String myMove) {
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

}


