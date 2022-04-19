package com.example.rps;

public class RPS {

    public static String opponentMove = "scissors";
    public static String result;

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public static String rockVScissors(String rock) {
       if (opponentMove == "scissors") {
           result = "You win";
        }
       return result;
    }
}
