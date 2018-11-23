package com.epam.strings;

import java.util.ArrayList;

public class Sentence {
    private String sentence;
    private ArrayList<Sentence> sentences = new ArrayList<>();

    Sentence(String sentence){
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }
}
