package com.epam.strings;

import com.epam.strings.partOfText.Paragraph;
import com.epam.strings.partOfText.Sentence;

import java.util.ArrayList;
import java.util.Collections;


public class Run {

    public static void main(String[] args) {
        String text = WorkWithFile.ReadFromFile();
        ArrayList<Paragraph> paragraphs;
        paragraphs = WorkWithText.parseToParagraph(text);
       /* for(int i=0; i<paragraphs.size(); i++) {

            Paragraph paragraph = paragraphs.get(i);
            String str = paragraph.getParagraph();
            System.out.println("    " + str);
        }*/
        ArrayList<Sentence> sentences;
        ArrayList<String> sortedSentences = new ArrayList<>();
        sentences = WorkWithText.parseToSentence(paragraphs);
        for(int i = 0; i<sentences.size(); i++){
            Sentence sentence = sentences.get(i);
            String str = sentence.getSentence();
            sortedSentences.add(str);
            //System.out.println(str);
        }

        ComparatorSentenses comp = new ComparatorSentenses();
        Collections.sort(sortedSentences, comp);
        for(String str : sortedSentences){
            System.out.println(str.length());
            System.out.println(str);
        }


    }
}
