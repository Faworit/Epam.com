package com.epam.zeroAndOne;

public class Run {

    public static void main(String[] args) {
        String str = "0101101011000";
        int a = WorkWithString.calculationDigitZero(str);
        System.out.println(a);
        WorkWithString wors = new WorkWithString();
        StringBuilder s = new StringBuilder(str);
        String result = wors.toCommonView(s);
        System.out.println(result);
    }
}
