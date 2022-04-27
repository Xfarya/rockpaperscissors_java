package com.example.rps;

import java.util.Arrays;
import java.util.Random;

public class MoveGenerator {

    private static final String[] rps = {"rock", "paper", "scissors"};

    public String getRandomMove(){
        return rps[new Random().nextInt(rps.length)];
    }

    boolean isMyMoveValid(String move) {
        return (Arrays.asList(rps).contains(move));
    }
}
