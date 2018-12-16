package com.epam.zeroAndOne;


public class Run {

    public static void main(String[] args) {
        String firstString =  "0101101011000";
        String secondString = "0110101011000";
        String compareForCountDigit = CompareStrings.compareForCountDigits(firstString, secondString);
        System.out.println(compareForCountDigit);
        String result = CompareStrings.compareString(firstString, secondString);
        System.out.println(result);
    }
}
