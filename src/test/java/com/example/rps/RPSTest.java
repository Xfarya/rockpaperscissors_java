package com.example.rps;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RPSTest {

// all rock tests
    @Test
    public void rockBeatsScissors() {
        assertEquals("You win", RPS.result("rock", "scissors"));
    }

    @Test
    public void rockLosesPaper() {
        assertEquals("You lose", RPS.result("rock", "paper"));
    }

    @Test
    public void rockTiesRock() {
        assertEquals("You tied", RPS.result("rock", "rock"));
    }
// all paper tests
    @Test
    public void paperBeatsRock() {
        assertEquals("You win", RPS.result("paper", "rock"));
    }

    @Test
    public void paperLosesScissors() {
        assertEquals("You lose", RPS.result("paper", "scissors"));
    }

    @Test
    public void paperTiesPaper() {
        assertEquals("You tied!", RPS.result("paper", "paper"));
    }

//all scissors tests
@Test
    public void scissorsBeatPaper() {
    assertEquals("You win", RPS.result("paper", "rock"));
}

    @Test
    public void scissorsLosesRock() {
        assertEquals("You lose", RPS.result("paper", "scissors"));
    }

    @Test
    public void scissorsTiesScissors() {
        assertEquals("You tied!", RPS.result("paper", "paper"));
    }

}