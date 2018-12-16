package com.epam.zeroAndOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithString {

    public String checkOfCommonView(StringBuilder s){
        String result;
        boolean con;
        do {
            StringBuilder strb = toCommonView(s);
            String fromBuilder = strb.toString();
            Matcher matcher = Pattern.compile("1{1}0{1,}1{2,}").matcher(fromBuilder);
            con = matcher.find();
            s=strb;
        }
        while(con);
        result = s.toString();

        return result;
    }

    private String reverse(String string){
        StringBuilder r = new StringBuilder(string);
        r.reverse();
        String inverted = r.toString();
        return inverted;
    }

    private StringBuilder replaceSubstring(String subStringMatcherReversible, StringBuilder s){
        String forReplace = s.toString();
        String afterReplace = forReplace.replaceFirst("1{1}0{1,}1{2,}", subStringMatcherReversible);
        StringBuilder stringBuilder = new StringBuilder(afterReplace);

        return stringBuilder;
    }

    private StringBuilder toCommonView(StringBuilder s){
        String subStringMatcher;
        String reversible;
        String fromBuilder = s.toString();
        Matcher matcher = Pattern.compile("1{1}0{1,}1{2,}").matcher(fromBuilder);
        matcher.find();
        subStringMatcher = matcher.group();
        reversible = reverse(subStringMatcher);
        s = replaceSubstring(reversible, s);

        return s;
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
