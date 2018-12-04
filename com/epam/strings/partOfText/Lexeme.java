package com.epam.strings.partOfText;

import java.util.ArrayList;

public class Lexeme {
    private String lexeme;
    private ArrayList<Word> lexemes = new ArrayList<>();

    public Lexeme(String word){
        this.lexeme = word;
    }

    public String getLexeme() {
        return lexeme;
    }

    public ArrayList<Word> getLexemes() {
        return lexemes;
    }
}
