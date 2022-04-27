package com.example.rps;

import java.util.Arrays;
import java.util.Random;

public class MoveGenerator {

    private static String[] rps = {"rock", "paper", "scissors"};

    public static void main(String[] args) {
    }

    public static String getRandomMove(String choice) {
            return rps[new Random().nextInt(rps.length)];
    }

    boolean isMyMoveValid(String move) {
        return (Arrays.asList(rps).contains(move));
    }
}