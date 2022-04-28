package com.example.rps;

import org.jetbrains.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreCounterTest {

    ScoreCounter scoreCounter = new ScoreCounter();
    RPS rps = new RPS();
    RPSApp rpsApp = new RPSApp();

    @Test
    public void checkAdditionForTies() {
        String outcome = rps.play("rock", "rock");
        ScoreCounter.gamesCounter(outcome);
        assertEquals(1, scoreCounter.drawsCounter);
    }

    @Test
    public void checkAdditionForWins() {
        String outcome = rps.play("rock", "scissors");
        ScoreCounter.gamesCounter(outcome);
        assertEquals(1, scoreCounter.winsCounter);
    }

    @Test
    public void checkAdditionForLosses() {
        String outcome = rps.play("rock", "paper");
        ScoreCounter.gamesCounter(outcome);
        assertEquals(1, scoreCounter.lossesCounter);
    }

}