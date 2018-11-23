package com.epam.strings;

import java.util.ArrayList;

public class Paragraph {
    String paragraph;
    private ArrayList<Paragraph> paragraphs = new ArrayList<>();

    Paragraph(String paragraph){
        this.paragraph = paragraph;
    }

    public String getParagraph() {
        return paragraph;
    }

    public ArrayList<Paragraph> getParagraphs() {
        return paragraphs;
    }
}
