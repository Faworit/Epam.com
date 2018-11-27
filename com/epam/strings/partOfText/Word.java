package com.epam.strings.partOfText;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Word> words = new ArrayList<>();

    public Word(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public ArrayList<Word> getWords() {
        return words;
    }
}
