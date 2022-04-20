package com.example.rps;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)

class RPSTest {
    @Spy RPS rpsSpy = spy(RPS.class);
// all rock tests
    @Test
    public void rockBeatsScissors() {
        when(rpsSpy.opponentMove()).thenReturn("scissors");
        assertEquals("You win", rpsSpy.result("rock"));
    }

    @Test
    public void rockLosesPaper() {
        when(rpsSpy.opponentMove()).thenReturn("paper");
        assertEquals("You lose", rpsSpy.result("rock"));
    }

    @Test
    public void rockTiesRock() {
        when(rpsSpy.opponentMove()).thenReturn("paper");
        assertEquals("You tied", rpsSpy.result("rock"));
    }

//// all paper tests
    @Test
    public void paperBeatsRock() {
    when(rpsSpy.opponentMove()).thenReturn("rock");
    assertEquals("You win", rpsSpy.result("paper"));
    }
//
    @Test
    public void paperLosesScissors() {
    when(rpsSpy.opponentMove()).thenReturn("scissors");
        assertEquals("You lose", rpsSpy.result("paper"));
    }
//
    @Test
    public void paperTiesPaper() {
when(rpsSpy.opponentMove()).thenReturn("paper");
        assertEquals("You tied!", rpsSpy.result("paper"));
    }
//
////all scissors tests
    @Test
    public void scissorsBeatPaper() {
        when(rpsSpy.opponentMove()).thenReturn("paper");
        assertEquals("You win", rpsSpy.result("scissors"));
    }
//
    @Test
    public void scissorsLosesRock() {
        when(rpsSpy.opponentMove()).thenReturn("rock");
        assertEquals("You lose", rpsSpy.result("scissors"));
    }
//
    @Test
    public void scissorsTiesScissors() {
        when(rpsSpy.opponentMove()).thenReturn("scissors");
        assertEquals("You tied!", rpsSpy.result("scissors"));
    }

}