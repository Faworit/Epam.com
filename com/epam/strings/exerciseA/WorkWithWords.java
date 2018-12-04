package com.epam.strings.exerciseA;

public class WorkWithWords {
    static String changeSymbol(String word){
        String wordWithChange = " ";
        char[] symbolsOfWord = word.toCharArray();
        int numberOfSymboltoChange = 3;
        char symbolToChangeInWord = '!';
        if (numberOfSymboltoChange < symbolsOfWord.length) {
            symbolsOfWord[numberOfSymboltoChange] = symbolToChangeInWord;
            for(int i = 0; i < symbolsOfWord.length; i++){
                wordWithChange += Character.toString(symbolsOfWord[i]);
            }
            return wordWithChange;
        }
        else{
            return word;
        }

    }
}
