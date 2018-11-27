package com.epam.strings;

import com.epam.strings.partOfText.Paragraph;
import com.epam.strings.partOfText.Sentence;
import com.epam.strings.partOfText.Word;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkWithText {

    static ArrayList<Paragraph> parseToParagraph(String text){
        ArrayList<Paragraph> paragraphs = new ArrayList<>();
        String[] arrayOfParagraps = text.split("\\s{4}(\\s)");
        for(String s : arrayOfParagraps){
            Paragraph paragraph = new Paragraph(s);
            paragraphs.add(paragraph);
        }
        return paragraphs;
    }

    static ArrayList<Sentence> parseToSentence(ArrayList<Paragraph> paragraphs){
        ArrayList<Sentence> sentences = new ArrayList<>();
        for(int i = 0; i<paragraphs.size(); i++){
           String paragraph = paragraphs.get(i).getParagraph();
           String[] arrayOfSentences = paragraph.split("\\.(\\n)");
           for(int z = 0; z<arrayOfSentences.length; z++){
               arrayOfSentences[z].split(" ");
               Sentence sentence = new Sentence(arrayOfSentences[z]);
               sentences.add(sentence);
           }
        }
        return sentences;
    }

    static ArrayList<Word> parseToWords(ArrayList<Sentence> sentences){
        ArrayList<Word> words = new ArrayList<>();
        for(int i = 0; i<sentences.size(); i++){
            String sentense = sentences.get(i).getSentence();
            String[] arrayOfWords = sentense.split("\\b");
            Word word = new Word(arrayOfWords[i]);
            words.add(word);
        }

        return words;
    }



}
