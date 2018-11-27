package com.epam.strings.partOfText;

import java.util.ArrayList;

public class Sentence {
    private String sentence;
    private ArrayList<Sentence> sentences = new ArrayList<>();

    public Sentence(String sentence){
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }
}
