package com.example.rps;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RPSTest {
    String opponentMove = "scissors";

    @Test
    public void rockBeatsScissors() {
        assertEquals("You win", RPS.rockVScissors("rock"));
    }
}