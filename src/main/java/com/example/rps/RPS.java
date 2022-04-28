package com.example.rps;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class RPS {

    private static String result;
    private static String player2Move;
    private static String player1Move;

    public static void main(String[] args) {
    }

    public String play(String myMove, @NotNull String oppMove) {
        this.player2Move = oppMove;
        this.player1Move = myMove;
        decideWinner();
        return result;
    }

    private void decideWinner() {
        if (player2Move.equals(player1Move)) {
            result = "Player 1 chose " + player1Move + "\nPlayer 2 chose: " + player2Move + " \nBoth tied!";
        } else winnersMap();
    }

    private void winnersMap() {
        HashMap<String, String> winners = new HashMap<>();
        winners.put("rock", "scissors");
        winners.put("paper", "rock");
        winners.put("scissors", "paper");

        if (winners.get(player1Move).equals(player2Move)) {
            result = "Player 1 chose: " + player1Move + "\nPlayer 2 chose: " + player2Move + " \nPlayer 1 wins!";
        } else {
            result = "Player 1 chose: " + player1Move + "\nPlayer 2 chose: " + player2Move + " \nPlayer 1 loses!";
    }
    }

}


