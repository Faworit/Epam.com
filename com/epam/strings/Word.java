package com.epam.strings;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Word> words = new ArrayList<>();

    Word(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public ArrayList<Word> getWords() {
        return words;
    }
}
