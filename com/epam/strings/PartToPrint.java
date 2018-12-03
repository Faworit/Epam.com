package com.epam.strings;

import com.epam.strings.partOfText.Paragraph;
import com.epam.strings.partOfText.Sentence;
import com.epam.strings.partOfText.Word;

import java.util.ArrayList;
import java.util.Collections;

public class PartToPrint {

    static void printParagraphs(ArrayList<Paragraph> paragraphs){
        for (int i = 0; i < paragraphs.size(); i++) {
            Paragraph paragraph = paragraphs.get(i);
            String str = paragraph.getParagraph();
            System.out.println("    " + str);
        }
    }

    static void printExerciseA(ArrayList<Sentence> sentences){
        ArrayList<String> sortedSentences = new ArrayList<>();
        for(int i = 0; i<sentences.size(); i++){
            Sentence sentence = sentences.get(i);
            String str = sentence.getSentence();
            sortedSentences.add(str);
            System.out.println(str);
        }
        ComparatorSentenses comp = new ComparatorSentenses();
        Collections.sort(sortedSentences, comp);
        for(String str : sortedSentences) {
            System.out.println(str.length());
            System.out.println(str);
        }
    }

    static void printSentences(ArrayList<Sentence> sentences){
        for(int i = 0; i<sentences.size(); i++){
            Sentence sentence = sentences.get(i);
            String str = sentence.getSentence();
            System.out.println(str);
        }
    }

    static void printWords(ArrayList<Word> words){
        for(int i = 0; i<words.size(); i++){
            Word word = words.get(i);
            String str = word.getWord();
            System.out.println(str);
        }
    }



}
