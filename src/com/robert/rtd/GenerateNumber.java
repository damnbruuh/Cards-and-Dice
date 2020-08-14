package com.robert.rtd;

public class GenerateNumber {

    public int generateNumber(int max, int min) {

        int number = (int) (Math.random() * (max - min + 1) + min);

        return number;

    }
}
