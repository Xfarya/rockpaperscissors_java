package com.example.rps;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;

//
//
class RPSTest {
    RPS rps = new RPS();
    private static final RPSOpponentMove rpsOpponentMove = mock(RPSOpponentMove.class);

@Before
public void setUp() {

}
// all rock tests
    @Test
    public void rockBeatsScissors() {
        rps.setRPSOpponentMove(rpsOpponentMove);
        when(rpsOpponentMove.opponentMove()).thenReturn("scissors");
        assertEquals("Your opponent chose: scissors \nYou win!", rps.play("rock"));
    }


    @Test
    public void rockLosesPaper() {
        rps.setRPSOpponentMove(rpsOpponentMove);
        when(rpsOpponentMove.opponentMove()).thenReturn("paper");
        assertEquals("Your opponent chose: paper \nYou lose!", rps.play("rock"));
    }

    @Test
    public void rockTiesRock() {
        rps.setRPSOpponentMove(rpsOpponentMove);
        when(rpsOpponentMove.opponentMove()).thenReturn("rock");
        assertEquals("Your opponent chose: rock \nYou tied!", rps.play("rock"));
    }

//// all paper tests
    @Test
    public void paperBeatsRock() {
    rps.setRPSOpponentMove(rpsOpponentMove);
    when(rpsOpponentMove.opponentMove()).thenReturn("rock");
    assertEquals("Your opponent chose: rock \nYou win!", rps.play("paper"));
    }
//
    @Test
    public void paperLosesScissors() {
        rps.setRPSOpponentMove(rpsOpponentMove);
        when(rpsOpponentMove.opponentMove()).thenReturn("scissors");
        assertEquals("Your opponent chose: scissors \nYou lose!", rps.play("paper"));
    }
//
    @Test
    public void paperTiesPaper() {
        rps.setRPSOpponentMove(rpsOpponentMove);
when(rpsOpponentMove.opponentMove()).thenReturn("paper");
        assertEquals("Your opponent chose: paper \nYou tied!", rps.play("paper"));
    }
//
////all scissors tests
    @Test
    public void scissorsBeatPaper() {
        rps.setRPSOpponentMove(rpsOpponentMove);
        when(rpsOpponentMove.opponentMove()).thenReturn("paper");
        assertEquals("Your opponent chose: paper \nYou win!", rps.play("scissors"));
    }
//
    @Test
    public void scissorsLosesRock() {
        rps.setRPSOpponentMove(rpsOpponentMove);
        when(rpsOpponentMove.opponentMove()).thenReturn("rock");
        assertEquals("Your opponent chose: rock \nYou lose!", rps.play("scissors"));
    }
//
    @Test
    public void scissorsTiesScissors() {
        rps.setRPSOpponentMove(rpsOpponentMove);
        when(rpsOpponentMove.opponentMove()).thenReturn("scissors");
        assertEquals("Your opponent chose: scissors \nYou tied!", rps.play("scissors"));
    }

//user input validity
    @Test
    @DisplayName("checks user input validity")
    public void isMyMoveValid() {
        assertEquals("Your move isn't valid", rps.play(""));
    }

    @Test
    public void isMyMoveValidExample2() {
        assertEquals("Your move isn't valid", rps.play("jug"));
    }

    @Test
    public void isMyMoveValidExample3() {
        assertEquals("Your move isn't valid", rps.play("11"));
    }

}