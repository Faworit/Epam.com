package com.epam.zeroAndOne;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithString {

    private String reverse(String string){
        StringBuilder r = new StringBuilder(string);
        r.reverse();
        String inverted = r.toString();
        return inverted;
    }

    public String toCommonView(StringBuilder s){
        boolean checkString;
        String forRegex  = s.toString();
        String subString;
        String inverted;
        String commonView = "";
        StringBuilder afterreplace = new StringBuilder();

        Matcher matcher = Pattern.compile("1{1}0{1,}1{2,}").matcher(forRegex);
        matcher.find();
        subString = matcher.group();
        inverted = reverse(subString);
        System.out.println(subString);
        System.out.println(inverted);
        String str = forRegex.replaceFirst("1{1}0{1,}1{2,}", inverted);
        afterreplace.append(str);
        System.out.println(afterreplace);
        checkString = forRegex.matches("1{1}0{1,}1{2,}"); // create new method where we will realize check and return boolean
        System.out.println(checkString);
        if(checkString){
            toCommonView(afterreplace);
        }
        else{
            commonView = afterreplace.toString();
        }

        return commonView;
    }

    static int calculationDigitOne(String string){
        int count = 0;
        char[] symbolsFromString = string.toCharArray();
        for (int i = 0; i < symbolsFromString.length; i++) {
            if(symbolsFromString[i]=='1'){
                count+=1;
            }
        }
        return count;
    }

    static int calculationDigitZero(String string){
        int count = 0;
        char[] symbolsFromString = string.toCharArray();
        for (int i = 0; i < symbolsFromString.length; i++) {
            if(symbolsFromString[i]=='0'){
                count+=1;
            }
        }
        return count;
    }
}
