package com.example.rps;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveGeneratorTest {

    MoveGenerator moveGenerator = new MoveGenerator();

    @Test
    @DisplayName("checks user input validity")
    public void isMyMoveValid() {
        assertFalse(moveGenerator.isMyMoveValid(""));
    }

    @Test
    public void isMyMoveValidExample2() {
        assertFalse(moveGenerator.isMyMoveValid("foo"));
    }

    @Test
    public void isMyMoveValidExample3() {
        assertFalse(moveGenerator.isMyMoveValid("11"));
    }

    @Test
    public void randomMoveGeneratesCorrectly() {
        String[] rps = {"rock", "paper", "scissors"};
        String randomChoice = moveGenerator.getRandomMove();
        assertTrue(Arrays.asList(rps).contains(randomChoice));
    }

    @Test
    public void randomMoveGeneratesCorrectlyExample2() {
        String[] rps = {"rock", "paper", "scissors"};
        String randomChoice = moveGenerator.getRandomMove();
        assertFalse(!Arrays.asList(rps).contains(randomChoice));
    }
}