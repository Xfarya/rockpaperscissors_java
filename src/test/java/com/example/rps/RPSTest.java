package com.example.rps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


//
//
class RPSTest {
    RPS rps = new RPS();

// all rock tests
    @Test
    public void rockBeatsScissors() {
        assertEquals("Player 1 chose: rock\n" +
                "Player 2 chose: scissors \n" +
                "Player 1 wins!", rps.play("rock", "scissors"));
    }

    @Test
    public void rockLosesPaper() {
        assertEquals("Player 1 chose: rock\n" +
                "Player 2 chose: paper \n" +
                "Player 1 loses!", rps.play("rock", "paper"));
    }

    @Test
    public void rockTiesRock() {
        assertEquals("Player 1 chose rock\n" +
                "Player 2 chose: rock \n" +
                "Both tied!", rps.play("rock", "rock"));
    }

//// all paper tests
    @Test
    public void paperBeatsRock() {
    assertEquals("Player 1 chose: paper\n" +
            "Player 2 chose: rock \n" +
            "Player 1 wins!", rps.play("paper", "rock"));
    }
//
    @Test
    public void paperLosesScissors() {
        assertEquals("Player 1 chose: paper\n" +
                "Player 2 chose: scissors \n" +
                "Player 1 loses!", rps.play("paper", "scissors"));
    }
//
    @Test
    public void paperTiesPaper() {
        assertEquals("Player 1 chose paper\n" +
                "Player 2 chose: paper \n" +
                "Both tied!", rps.play("paper", "paper"));
    }
//
////all scissors tests
    @Test
    public void scissorsBeatPaper() {
        assertEquals("Player 1 chose: scissors\n" +
                "Player 2 chose: paper \n" +
                "Player 1 wins!", rps.play("scissors", "paper"));
    }
//
    @Test
    public void scissorsLosesRock() {
        assertEquals("Player 1 chose: scissors\n" +
                "Player 2 chose: rock \n" +
                "Player 1 loses!", rps.play("scissors", "rock"));
    }
//
    @Test
    public void scissorsTiesScissors() {
        assertEquals("Player 1 chose scissors\n" +
                "Player 2 chose: scissors \n" +
                "Both tied!", rps.play("scissors", "scissors"));
    }

//user input validity
}