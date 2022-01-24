package com.example.project;

public class GameNumber {

    private int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (rawNumber % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(rawNumber);
    }
}
