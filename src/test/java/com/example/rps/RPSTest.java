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
        assertEquals("Your opponent chose: scissors \nYou win!", rps.play("rock", "scissors"));
    }

    @Test
    public void rockLosesPaper() {
        assertEquals("Your opponent chose: paper \nYou lose!", rps.play("rock", "paper"));
    }

    @Test
    public void rockTiesRock() {
        assertEquals("Your opponent chose: rock \nYou tied!", rps.play("rock", "rock"));
    }

//// all paper tests
    @Test
    public void paperBeatsRock() {
    assertEquals("Your opponent chose: rock \nYou win!", rps.play("paper", "rock"));
    }
//
    @Test
    public void paperLosesScissors() {
        assertEquals("Your opponent chose: scissors \nYou lose!", rps.play("paper", "scissors"));
    }
//
    @Test
    public void paperTiesPaper() {
        assertEquals("Your opponent chose: paper \nYou tied!", rps.play("paper", "paper"));
    }
//
////all scissors tests
    @Test
    public void scissorsBeatPaper() {
        assertEquals("Your opponent chose: paper \nYou win!", rps.play("scissors", "paper"));
    }
//
    @Test
    public void scissorsLosesRock() {
        assertEquals("Your opponent chose: rock \nYou lose!", rps.play("scissors", "rock"));
    }
//
    @Test
    public void scissorsTiesScissors() {
        assertEquals("Your opponent chose: scissors \nYou tied!", rps.play("scissors", "scissors"));
    }

//user input validity
    @Test
    @DisplayName("checks user input validity")
    public void isMyMoveValid() {
        assertEquals("Your move isn't valid", rps.play("", "paper"));
    }

    @Test
    public void isMyMoveValidExample2() {
        assertEquals("Your move isn't valid", rps.play("jug", "paper"));
    }

    @Test
    public void isMyMoveValidExample3() {
        assertEquals("Your move isn't valid", rps.play("11", "paper"));
    }

    @Test
    @DisplayName("checks user input validity")
    public void isPlayer2Valid() {
        assertEquals("Your move isn't valid", rps.play("paper", ""));
    }

    @Test
    public void isPlayer2ValidExample2() {
        assertEquals("Your move isn't valid", rps.play("paper", "jug"));
    }

    @Test
    public void isPlayer2ValidExample3() {
        assertEquals("Your move isn't valid", rps.play("paper", "11"));
    }

}