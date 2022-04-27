package com.example.rps;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class RPS {

    private static String result;
    MoveGenerator moveGenerator = new MoveGenerator();
    private static String opponentMove;

    public static void main(String[] args) {
    }

    public String play(String myMove, @NotNull String oppMove) {
        opponentMove = oppMove;
        if (oppMove.equals("a")) {
            opponentMove = moveGenerator.getRandomMove();
        }
        if (!moveGenerator.isMyMoveValid(myMove)) {
            result = "Player 1 move is not valid";
        } else if (!moveGenerator.isMyMoveValid(opponentMove)) {
                result = "Player 2 move is not valid";
            } else {
            decideWinner(myMove);
        }
        return result;
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


