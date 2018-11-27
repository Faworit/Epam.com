package com.epam.strings.partOfText;

import java.util.ArrayList;

public class Paragraph {
    private String paragraph45;
    private ArrayList<Paragraph> paragraphs = new ArrayList<>();

    public Paragraph(String paragraph){
        this.paragraph45 = paragraph;
    }

    public String getParagraph() {
        return paragraph45;
    }

    public ArrayList<Paragraph> getParagraphs() {
        return paragraphs;
    }
}
