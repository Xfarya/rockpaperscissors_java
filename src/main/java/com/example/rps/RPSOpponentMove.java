package com.example.rps;

import java.util.Random;

public class RPSOpponentMove {

    public static String[] rps = {"rock", "paper", "scissors"};

    public static void main(String[] args) {
    }

    public String opponentMove() {
        return rps[new Random().nextInt(rps.length)];
    }

}
