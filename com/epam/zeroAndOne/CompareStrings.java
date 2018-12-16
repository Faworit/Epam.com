package com.epam.zeroAndOne;

public class CompareStrings {

    static String compareForCountDigits(String firstString, String secondString){
        String result = "For count one and zero strings is ";
        int countZeroFirstString = WorkWithString.calculationDigitZero(firstString);
        int countDigitOneFirstString = WorkWithString.calculationDigitOne(firstString);
        int countZeroSecondString = WorkWithString.calculationDigitZero(secondString);
        int countDigitOneSecondString = WorkWithString.calculationDigitOne(secondString);
        if(countDigitOneFirstString==countDigitOneSecondString && countZeroFirstString==countZeroSecondString){
            result += "equal";
            System.out.println(result);
        }
        else{
            result += "not equal";
        }
        return result;
    }

    static String compareString(String firstString, String secondString){
        String result = "Strings is ";
        WorkWithString wors = new WorkWithString();
        StringBuilder sbFirstString = new StringBuilder(firstString);
        String commonViewFirstString = wors.checkOfCommonView(sbFirstString);
        System.out.println(commonViewFirstString);
        StringBuilder sbSecondString = new StringBuilder(secondString);
        String commonViewSecondString = wors.checkOfCommonView(sbSecondString);
        System.out.println(commonViewSecondString);
        String str = new String(commonViewFirstString);
        String str1 = new String(commonViewSecondString);
        if (str.equals(str1)){
            result += "equal";
        }
        else {
            result += "not equal";
        }
        return result;
    }
}
