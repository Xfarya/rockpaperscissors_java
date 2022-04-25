package com.example.rps;

import java.util.Random;

public class RPSOpponentMove {

    public static String[] rps = {"rock", "paper", "scissors"};

    public static void main(String[] args) {
    }

    public static String opponentMove(String choice) {
        if (!(choice.equals("a"))) {
            return choice;
        }
            return rps[new Random().nextInt(rps.length)];
    }
}
