package com.example.rps;

public class ScoreCounter {
    public static int lossesCounter = 0;
    public static int winsCounter = 0;
    public static int drawsCounter = 0;

    public static void gamesCounter(String rockPaperScissorsOutcome) {
        if (rockPaperScissorsOutcome.contains("tied")) {
            drawsCounter += 1;
        } else if (rockPaperScissorsOutcome.contains("wins")) {
            winsCounter += 1;
        } else if (rockPaperScissorsOutcome.contains("loses")) {
            lossesCounter += 1;
        }
    }
}
