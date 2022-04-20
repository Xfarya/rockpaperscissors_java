package com.example.rps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;
import org.mockito.Spy;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;



class RPSTest {
    RPS rps = new RPS();
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
        when(rpsSpy.opponentMove()).thenReturn("rock");
        assertEquals("You tied!", rpsSpy.result("rock"));
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

//user input validity
    @Test
    @DisplayName("checks user input validity")
    public void isMyMoveValid() {
        assertEquals("Your move isn't valid", rps.result(""));
    }

    @Test
    public void isMyMoveValidExample2() {
        assertEquals("Your move isn't valid", rps.result("jug"));
    }

    @Test
    public void isMyMoveValidExample3() {
        assertEquals("Your move isn't valid", rps.result("11"));
    }

}